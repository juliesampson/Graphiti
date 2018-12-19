package graphiti.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.ButtonGroup;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import graphiti.DirectedGraph;
import graphiti.util.GraphitiConfigDefaults;
import graphiti.util.GraphitiDefaultStrings;
import layout.SpringUtilities;

/**
 * Note: my intent was to slap on a "simple" interactive ui for editing the graph
 * I obviously forgot that while swing is powerful, it can be cumbersome without templates
 * 
 * TODO: (List)
 * -figure out layout
 * -hook up event handling
 * -hook up with model (aka DirectedGraph.java) via some service
 * -hook up log service
 * 
 * The list of things to hook up suggests the need for a 
 * "UIManager" interface to manage deliver of all these handles
 * 
 * This assignment is lacking a clear controller piece among other things
 * 
 * DISCLAIMER: this is not ready for anything BUT to possibly glean what
 * the overall design direction is. Good or bad some thought is being funneled into it
 * maybe not captured as well as it could
 *
 */
public class GraphBuilderUI extends JFrame implements Observer {

	private static final long serialVersionUID = 1L;
	private String filePath = GraphitiConfigDefaults.DEFAULT_INPUT_DATA_FILE;
	private String graphName = GraphitiConfigDefaults.DIRECTED_GRAPH_NAME;
	private DirectedGraph diGraph1;
	private ArrayList<MethodTimer> stopWatch;
	
	
	JPanel mainPanel;
	
	GraphBuilderUI() {
		/**
		 * TODO: get the handle to shared graph from a UI Manager
		 */
		diGraph1 = new DirectedGraph(graphName);
		diGraph1.addObserver(this);
		super.setTitle(GraphitiDefaultStrings.APP_NAME);
		setup();
		addComponents();
		setVisible(true);

	}

	/**
	 * TODO: 
	 */
	@Override
	public void update(Observable o, Object arg) {
		reBuildDisplayPanel();	
	}
	
	/**
	 * TODO: this is the panel that displays the graph structure
	 * when the model changes, this is called to refresh its view
	 */
	private void reBuildDisplayPanel() {
		
	}
	private void addComponents() {
	
		JLabel title = new JLabel(MessageFormat.format(GraphitiDefaultStrings.BUILDER_PANEL_HEADER_LABEL, graphName));

		mainPanel.add(title, BorderLayout.NORTH);
		mainPanel.add(buildSelectionPanel(), BorderLayout.WEST);
		mainPanel.add(buildAttributesPanel(), BorderLayout.CENTER);
		mainPanel.add(buildDisplayPanel(), BorderLayout.EAST);
			
	}
	
	private JPanel buildSelectionPanel() {
		
		JPanel sPanel = new JPanel();
		JRadioButton v = new JRadioButton("Vertex");
		//v.addActionListener(this);
		sPanel.add(v);
		
		JRadioButton e = new JRadioButton("Edge");
		//e.addActionListener(this);
		sPanel.add(e);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(v);
		bg.add(e);
		
		return sPanel;
		
	}
	/**
	 * TODO: was playing around with SpringLayout and found a utilities class
	 * on the oracle dev site. Forgot how much of a struggle layout as well as 
	 * grouping of related components can be. normally you would have custom components for 
	 * an application like:
	 * class myCustomPanelWithGroups extends JPanel
	 * or something like that that you can use to build simple uis
	 * with the desired goodies that you need
	 */
	private JComponent buildAttributesPanel() {
		
		JPanel vPanel = new JPanel(new SpringLayout());
		JPanel ePanel = new JPanel(new SpringLayout());
		String [] edges = {"Name", "Origin", "Destination", "Weight"};
		String verName = "Name";
		

		for (int i=0; i <edges.length; i++) {
			JLabel label = new JLabel(edges[i], SwingConstants.LEFT);
			ePanel.add(label);
			JTextField txtField = new JTextField();
			ePanel.add(txtField);
			
			if ( i == 0 ) {
				JLabel l2 = new JLabel(verName, SwingConstants.LEFT);
				vPanel.add(l2);
				JTextField vert = new JTextField();
				vPanel.add(vert);
			}
		}
		
		SpringUtilities.makeCompactGrid(ePanel,
                4, 2, 
                6, 6,       
                6, 6); 
		
		SpringUtilities.makeCompactGrid(vPanel,
                1, 2, 
                6, 6,       
                6, 6);  
		JSplitPane attrPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, vPanel, ePanel);

		return attrPane;
	}

	private JPanel buildDisplayPanel() {
		JPanel dPanel = new JPanel();
		dPanel.add(new JLabel(graphName));
		return dPanel;
		
	}
	private void setup() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.setMinimumSize(new Dimension(500, 300 ));
		mainPanel = new JPanel(new BorderLayout());
		mainPanel.setToolTipText(graphName);
		addComponents();
		this.add(mainPanel);
		setVisible(true);
	
	}
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new GraphBuilderUI();
			}
		});
	}
	
	
	/**
	 * TODO: use this to wrap the insert, update, remove, and traverse graph functions
	 * for performance tests and benchmarking for code updates/changes. This utility probably 
	 * doesn't belong in the UI layer. Move it else where
	 * 
	 * TODO: MOVE THIS 
	 */
	private class MethodTimer {
		private String methodName;
		private long startTime;
		private long endTime;
		
		public String getMethodName() {
			return methodName;
		}
		
		public void setMethodName(String methodName) {
			this.methodName = methodName;
		}
	
		public long getStartTime() {
			return startTime;
		}
	
		public void setStartTime(long startTime) {
			this.startTime = startTime;
		}

		public long getEndTime() {
			return endTime;
		}
	
		public void setEndTime(long endTime) {
			this.endTime = endTime;
		}
	}

}

package graphiti;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import graphiti.comp.Vertex;
import graphiti.util.GraphitiConfigDefaults;

/**
 * @author Julie Sampson
 *
 */

class VertexTest {

	public static final String defaultVertexName = GraphitiConfigDefaults.DEFAULT_VERTEX_NAME;
	public static final int defaultDegree = GraphitiConfigDefaults.DEFAULT_VERTEX_DEGREE;
	public static final int defaultOutDegree = GraphitiConfigDefaults.DEFAULT_VERTEX_DEGREE_OUT;
	
	/**
	 * Test method for {@link graphiti.comp.Vertex#Vertex(java.lang.String)}.
	 */
	@ParameterizedTest
	@CsvSource({"V, V", ",DefaultVertexName", "\n,DefaultVertexName"})
	void testVertexString(String name, String expected) {

		Vertex vertex = new Vertex(name);
		assertEquals(expected, vertex.getName());
	}
	
	/**
	 * Test method for {@link graphiti.comp.Vertex#Vertex(java.lang.String, int, int)}.
	 */
	@ParameterizedTest
	@CsvSource({"0,0,0", "1,2,3", "2,1,3", "-3,4,0", "5,-6,0", "-7,-8,0" })
	void testVertexStringIntInt(int inDegree, int outDegree, int expected) {
	

			Vertex vertex = new Vertex(defaultVertexName, inDegree, outDegree);
			assertEquals(expected, vertex.getDegree());
	}
	



}

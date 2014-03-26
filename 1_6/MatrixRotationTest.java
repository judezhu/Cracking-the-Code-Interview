import static org.junit.Assert.*;

import org.junit.Test;


public class MatrixRotationTest {

	@Test
	public void test() {
//		assertArrayEquals({{7,4,1}, {8,5,2},{9,6,3}}, {{1,2,3},{4,5,6},{7,8,9}});
		int[][] s1 = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] s2 = {{7,4,1}, {8,5,2},{9,6,3}};
		assertArrayEquals(s2, MatrixRotation.matrixRotation(s1, 3));
	//	assertArrayEquals(s1, s2);
	}

}

import static org.junit.Assert.*;

import org.junit.Test;


public class ReplaceSpaceTest {

	@Test
	public void test() {
//		System.out.println(ReplaceSpace.replaceSpace("a b".toCharArray()));
		assertArrayEquals("a%20b".toCharArray(), ReplaceSpace.replaceSpace("a b".toCharArray()));
	}

}

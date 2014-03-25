import static org.junit.Assert.*;

import org.junit.Test;


public class RemoveDuplicateTest {

	@Test
	public void test1() {
		assertArrayEquals("aplee".toCharArray(), RemoveDuplicate.removeDuplicate("apple".toCharArray()));
	}
	
	@Test
	public void test2() {
		assertArrayEquals("abbb".toCharArray(), RemoveDuplicate.removeDuplicate("aabb".toCharArray()));
	}

}

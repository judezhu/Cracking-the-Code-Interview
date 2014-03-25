import static org.junit.Assert.*;

import org.junit.Test;


public class ReverseStringTest {

	@Test
	public void testReverse() {
		assertEquals("olleh", ReverseString.reverseString("hello"));
	}

}

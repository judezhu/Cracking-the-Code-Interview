import static org.junit.Assert.*;

import org.junit.Test;


public class AnagramTest {

	@Test
	public void testCorrect() {
		assertTrue(Anagram.isAnagram("str", "trs"));
	}
	
	@Test
	public void testWrong() {
		assertFalse(Anagram.isAnagram("str", "trr"));
	}
}

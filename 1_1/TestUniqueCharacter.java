import static org.junit.Assert.*;

import org.junit.Test;



public class TestUniqueCharacter {

	@Test
	public void testUnique() {
		assertTrue(UniqueCharacter.isCharacterUnique("string"));
	}
	
	@Test
	public void testNotUnique() {
		try{
		assertTrue("This string doesn't have unique characters", UniqueCharacter.isCharacterUnique("strinn"));
		}
		catch(AssertionError e){
			System.out.println(e.getMessage());
		}
		
	}
	

	@Test
	public void testUniqueOneTemp() {
		assertTrue(UniqueCharacter.isCharacterUnique("string"));
	}
	
	@Test
	public void testNotUniqueOneTemp() {
		try{
		assertTrue("This string doesn't have unique characters", UniqueCharacter.isCharacterUnique("strinn"));
		}
		catch(AssertionError e){
			System.out.println(e.getMessage());
		}
		
	}

}

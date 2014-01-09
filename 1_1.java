import java.util.HashSet;
import java.util.Scanner;


public class UniqueCharacter {
	
	public static boolean isCharacterUnique(String str){
		HashSet<Character> charCount = new HashSet<Character>();
		
		for(int i =0; i<str.length();i++){
			if(charCount.contains(str.charAt(i))){
				return false;
			
			}
			else{
				charCount.add(str.charAt(i));
			}
		}
		return true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your string:");
		
		String in = input.nextLine();
		

		if(isCharacterUnique(in)){
			System.out.println("All unqiue");
		}
		else{
			System.out.println("Not all unqiue");
		}

		input.close();
	}

}
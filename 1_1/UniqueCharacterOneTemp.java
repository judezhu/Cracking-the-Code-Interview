
import java.util.Scanner;

/**
 * Allows only 26 characters
 * @author jude
 */
public class UniqueCharacterOneTemp {

	public static boolean isCharacterUnique(String str){
		int checker = 0;
		int val;
		for(int i =0; i<str.length();i++){
			val=str.charAt(i)-'a';
			if((checker & (1<<val))>0){
				return false;
			}
			else{
				checker |= (1<<val) ;
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


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
}

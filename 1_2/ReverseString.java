
/**
 * Tricky point: only loop half of the string
 * @author jude
 *
 */
public class ReverseString {
	public static String reverseString(String str){
		int length = str.length()-1;
		char[] arrayTemp = str.toCharArray();
		char temp;
		for(int i = 0; i < str.length()/2; i++ ){

			temp = arrayTemp[i];
			arrayTemp[i] = arrayTemp[length-i];
			arrayTemp[length-i] = temp;		
		}
		String newStr = new String(arrayTemp);
		return newStr;
	}
}

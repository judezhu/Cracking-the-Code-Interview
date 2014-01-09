import java.util.Arrays;
import java.util.Scanner;


public class Anagram {
	
	public static boolean isAnagram(String str1,String str2){
		char[] temp1 = str1.toCharArray();
				Arrays.sort(temp1);
		char[] temp2 = str2.toCharArray();
				Arrays.sort(temp2);
		return new String(temp1).equals(new String(temp2)); 
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your first string:");
		String first = input.nextLine();
		System.out.println("Please enter your second string:");
		String second = input.nextLine();
		
		if(isAnagram(first, second)){
			System.out.println("Anagram");
		}
		else{
			System.out.println("Not Anagram");
		}
		input.close();
	}

}

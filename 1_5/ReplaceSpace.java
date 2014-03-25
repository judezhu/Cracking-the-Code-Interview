import java.util.Scanner;


public class ReplaceSpace {

	public static char[] replaceSpace(char[] charArray){
		int spaceCount = 0;
		int length = charArray.length;
		for(int i=0; i<length; i++){
			if(charArray[i] == ' '){
				spaceCount++;
			}
		}
		System.out.println(spaceCount);
		
		int newLength = length + 2*spaceCount;
		
		char[] newCharArray = new char[newLength];
		//newCharArray[newLength] = '\0';
		
		for(int i= (length-1); i>=0; i--){
		
			if(charArray[i] == ' ')
			{
				
				newCharArray[spaceCount * 2 + i] = '0';
				newCharArray[spaceCount * 2 + i-1] = '2';
				newCharArray[spaceCount * 2 + i-2] = '%';
				spaceCount--;
			}
			else{
				newCharArray[i+spaceCount *2] = charArray[i];
			}
		}
		return newCharArray;

	}
}

/** Design an algorithm and write code to remove the duplicate characters in a string without using any additional buffer. NOTE: One or two additional variables are fine. An extra copy of the array is not.
 **/

import java.util.Scanner;
public class RemoveDuplicate {

	public static char[] removeDuplicate(char[] str){

		//if temp is null
		if(str == null){
			return null;
		}

		else{
			//else 

			int l = str.length; // length of the original string
			int cursor = 0; // index of the new string

			//for loop for travesing the original string
			for(int i = 0 ; i < l; i++ ){

				//find the next non-duplicate character, keep it staying in the array

				int j;

				for(j = 0 ; j < cursor; j++){

					if(str[i] == str[j]){
						break; 
					}	
				}

				if(j == cursor){
					str[cursor] = str[i];
					cursor++;
				}
			}
//			str[cursor]=0;
//			System.out.println(str);
			return str;

		}
	}
}

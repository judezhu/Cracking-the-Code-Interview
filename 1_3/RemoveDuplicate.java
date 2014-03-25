import java.util.Scanner;


public class RemoveDuplicate {

	public static char[] removeDuplicate(char[] temp){
		int length = temp.length;
		int tail = 1;
		if(length  <= 1  ){
			return temp;
		}
		else{
			for(int i = 1; i < length; i++){
				int j;
				for(j = 0; j < tail; j++){
					if(temp[j] == temp[i])
						break;
				}
				if(j == tail){
					temp[tail] = temp[i];
					tail++;
				}
			}
			if(tail == length){
				return temp;
			}
			else{
				temp[tail] = 0;
				return temp;
			}
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your string:");
		String in = input.nextLine();
		char content[] = in.toCharArray();
		System.out.println(removeDuplicate(content));
		input.close();
	}

}

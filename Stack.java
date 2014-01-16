
import java.util.Scanner;

public class Stack {

	//2.1 Write code to remove duplicates from an unsorted linked list.


		public Node init(char[] content, int length){

			Node head = new Node();
			Node temp = head;

			for(int i=0; i<length; i++){
				temp.setData(content[i]);
				System.out.println(content[i]);
				Node node = new Node();
				temp.setNext(node);
				temp = temp.getNext();				
			}

			return head;
		}

		//print out the stack
		public void printStack(Node head){
			while(head.getNext() != null){
				System.out.println(head.getData());
			}
		}

		//print out the data on top
		public void top(){

		}
	
		//insert a new data on the top
		public void push(){
			
		}
		
		//delete the data on the top
		public void pop(){
			
		}

	//public static 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your string:");
		String in = input.nextLine();
		int length = in.length();
		char[] content = in.toCharArray();

		input.close();
	}

}




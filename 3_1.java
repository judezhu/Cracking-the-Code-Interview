//3.1:Describe how you could use a single array to implement three stacks.
 

//Todo: Should be replaced by generic class

public class Node {
	private Node next;
	private char data;

	public Node(){
		next = null;
		data = "";
	}

	public Node(char ch){
		next = null;
		data = ch;
	}

	public char getData(){
		return data;
	}	

	private void setData(char ch){
		data = ch;
	}

	public Node getNext(){
		Node = next;
	}

}


public class RemoveDuplicate {

	//convert string into single unsorted linked list
	public Node init(char[] content, int length){
		Node head = new Node();
		Node temp = head;

		for(int i=0; i<length; i++){
			temp.setData(content[i]);
			System.out.printf(content[i])
			temp = temp.getNext();		
		}
		return head;
	}

	//method1: with buffer
	public static void removeDuplicate1(){
	
		
	}

	//method2: without buffer
	public static void removeDuplicate2(){
	
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
		Node head = init(content, length);

                System.out.println();
                input.close();
	}

}

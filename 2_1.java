//Todo: String should be replaced by generic class

public class Node {
	private Node next;
	private char data;

	public Node(){
		next = null;
		data = "";
	}

	public char getData(){
		return data;
	}	

	private void setData(String str){
		data = str;
	}

	public Node getNext(){
		Node = next;
	}

}


public class SingleLinkedList(){
	private Node head;
	public SingleLinkedList(){
		head = null;
	}
	
	public Node getFirst(){
	
	}

	public SingleLinkedList deleteNode(char ch){

	}

}

public class RemoveDuplicate {


	public static void removeDuplicate(){
		
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
                char content[] = in.toCharArray();
                System.out.println(replaceSpace(content));
                input.close();
	}

}

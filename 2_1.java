import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicate {

	//2.1 Write code to remove duplicates from an unsorted linked list.

	//Todo: String should be replaced by generic class


	public static class Node {
		private Node next;
		private char data;

		public Node(){
			next = null;
			data = 0;
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
			Node node = next;
			return node;
		}

		public void setNext(Node node){
			next = node;
		}
	}



	//convert string into single unsorted linked list
	public static Node init(char[] content, int length){

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
	
	//print out the single linked list
	public static void printList(Node head){
		while(head.getNext() != null){
			System.out.println(head.getData());
		}
	}

	//method1: with buffer
	public static Node removeDuplicate1(Node head){
		HashSet<Character> set = new HashSet<Character>();
		Node previous = head;
		Node current = head.getNext();
		set.add(previous.getData());

		if(!set.contains(current.getData())){
			set.add(current.getData());
			previous = previous.getNext();
			current = current.getNext();
		}
		else{
			previous.setNext(current.getNext());
		}
		return head;
	}

	//method2: without buffer
	public static Node removeDuplicate2(Node head){
		
		Node previous = head;
		Node current  = head.getNext();
		Node runner = current.getNext();

		boolean isDuplicate = false;
		
		while(head.getNext() != null){
			while(current.getData() != runner.getData() && runner.getNext() != null){
				runner = runner.getNext();
				isDuplicate = true;
			}
			if(isDuplicate){
				previous.setNext(current.getNext());
				isDuplicate = false;
			}
			previous = previous.getNext();
			current = current.getNext();
		}
		
		return head;
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
		
		Node newHead1 = removeDuplicate1(head);
		Node newHead2 = removeDuplicate2(head);
		
		printList(newHead1);
		printList(newHead2);

		input.close();
	}

}




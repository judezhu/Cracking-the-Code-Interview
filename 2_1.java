import java.util.HashSet;
import java.util.Scanner;

import RemoveDuplicate.Node;


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

	//method1: with buffer
	public static void removeDuplicate1(Node head){
		HashSet<E> set = new HashSet();
		Node current = head.getNext();
		set.put(head.getData());
		
		if(!set.contains(current.getData())){
			set.put(current.getData());
			head = head.getNext();
			current = current.getNext();
		}
		else{
			head.setNext(current.getNext());
		}
	}

	//method2: without buffer
	public static void removeDuplicate2(Node head){

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

	
		input.close();
	}

}




import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicate {

	//2.1 Write code to remove duplicates from an unsorted linked list.

	//Todo: String should be replaced by generic class


	public static class Node {
		public Node next;
		public char data;
	}


	//method1: with buffer
	public static Node removeDuplicate1(Node head){
		HashSet<Character> set = new HashSet<Character>();
		Node previous = head;
		Node current = head.next;
		set.add(previous.data);

		if(!set.contains(current.data)){
			set.add(current.data);
			previous = previous.next;
			current = current.next;
		}
		else{
			previous.next = current.next;
		}
		return head;
	}

	//method2: without buffer
	public static Node removeDuplicate2(Node head){
		
		Node previous = head;
		Node current  = head.next;
		Node runner = current.next;

		boolean isDuplicate = false;
		
		while(head.next != null){
			while(current.data != runner.data && runner.next != null){
				runner = runner.next;
				isDuplicate = true;
			}
			if(isDuplicate){
				previous.next = current.next;
				isDuplicate = false;
			}
			previous = previous.next;
			current = current.next;
		}
		
		return head;
	}	
}




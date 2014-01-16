import java.util.HashSet;
import java.util.Scanner;

public class SingleLinkedList {

	//2.1 Write code to remove duplicates from an unsorted linked list.
	//Todo: String should be replaced by generic class

	//convert string into single unsorted linked list
	public Node<Character> init(char[] content, int length){

		Node<Character> head = new Node<Character>();
		Node<Character> temp = head;

		for(int i=0; i<length; i++){
			temp.setData(content[i]);
			System.out.println(content[i]);
			Node<Character> node = new Node<Character>();
			temp.setNext(node);
			temp = temp.getNext();				
		}

		return head;
	}
	
	//print out the single linked list
	public void printList(Node<Character> head){
		while(head.getNext() != null){
			System.out.println(head.getData());
		}
	}

	//method1: with buffer
	public Node<Character> removeDuplicate1(Node<Character> head){
		HashSet<Character> set = new HashSet<Character>();
		Node<Character> previous = head;
		Node<Character> current = head.getNext();
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
	public Node<Character> removeDuplicate2(Node<Character> head){
		
		Node<Character> previous = head;
		Node<Character> current  = head.getNext();
		Node<Character> runner = current.getNext();

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

//		Node<Character> head = init(content, length);
//		Node<Character> newHead1 = removeDuplicate1(head);
//		Node<Character> newHead2 = removeDuplicate2(head);
//		
//		printList(newHead1);
//		printList(newHead2);

		input.close();
	}

}




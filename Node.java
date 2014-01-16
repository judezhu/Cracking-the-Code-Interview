

public class Node<D> {
	
	private Node<D> next;
	private D data;

	public Node(){
		next = null;
		this.data = null;
	}

	public Node(D data){
		next = null;
		this.data = data;
	}

	public D getData(){
		return this.data;
	}	

	public void setData(D data){
		this.data = data;
	}

	public Node<D> getNext(){
		Node<D> node = next;
		return node;
	}

	public void setNext(Node<D> node){
		next = node;
		//convert string into single unsorted linked list
	}
}

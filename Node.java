/**
	A class to represent a linked list node
	containing an integer.
**/
public class Node {

	private Integer data;
	private Node next;

	public Node(Integer data, Node next) {
		this.data = data;
		this.next = next;
	}

	public Node(Integer data) {
		this(data, null);
	}

	public Integer getData() {
		return this.data;
	}

	public Node getNext() {
		return this.next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
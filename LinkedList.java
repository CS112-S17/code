/**
	A class to store a linked list of integers.
**/
public class LinkedList {

	private Node head;
	//private Node tail; //currently not maintaining tail reference
	private int count;

	//Constructor to create a new list
	public LinkedList() {
		this.head = null;
		this.count = 0;
	}

	/**
		Add a new item at the head of the list.
	**/
	public void addAtHead(Integer data) {

		//create a node
		Node newNode = new Node(data);

		//set next reference of new node to the first item in the list
		newNode.setNext(head);

		//link together head reference and the new node
		head = newNode;

		//increment count
		count++;

	}

	/**
		Returns true if target is in the list and false
		otherwise.
	**/
	public boolean find(Integer target) {

		Node cur = head;

		while(cur != null) { //while not at end of list

			//if item matches target
			// return true
			if(cur.getData().equals(target)) {
				return true;
			}

			//otherwise keep going
			cur = cur.getNext();
		}

		return false;

		//first draft of algorithm
		//as long as the item has not been found
		//  keep going down the list

		//if found, return true
		//otherwise return false

	}

	/**
		Retrieve the item from a given index.
		TODO: throw exception if index is out of range
	**/
	public Integer get(int index) {

		//if index is out of range
		if(index >= count) {
			//TODO: FINISH THIS METHOD
			//throw an indexoutofrangeexception
		}

		Node cur = head;
		
		for(int i = 0; i < index; i++) {

			//hop down cur
			cur = cur.getNext();

		}

		return cur.getData();
	}


}
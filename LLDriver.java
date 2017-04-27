/**
	A class to test a linked list implementation.
**/
public class LLDriver {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		ll.addAtHead(5);
		System.out.println(ll.find(5));
		System.out.println(ll.find(50));
		ll.addAtHead(2);
		ll.addAtHead(17);
		ll.addAtHead(85);
		System.out.println(ll.find(5));
		System.out.println(ll.find(50));
		//85, 17, 2, 5
		System.out.println(ll.get(0));
		System.out.println(ll.get(1));
		System.out.println(ll.get(2));
		System.out.println(ll.get(3));

	}
}
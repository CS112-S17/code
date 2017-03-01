public class NumberListTest {

	public static void main(String[] args) {

		NumberList nl = new NumberList();
		nl.addFirst(3);
		nl.addFirst(5);
		nl.addFirst(7);
		nl.addFirst(9);
		nl.addFirst(11);
		System.out.println(nl.toString());

	}
}
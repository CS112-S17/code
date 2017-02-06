/**
	A driver class to test the Name class.
	@author Sami Rollins
**/

public class NameDriver {

	public static void main(String[] args) {

		//create some Name objects

		Name n1 = new Name("Sally", "Jones", 'X');
		Name n2 = new Name("Bob", "Smith");
		Name n3 = n1;
		
		System.out.println(n3.toString());

		n1 = n2;

		System.out.println(n1.toString());
		System.out.println(n2.toString());

		n1.setLast("Simpson");

		System.out.println(n1.toString());
		System.out.println(n2.toString());
		System.out.println(n3.toString());

		//print the Name objects

		// System.out.println(n2.toString());


	}

}
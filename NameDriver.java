/**
	A driver class to test the Name class.
	@author Sami Rollins
**/

public class NameDriver {

	public static void main(String[] args) {

		//create some Name objects

		String n1First = "Bob";
		Name n1 = new Name(n1First, "Smith");
		Name n2 = new Name("Sally", "Jones", 'X');

		//print the Name objects

		// System.out.println("Last name of first person: " + n1.getLast());
		// System.out.printf("Last name of first person: %s\n", n1.getLast());


		System.out.println(n1.toString());
		System.out.println(n2.toString());


	}

}
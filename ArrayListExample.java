/**
	A class that demonstrates how to create and use an 
	ArrayList.
	@author Sami Rollins
**/
//java.util.ArrayList must be imported before it may be used.
import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {

		//An example that creates an ArrayList of 
		//Strings, adds several strings, and prints
		//the list using a standard for loop.
		ArrayList<String> words = new ArrayList<String>();

		//TODO: add words to list

		//note, this loop uses the Java increment operator

		//TODO: print contents of list


		//separating the output
		System.out.println("\n***************\n");

		//An example that creates an ArrayList
		//of Integer, add several ints, and 
		//prints the list using a for-each loop.
		//Note that Java automatically converts
		//from primitive types to their object
		//wrappers.
		//see: https://docs.oracle.com/javase/tutorial/java/data/autoboxing.html
		ArrayList<Integer> numbers = new ArrayList<Integer>();


		//TODO: add numbers to list and print result


		//Even though the get method returns an
		//Integer it is automatically converted to 
		//an int
		//TODO: retrieve first item


		//separating the output
		System.out.println("\n***************\n");


		//An example that creates an ArrayList of 
		//Names, adds several Names, and prints 
		//the list using a for-each loop.
		//To compile this example make sure that 
		//the Name class is in the same directory
		//and compiled at the same time.		

		//TODO: create array list of names and print result


		//should print false

		//TODO: demonstrate contains method


		
	}

}
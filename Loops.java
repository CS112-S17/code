/**
	A class to demonstrate syntax of the loops
	in Java.
	@author Sami Rollins
**/
public class Loops {

	public static void main(String[] args) {
		
		//declare constants
		final int SUM_MAX = 20;
		final int PRINT_MIN = 0;
		final int PRINT_MAX = 5;

		//use a for loop to sum the numbers
		//from 0 to 20
		int sum1 = 0;

		//uses the post-increment operator i++
		//i++ is the same as i = i + 1
		
		//TODO: complete loop

		System.out.println("Sum of numbers 0-20: " + sum1);

		//separating the output
		System.out.println("\n***************\n");

		//use a for loop to sum the even numbers from 1 to 20
		int sum2 = 0;

		//add 2 to i each iteration

		//TODO: complete loop

		System.out.println("Sum of even numbers 0-20: " + sum2);

		//separating the output
		System.out.println("\n***************\n");

		//alterative approach
		//use a for loop to sum the even numbers from 1 to 20
		int sum3 = 0;

		//this loop will execute twice as many 
		//times as the previous

		//TODO: complete loop

		System.out.println("Sum of even numbers 0-20: " + sum3);

		//separating the output
		System.out.println("\n***************\n");

		//use a while loop to sum the numbers from 0-20
		int sum4 = 0;
		int num = 0; //initialize control varaible

		//TODO: complete loop

		System.out.println("Sum of numbers 0-20: " + sum4);

		//separating the output
		System.out.println("\n***************\n");

		//use a nested for loop to print the
		//following pattern
		//0
		//01
		//012
		//0123
		//01234

		//TODO: complete loop

		//separating the output
		System.out.println("\n***************\n");

		//use a nested for loop to print the
		//following pattern
		//01234
		//0123
		//012
		//01
		//0
		//note, uses the post-decrement operator
		//i-- is the same as i = i - 1

		//TODO: complete loop
	}

}
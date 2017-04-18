/**
	A class to demonstrate some recursive methods.
**/
public class RecursionFun {


	//iterative factorial
	// public static int factorial(int n) {

	// 	int result = 1;

	// 	for(int i = n; i > 0; i--) {
	// 		result = result * i;
	// 	}
	// 	return result;

	// }

	/**
		Count the number of the letter 'a' appearing
		in the String passed as input.
	**/
	public static int countAs(String s) {
		//base case
		if(s.length() == 0) {
			return 0;
			// if(s.charAt(0) == 'a') {
			// 	return 1;
			// } else {
			// 	return 0;
			// }
		}

		if(s.charAt(0) == 'a') {
			return 1 + countAs(s.substring(1));
		} else {
			return countAs(s.substring(1));
		}

	}

	/**
		Recursively print a String passed as input.
	**/
	public static void printString(String s) {
		if(s.length() == 1) {
			System.out.println(s.charAt(0));
			//System.out.println(s);
			return;
		}

		printString(s.substring(1));
		System.out.println(s.charAt(0));

	}

	/**
		A method to recursively calculate the factorial of
		n.
	**/
	public static int factorial(int n) {

		//if base case
		if(n == 1) {
			//return trivial solution
			return 1; //or return n;
		}
		return n * factorial(n-1);

	}

	/**
		A recursive method to print the numbers from 0 to
		n.
	**/
	public static void printNums(int n) {
		printNums(0, n);
	}

	/**
		A helper method to print the numbers from 0 to n.
	**/
	private static void printNums(int start, int end) {
		if(start == end) {
			System.out.println(end);
			return;
		}

		System.out.print(start);
		printNums(start+1, end);

	}

	public static void main(String[] args) {
		printNums(7);
	}

}
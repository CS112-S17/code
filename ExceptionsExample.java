/**
	Example code from class to demonstrate some syntax related to exceptions.
	The goal of this code is to demonstrate syntax only. It does not exhibit
	good design or programming practices in some instances.
**/
public class ExceptionsExample {

	//For demonstration purposes only.
	//This is a poorly designed method used to illustrate
	//how to throw an exception.
	public static boolean checkValue(int n) throws OutOfRangeException {

		if(n < 0) {

			//throw new OutOfRangeException("Value of n too small");
			
			//equivalent to the one line above
			OutOfRangeException oore = new OutOfRangeException("Value of n too small");
			throw oore;
		}

		//if n is in range
		// execute some task
		return true;

	}



	public static void main(String[] args) {

		boolean result = false;
		try {
			result = checkValue(-10);
		} catch(OutOfRangeException oore) {
			
			System.out.println(oore.getMessage());

		}
		System.out.println("result: " + result);

		// EXAMPLE to demonstrate how to catch exceptions in Java.
		// String s = "3";
		// int val = 0;

		// try {
		
		// 	val = Integer.parseInt(s);
		// 	val = val/0; 
		
		// } catch(NumberFormatException nfe) {
		// 	val = -1;
		// 	System.out.println(nfe.getMessage());
		
		// } catch(Exception e) {
		// 	System.out.println("RANDOM EXCEPTION GENERATED");
		// 	System.out.println(e.getMessage());
		// }

		// System.out.println(val);

	}


}
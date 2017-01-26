/**
	A class to calculate the value of a collection of coins.
	@author Sami Rollins
**/

public class CoinValue {

	public static void main(String[] args) {

		//declare and initialize values for coins
		//use constants -- final cannot be changed
		final double PENNY = .01;
		final double NICKEL = .05;
		final double DIME = .1;
		final double QUARTER = .25;

		//declare and initialize variables to 
		//hold number of coins in purse
		int numPennies = 5;
		int numNickels = 2;
		int numDimes = 7;
		int numQuarters = 2;

		//calculate total value
		double sum = (PENNY * numPennies) + 
				(NICKEL * numNickels) +
				(DIME * numDimes) + 
				(QUARTER * numQuarters);

		//display result
		String output = "Coin value: \"" + sum + "\"";
		System.out.println(output);

	}


}
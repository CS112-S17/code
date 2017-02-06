/**
	A class to play a coin flipping game.
	@author Sami Rollins
**/
import java.util.Scanner;

public class CoinDriver {

	public static void main(String[] args) {

		Coin c = new Coin();

		Scanner input = new Scanner(System.in);

		String guess = null;

		System.out.println("Heads or tails? ");
		guess = input.nextLine();

		//Strings are immutable!
		guess = guess.toLowerCase();


		if(!guess.equals("heads") && !guess.equals("tails")) {
			System.out.println("Bad input, thanks for playing!");
		} else {

			c.flip();
			//if coin says heads and you guessed heads OR
			//   coin says tails and you guessed tails
			// 		you win
			if( (c.isHeads() && guess.equals("heads")) ||
				(!c.isHeads() && guess.equals("tails")) ) {

				System.out.println("you guessed: " + guess);
				System.out.println(c.toString());
				System.out.println("you win");


			} else {
				System.out.println("you guessed: " + guess);
				System.out.println(c.toString());
				System.out.println("sorry...");
			}

		}


	}
	
}
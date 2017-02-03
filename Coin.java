/**
	A class to represent a coin that may be flipped.
	@author Sami Rollins
**/
import java.util.Random;

public class Coin {

	//data members
	// private double value;

	//true means heads and false means tails
	private boolean isHeads;

	//consturctor
	/**
		Construct a coin that initially shows tails.
	**/
	public Coin() {
		this.isHeads = false;
	}

	//methods
	public boolean isHeads() {
		return this.isHeads;	
	}

	//method to flip the coin
	public boolean flip() {

		Random r = new Random();
		this.isHeads = r.nextBoolean();
		return this.isHeads;

	}

	//return a string representation of the coin
	// coin shows: heads OR coin shows: tails
	public String toString() {

		//if isHeads is true
		// coin shows: heads
		//else 
		// coin shows: tails

		String returnValue = "coin shows: ";
		if(this.isHeads) { //isHeads == true
			returnValue += "heads";
		} else {
			returnValue += "tails";
		}
		return returnValue;
/*
		if(this.isHeads) { //isHeads == true
			return "coin shows: heads";
		} else {
			return "coin shows: tails";
		}
*/

	}



}
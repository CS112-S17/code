/**
	A class that represents a person's name.
	@author Sami Rollins
**/

public class Name {

	//data members
	private String first;
	private String last;
	private char middle;

	//constructor

	public Name(String first, String last, char middle) {
		this.first = first;
		this.last = last;
		this.middle = middle;
	}


	public Name(String newFirst, String newLast) {
		this.first = newFirst;
		this.last = newLast;
		this.middle = '-';

	}



	//alternative but equivalent constructor
	// public Name(String first, String last) {
	// 	this.first = first;
	// 	this.last = last;
	// }

	//methods

	//getters
	public String getFirst() {
		return this.first;
	}	

	public String getLast() {
		return this.last;
	}

	//print/display
	public String toString() {
		if(middle == '-') {
			return this.first + " " + this.last;	
		} else {
			return this.first + " " + this.middle + " " + this.last;
		}
		
	}



	//compare two names



	//set last name


}
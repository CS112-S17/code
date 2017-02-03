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

	//constructor used to build a name for a person with no middle 
	//initial
	public Name(String newFirst, String newLast) {
		this.first = newFirst;
		this.last = newLast;
		//default value for middle initial is '-''
		this.middle = '-';

	}


	//methods

	//getters
	public String getFirst() {
		return this.first;
	}	

	public String getLast() {
		return this.last;
	}

	public char getMiddle() {
		return this.middle;
	}	

	//print/display
	public String toString() {
		if(middle == '-') {
			return this.first + " " + this.last;	
		} else {
			return this.first + " " + this.middle + " " + this.last;
		}
		
	}

	//set last name
	public void setLast(String newLast) {
		this.last = newLast;
	}

	//compare two names
	public boolean equals(Name other) {

		if(this.first.equals(other.getFirst())) { //first names are the same

			if(this.last.equals(other.getLast())) {  //last names are the same

				if(this.middle == other.getMiddle()) {
					return true;
				}

			}

		}
		return false;
	}	


}
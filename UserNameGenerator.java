/**
	A class to generate a user login name given a user's first name, last name, and middle initial.
**/
import java.util.Random;

public class UserNameGenerator {

	/**
		Method takes as input a Name and returns a String representation of a username.

		Creates a username from a given Name.
		The username is the first two characters of the first name, followed by the middle initial, 
		followed by the first five characters of the last name, followed by a random number 
		from 1 to 100.	
		The username returned should be all lower case letters.
	**/
	public String generateUserName(Name name) {

		String first = name.getFirst();
		String last = name.getLast();
		char middle = name.getMiddle();

		String firstPart = first.substring(0, 2);

		//TODO: fix this!
		//what happens if the last name is shorter than 5 characters?
		String lastPart = last.substring(0, 5);

		Random r = new Random();
		int number = r.nextInt(100)+1;

		return firstPart + middle + lastPart + number;


	}




}
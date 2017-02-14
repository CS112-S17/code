/**
	A class to hold information about a list of
	Students.
	@author Sami Rollins
**/

import java.util.ArrayList;

public class StudentList {

	//data member: list to hold Student objects
	private ArrayList<Student> students;


	//constructor
	public StudentList() {
		this.students = new ArrayList<Student>();
	}		

	//method to add a student to the list
	public void addStudent(Student stuToAdd) {
		this.students.add(stuToAdd);
	}

	//method to return a String representation of entire list
	public String toString() {

		String returnVal = "";
	
		//build the string
		for(Student student: this.students) {
			//returnVal += student.toString() + "\n";
			returnVal = returnVal + student.toString() + "\n";
		}

		return returnVal;
	
	}

	//method to calculate average score across all students
	public double calculateAverage() {

		//declare variable to hold total
		//double total = 0;
		int total = 0;

		//for each Student in list
		for(Student student: this.students) {
			// add student score to total
			//total = total + student.getScore();
			total += student.getScore();

		}

		//divide total by number of students
		double result = ((double)total) / students.size();
		
		//return result
		return result; //modify to implement correct logic
	}

}

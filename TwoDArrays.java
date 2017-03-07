/**
	A class to demonstrate two dimensional arrays.
**/
public class TwoDArrays {


	/**
		Initialize array.
		Note that the parameter is a refernce so any changes made
		by the method will be reflected in the reference passed
		in by the driver.
	**/
	public static void initialize(double[][] scores) {

		scores[0][0] = 95;
		scores[0][1] = 78;
		scores[0][2] = 88;

		scores[1][0] = 77;
		scores[1][1] = 75;
		scores[1][2] = 73;

		scores[2][0] = 95;
		scores[2][1] = 77;
		scores[2][2] = 30;

		scores[3][0] = 30;
		scores[3][1] = 70;
		scores[3][2] = 88;

		scores[4][0] = 99;
		scores[4][1] = 76;
		scores[4][2] = 88;

	}

	/**
		Display all student grades in the format:
		Student 0: 95 78 88
		Student 1: 77 75 73
	**/
	public static void display(double[][] scores) {
		//for each row
		for(int r = 0; r < scores.length; r++) {

			System.out.print("Student " + r + ": ");

			//for each column
			for(int c = 0; c < scores[r].length; c++) {				
				//print item
				System.out.print(scores[r][c] + " ");

			}
			System.out.println();
		}

	}

	/**
		Return a one-dimensional array containing the average score
		for each student.
		The result at position 0 will contain the average for student 0;
	**/
	public static double[] average(double[][] scores) {
		double[] averages = new double[scores.length];

		for(int r = 0; r < scores.length; r++) {
			
			int sum = 0;

			for(double score: scores[r]) {
				sum += score;
			}
			sum = sum/scores[r].length;
			averages[r] = sum;
		}
		return averages;

	}

	/**
		Return the highest score from any student on any assignment.
	**/
	public static double highScore(double[][] scores) {				
		//initialize
		double highest = scores[0][0];

		for(int r = 0; r < scores.length; r++) {
			for(int c = 0; c < scores[r].length; c++) {				
				if(scores[r][c] > highest) {
					highest = scores[r][c];
				}
			}
		}
		// for(double[] row: scores) {

		// 	for(double score: row) {
			
		// 		if(score > highest) {
		// 			highest = score;
		// 		}
			
		// 	}
		
		// }
		return highest;

	}

}
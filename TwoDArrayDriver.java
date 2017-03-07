public class TwoDArrayDriver {

	public static void main(String[] args) {	

		double[][] scores = new double[5][3];
		TwoDArrays.initialize(scores);
		TwoDArrays.display(scores);

		// System.out.println("Highest Score: " + TwoDArrays.highScore(scores));
		double[] avgs = TwoDArrays.average(scores);
		for(double avg: avgs) {
			System.out.println("Average: " + avg);
		}

	}

}
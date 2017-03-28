public class Student2 {

	private int score;
	private Name studentName;

	//input: name, score
	public Student2(Name studentName, int score) {
		this.studentName = studentName;
		this.score = score;
	}

	public Student2(String first, String last, int score) {
		this.studentName = new Name(first, last);
		this.score = score;

	}

	public Student2(Name studentName) {
		this(studentName, 0);
	}

	public Student2(String first, String last) {

		this(first, last, 0);
	}

	// public void setLast(String newLast) {
	// 	studentName.setLast(newLast);
	// }

	public Name getStudentName() {
		return this.studentName;
	}
}
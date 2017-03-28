public class Student extends USFPerson {

	private String major;
	private int year;
	private double gpa;

	public Student(String name, int id, String major, int year, double gpa) {
		super(name, id);

		this.major = major;
		this.year = year;
		this.gpa = gpa;

	}

	public double getEmailQuota() {
		return 32;
	}

	public String getMajor() {
		return this.major;
	}

	public int getYear() {
		return this.year;
	}

	public double getGpa() {
		return this.gpa;
	}

	public String toString() {

		//String name = super.getName();
		return super.toString() +
				" Major: " + major +
				" Year: " + year + 
				" GPA: " + gpa; 

	}




}
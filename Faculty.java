public class Faculty extends USFPerson {

	private String department;

	public Faculty(String name, int id, String department) {

		super(name, id);
		this.department = department;
	}

	public double getEmailQuota() {
		return 64;
	}


	public String getName() {
		return "Professor " + super.getName();
	}

	public String getDepartment() {
		return this.department;
	}

	public String toString() {

		return super.toString() + 
				" Department: " + department;
	}

}
public abstract class USFPerson {

	protected String name;
	protected int id;

	public USFPerson(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public abstract double getEmailQuota();

	public String getName() {
		return this.name;
	}

	public int getId() {
		return this.id;
	}

	public String toString() {
		return "Name: " + name +
				" ID: " + id;
	}


}
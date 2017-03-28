public class Student2Test {

	public static void main(String[] args) {

		Student2 stu = new Student2("Bob", "Smith", 92);
		Name n = stu.getStudentName();
		n.setLast("Jones");

	}

}
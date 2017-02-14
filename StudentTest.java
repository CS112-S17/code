public class StudentTest {

	public static void main(String[] args) {


		StudentListBuilder builder = new StudentListBuilder();
		StudentList list = builder.buildStudentList("csvexample.txt");
		System.out.println(list.toString());

		// Student s1 = new Student("Bob", 70);
		// Student s2 = new Student("Sally", 90);


		// StudentList list = new StudentList();
		// list.addStudent(s1);
		// list.addStudent(s2);

		// System.out.println(list.toString());
		// System.out.println("Average score: " + list.calculateAverage());


	}

}
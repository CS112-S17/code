import java.util.ArrayList;

public class USFPersonTester {

	public static void main(String[] args) {

		// USFPerson p = new Student("Bob Smith", 1234, "CS", 2016, 3.4); // = new USFPerson("Bob Smith", 1244);


		ArrayList<USFPerson> people = new ArrayList<USFPerson>();

		people.add(new Student("Bob Smith", 1234, "CS", 2016, 3.4));
		people.add(new Faculty("Sally Jones", 9876, "History"));
		people.add(new Faculty("Herb Zuniga", 9996, "Chemistry"));
		people.add(new Student("Jack Johnson", 2314, "Biology", 2017, 3.8));
		people.add(new Student("Barry Allen", 4463, "Physics", 2015, 2.8));

		for(USFPerson p: people) {
			System.out.println(p.getEmailQuota());
			// if(p instanceof Student) {	
			// 	Student s = (Student)p;			
			// 	System.out.println(s.getGpa());
			// }


		}


	}

}
/**
	A class to test the user name generator.
	@author Sami Rollins
**/
public class UserNameGeneratorDriver {


	public static void main(String[] args) {
		UserNameGenerator gen = new UserNameGenerator();
		
		Name n = new Name("Mickey", "Mey", 'K');

		String username = gen.generateUserName(n);

		System.out.println("User name for " + n + " is " + username + "!");

	}
}
public class ArrayExample {

	public static void main(String[] args) {

		//declare and initialize an array that will hold 25 Name objects
		Name[] names = new Name[3];
		int count = 0;

		names[count++] = new Name("Bob", "Smith");
		names[count++] = new Name("Sally", "Jones");
		// names[2] = new Name("Herb", "Zuniga");

		for(int i = 0; i < count; i++) {
			System.out.println("first name of item " + i + " is " + names[i].getFirst());
		}



		// int count = 0;
		// String[] words = new String[3];
		// words[count++] = "hello";

		// words[count++] = "goodbye";

		// words[count++] = "wake up!";

		// for(int i = 0; i < count; i++) {
		// 	System.out.println(words[i].toString());
		// }

		// words[count++] = "another string";

			
		// int[] numbers;
		// numbers = new int[5];

		// numbers[0] = 12;
		// numbers[4] = 52;

		// numbers[0] += 3;
		// numbers[0] = numbers[0] + 3;

		// for(int i = 0; i < numbers.length; i++) {
		// 	System.out.println(numbers[i]);
		// }


	}

}
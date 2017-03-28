public class ReturnExample {

	public boolean testEvenAndLarge(int x) {

		if(x % 2 == 0) {
			System.out.println("x is even");			
		} else {
			//exit the method
			return false;
		}

		if(x > 20) {
			System.out.println("x is also large");
			return true;
		}
		

	}

	public static void main(String[] args) {

		ReturnExample ex = new ReturnExample();

		int x = 2;
		System.out.println("testing with x = " + x);
		ex.testEvenAndLarge(x);
		System.out.println();

		x = 5;
		System.out.println("testing with x = " + x);
		ex.testEvenAndLarge(x);
		System.out.println();	

		x = 50;
		System.out.println("testing with x = " + x);
		ex.testEvenAndLarge(x);
		System.out.println();

		x = 501;
		System.out.println("testing with x = " + x);
		ex.testEvenAndLarge(x);

		System.out.println("thanks for playing...");


	}




}
public class CarDriver {

	public static void main(String[] args) {

		Car c1 = new Car("Mazda", "CX-5");
		Car c2 = new Car("Smart", "fortwo");


		System.out.println(c1);
		System.out.println(c2);

		System.out.println("c1.getVin(): " + c1.getVin());
		System.out.println("c1.getVinGenerator(): " + c1.getVinGenerator());

		System.out.println("c2.getVin(): " + c2.getVin());
		System.out.println("c2.getVinGenerator(): " + c2.getVinGenerator());


	}


}
/**
	A class the represents an automobile.
**/
public class Car {

	//Cars have a make, model, and VIN number.
	private String make;
	private String model;
	private int vin;

	//To generate the VIN number, we use a
	//static integer that will be shared 
	//across all instances of Car.
	private static int vinGenerator = 1;

	//constructor
	public Car(String make, String model) {
		this.make = make;
		this.model = model;
		this.vin = vinGenerator++;
	}

	//toString method
	public String toString() {
		return "make: " + make + " model: " + model + " vin: " + vin;
	}

	//getters
	public static int getVinGenerator() {
		return vinGenerator;
	}

	public int getVin() {
		return vin;
	}


}

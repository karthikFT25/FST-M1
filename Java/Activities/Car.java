
public class Car {
	//characteristics
	String colour;
	String transmission;
	int make;
	int tyre;
	int doors;
	
	
	//constructor
	Car(){
		tyres = 4;
		doors = 4;
		
	}
	
// methods
    public void displayCharacterstics(){
	System.out.println("Color of the Car: " + color);
	System.out.println("Make of the Car: " + make);
	System.out.println("Transmission of the Car: " + transmission);
	System.out.println("Number of doors on the car: " + doors);
    	System.out.println("Number of tyres on the car: " + tyres);
    }

    public void accelerate() {
	System.out.println("Car is moving forward.");
    }
	
    public void brake() {
	System.out.println("Car has stopped.");
    }
}

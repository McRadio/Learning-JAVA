package Adapter;

public class MainAppAdapter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Automobile autoA = new Automobile("VW", "Schwarz", 10000, 250);
		Vehicle car = new AutoAdapter(autoA); 
		System.out.println("Car: " + car.getManufacturer() + ", " + car.getColor() + ", " + car.getMileage() + ", " + car.maxSpeed());
		}

}

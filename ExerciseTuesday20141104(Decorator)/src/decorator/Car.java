/**
 * 
 */
package decorator;

/**
 * @author Steinhagen
 *
 */
public class Car implements Vehicle {

	private String manufacturer = "";
	private String color = "";
	
	private int maxSpeed = 0;
	private int mileAge = 0;
	
	/**
	 * Der Konstruktor 
	 */
	public Car(String m, String c, int v) {
		// TODO Auto-generated constructor stub
		this.manufacturer = m;
		this.maxSpeed = v;
		this.color = c;
	}

	/* (non-Javadoc)
	 * @see decorator.Vehicle#startEngine()
	 */
	@Override
	public void startEngine() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see decorator.Vehicle#stopEngine()
	 */
	@Override
	public void stopEngine() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see decorator.Vehicle#moveForward(int)
	 */
	@Override
	public void moveForward(int miles) {
		// TODO Auto-generated method stub
		this.mileAge += miles;
	}

	/* (non-Javadoc)
	 * @see decorator.Vehicle#getMileage()
	 */
	@Override
	public int getMileage() {
		// TODO Auto-generated method stub
		return this.mileAge;
	}

	/* (non-Javadoc)
	 * @see decorator.Vehicle#getDailyRate(int)
	 */
	@Override
	public int getDailyRate(int days) {
		// TODO Auto-generated method stub
		int rate = 50;
		if(days <= 7){
			rate = 65;
		}
		return rate;
	}

	/* (non-Javadoc)
	 * @see decorator.Vehicle#getManufacturer()
	 */
	@Override
	public String getManufacturer() {
		// TODO Auto-generated method stub
		return this.manufacturer;
	}

	/* (non-Javadoc)
	 * @see decorator.Vehicle#getColor()
	 */
	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return this.color;
	}

	/* (non-Javadoc)
	 * @see decorator.Vehicle#maxSpeed()
	 * 
	 * Diese Methode liefert die Höchstgeschwindigkeit
	 * 
	 * maxSpeed soll als beispiel für den Dekorierer dienen
	 */
	@Override
	public int maxSpeed() {
		// TODO Auto-generated method stub
		return this.maxSpeed;
	}

}

/**
 * 
 */
package decorator;

/**
 * @author Steinhagen
 *
 */
public abstract class VehicleDecorator implements Vehicle {

	/**
	 * Der Dekorierer kann entweder ein Car-Objekt oder ein anderes 
	 * Dekorierer-Objekt referenzieren
	 */
	
	protected Car vehicle = null;
	
	
	
	public VehicleDecorator(Car v) {
		// TODO Auto-generated constructor stub
		this.vehicle = v;
	}

	/* (non-Javadoc)
	 * @see decorator.Vehicle#startEngine()
	 */
	@Override
	public  void startEngine() {
		// TODO Auto-generated method stub
		this.vehicle.startEngine();

	}

	/* (non-Javadoc)
	 * @see decorator.Vehicle#stopEngine()
	 */
	@Override
	public void stopEngine() {
		// TODO Auto-generated method stub
		this.vehicle.stopEngine();
	}

	/* (non-Javadoc)
	 * @see decorator.Vehicle#moveForward(int)
	 */
	@Override
	public void moveForward(int miles) {
		// TODO Auto-generated method stub
		this.vehicle.moveForward(miles);
	}

	/* (non-Javadoc)
	 * @see decorator.Vehicle#getMileage()
	 */
	@Override
	public int getMileage() {
		// TODO Auto-generated method stub
		return this.vehicle.getMileage();
	}

	/* (non-Javadoc)
	 * @see decorator.Vehicle#getDailyRate(int)
	 */
	@Override
	public int getDailyRate(int days) {
		// TODO Auto-generated method stub
		return this.vehicle.getDailyRate(days);
	}

	/* (non-Javadoc)
	 * @see decorator.Vehicle#getManufacturer()
	 */
	@Override
	public String getManufacturer() {
		// TODO Auto-generated method stub
		return this.vehicle.getManufacturer();
	}

	/* (non-Javadoc)
	 * @see decorator.Vehicle#getColor()
	 */
	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return this.vehicle.getColor();
	}

	/* (non-Javadoc)
	 * @see decorator.Vehicle#maxSpeed()
	 */
	@Override
	public int maxSpeed() {
		// TODO Auto-generated method stub
		return this.vehicle.maxSpeed();
	}

}

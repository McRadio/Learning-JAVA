/**
 * 
 */
package Adapter;

/**
 * @author Steinhagen
 *
 */
public class AutoAdapter implements Vehicle {

	/**
	 * 
	 */
	
	protected Automobile automobile;
	
	public AutoAdapter(Automobile a) {
		// TODO Auto-generated constructor stub
		this.automobile = a;
	}


	@Override
	public int getMileage() {
		// TODO Auto-generated method stub
		return this.automobile.getKilometerStand();
	}


	@Override
	public String getManufacturer() {
		// TODO Auto-generated method stub
		return this.automobile.getHersteller();
	}


	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return this.automobile.getFarbe();
	}


	@Override
	public int maxSpeed() {
		// TODO Auto-generated method stub
		return this.automobile.getvMax();
	}
}
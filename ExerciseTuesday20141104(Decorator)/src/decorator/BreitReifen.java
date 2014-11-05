/**
 * 
 */
package decorator;

/**
 * @author Steinhagen
 *
 */
public class BreitReifen extends VehicleDecorator {

	/**
	 * @param v
	 */
	public BreitReifen(Car v) {
		super(v);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int maxSpeed(){
		return this.vehicle.maxSpeed() * 19 / 20;
	}
	
	@Override
	public int getDailyRate(int days){
		return this.vehicle.getDailyRate(days) + 10;
	}

}
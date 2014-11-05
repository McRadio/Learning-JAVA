/**
 * 
 */
package decorator;

/**
 * @author Steinhagen
 *
 */
public class Spoiler extends VehicleDecorator {

	/**
	 * @param v
	 */
	public Spoiler(Car v) {
		super(v);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int maxSpeed(){
		return this.vehicle.maxSpeed() * 5 / 4;
	}
	
	@Override
	public int getDailyRate(int days){
		return this.vehicle.getDailyRate(days) + 10;
	}
	
}

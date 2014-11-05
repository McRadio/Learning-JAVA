/**
 * 
 */
package decorator;



/**
 * @author Steinhagen
 *
 */
public interface Vehicle {

	public void startEngine();
	
	public void stopEngine();
	
	public void moveForward(int miles);
	
	public int getMileage();
	
	public int getDailyRate(int days);
	
	public String getManufacturer();
	
	public String getColor();
	
	public int maxSpeed();
	
}
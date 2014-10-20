/**
 * 
 */
package AutoAufgabe;

/**
 * @author Steinhagen
 *
 */
public interface Vehicle {
	public void startEngine();
	public int move();
	public void stopEngine();
	int compareTo(Car o);
	
}

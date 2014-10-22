/**
 * 
 */
package Erzeugungsmuster;

/**
 * @author Steinhagen
 *
 */
public class mainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s = Singleton.getInstance();
		Singleton b = Singleton.getInstance(); 
		System.out.println(s.toString());
		System.out.println(b.toString());
	}

}

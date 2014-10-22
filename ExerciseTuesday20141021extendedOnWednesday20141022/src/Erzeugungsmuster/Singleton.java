/**
 * 
 */
package Erzeugungsmuster;

/**
 * @author Steinhagen
 *
 */
public class Singleton {
	
	private Singleton(){
		
	}
	
	private static Singleton instance = null;	
	/**
	 * Die Kopiermethode wird geschützt
	 * 
	 * @return
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		throw new CloneNotSupportedException();
	}
	
	
	public static Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}


	@Override
	public String toString() {
		return "Ich bin Objekt: Singleton " + getClass() + "mit dem hashCode()="
				+ hashCode() + "]";
	}
	
	
}
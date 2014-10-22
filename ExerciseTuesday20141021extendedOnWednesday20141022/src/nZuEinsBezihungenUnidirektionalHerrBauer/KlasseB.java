/**
 * 
 */
package nZuEinsBezihungenUnidirektionalHerrBauer;

/**
 * @author Steinhagen
 *
 */
public class KlasseB {
	private static int nummer= 0;
	
	private int id;
	
	KlasseB(){
		
		this.id = KlasseB.nummer;
		KlasseB.nummer++;
	}
	
	public String toString(){
		return this.getClass().getSimpleName() +": " +this.id;
	}
	
}

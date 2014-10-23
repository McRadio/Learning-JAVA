/**
 * 
 */
package DesignPatternsFabrikMethode2;

/**
 * @author Steinhagen
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Die FabrikMethode
		FabrikMethode fm = new FabrikMethode();
		Fahrzeug sfzg = null;
		Fahrzeug dfzg = null;
		Fahrzeug tfzg = null;
		//.. erzeug ein neues Solarauto
		sfzg = fm.erzeuge("solar");
		dfzg = fm.erzeuge("diesel");
		tfzg = fm.erzeuge("tret");
	
		sfzg.move();
		dfzg.move();
		tfzg.move();
	}
}

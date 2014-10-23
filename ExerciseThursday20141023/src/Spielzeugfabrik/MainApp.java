/**
 * 
 */
package Spielzeugfabrik;




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
		FabrikMethode fm = new FabrikMethode();
		
		Spielzeug brumm1 = null;
		Spielzeug brumm2 = null;
		Spielzeug brumm3 = null;
		Spielzeug brumm4 = null;
	
		
		brumm1 = fm.erzeuge("pistole");
		brumm2 = fm.erzeuge("brummkreisel");
		brumm3 = fm.erzeuge("brummbaer");
		brumm4 = fm.erzeuge("barbie");
		
		brumm1.spielen();
		brumm2.spielen();
		brumm3.spielen();
		brumm4.spielen();
		
		
	}

}

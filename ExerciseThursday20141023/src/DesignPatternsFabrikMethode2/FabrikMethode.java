/**
 * 
 */
package DesignPatternsFabrikMethode2;

/**
 * @author Steinhagen
 *
 */
public class FabrikMethode {

	public Fahrzeug erzeuge(String art){
		Fahrzeug fzg = null;
		
		switch (art) {
			case "solar":
				fzg = new SolarAuto();
				break;
			case "diesel":
				fzg = new DieselAuto();
				break;
			case "tret":
				fzg = new TretAuto();
				break;
		}
		return fzg;
	}
}

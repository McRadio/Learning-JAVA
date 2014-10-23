/**
 * 
 */
package Spielzeugfabrik;

/**
 * @author Steinhagen
 *
 */
public class FabrikMethode {

	public Spielzeug erzeuge(String art){
		 Spielzeug sz = null;
		
		switch (art) {
			case "barbie":
				sz = new Barbie();
				break;
			case "brummkreisel":
				sz = new Brummkreisel();
				break;
			case "brummbaer":
				sz = new Brummbaer();
				break;
			case "pistole":
				sz = new Pistole();
				break;
		}
		return sz;
	}
}

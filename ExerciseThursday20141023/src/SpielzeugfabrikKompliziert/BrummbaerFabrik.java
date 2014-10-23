/**
 * 
 */
package SpielzeugfabrikKompliziert;

/**
 * @author Steinhagen
 *
 */
public class BrummbaerFabrik extends Fabrik {

	/* (non-Javadoc)
	 * @see DesignPatterns.Fabrik#erzeuge()
	 */
	@Override
	public Spielzeug erzeuge() {
		// TODO Auto-generated method stub
		return new Brummbaer();
	}

}
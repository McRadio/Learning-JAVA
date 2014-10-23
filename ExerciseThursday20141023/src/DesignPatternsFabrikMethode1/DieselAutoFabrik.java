/**
 * 
 */
package DesignPatternsFabrikMethode1;

/**
 * @author Steinhagen
 *
 */
public class DieselAutoFabrik extends Fabrik {

	/* (non-Javadoc)
	 * @see DesignPatterns.Fabrik#erzeuge()
	 */
	@Override
	public Fahrzeug erzeuge() {
		// TODO Auto-generated method stub
		return new DieselAuto();
	}

}

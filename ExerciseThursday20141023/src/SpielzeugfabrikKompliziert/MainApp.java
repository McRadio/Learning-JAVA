/**
 * 
 */
package SpielzeugfabrikKompliziert;

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
			Fabrik szf1 = new BrummbaerFabrik();
			Fabrik szf2 = new BrummkreiselFabrik();
			Fabrik szf3 = new PistolenFabrik();
			Fabrik szf4 = new BarbieFabrik();
			
			Spielzeug tb = szf1.erzeuge();
			Spielzeug bk = szf2.erzeuge();
			Spielzeug pi = szf3.erzeuge();
			Spielzeug ba = szf4.erzeuge();
			
			tb.spielen();
			bk.spielen();
			pi.spielen();
			ba.spielen();
	}

}

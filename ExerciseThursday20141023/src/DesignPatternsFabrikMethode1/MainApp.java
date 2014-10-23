/**
 * 
 */
package DesignPatternsFabrikMethode1;

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
			Fabrik saf = new SolarAutoFabrik();
			Fabrik daf = new DieselAutoFabrik();
			Fabrik taf = new TretAutoAFabrik();
			
			Fahrzeug sf = saf.erzeuge();
			Fahrzeug df = daf.erzeuge();
			Fahrzeug tf = taf.erzeuge();
			
			
			SolarAutoFabrik sf2 = new SolarAutoFabrik();
	
			SolarAuto sFzg = (SolarAuto)sf2.erzeuge();
			
			sf.move();
			df.move();
			tf.move();
			sFzg.move();
			
	}

}

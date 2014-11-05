/**
 * 
 */
package Adapter;

/**
 * @author Steinhagen
 *
 */
public class Automobile {

	/**
	 * 
	 */
	
	private int kilometerStand = 0;
	private int vMax =0;
	
	private String farbe = "";
	private String hersteller = "";
	
	
	
	public Automobile(String h, String f, int k, int v) {
		// TODO Auto-generated constructor stub
		this.farbe = f;
		this.hersteller = h;
		this.kilometerStand = k;
		this.vMax = v;
	}
	
	public int getKilometerStand(){
		return this.kilometerStand;
	}
	
	public String getHersteller(){
		return this.hersteller;
	}

	public int getvMax(){
		return this.vMax;
	}
	
	public String getFarbe(){
		return this.farbe;
	}
	
}
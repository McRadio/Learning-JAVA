/**
 * 
 */
package UnidirektionaleBezihungen;


/**
 * @author Steinhagen
 *
 */
public class Wohnung {

	private Stellplatz stellplatz;
	
	public Wohnung() {
		super();
	}

	public Wohnung(Stellplatz stellplatz) {
		super();
		this.stellplatz = stellplatz;
	}

	public Stellplatz getLink() {
		return this.stellplatz;
	}

	public void setLink(Stellplatz stellplatz) {
		this.stellplatz = stellplatz;
	}
	
	public void removeLink(){
		this.stellplatz = null;		
	}
		
}
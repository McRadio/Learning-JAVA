/**
 * 
 */
package UnidirektionaleBezihungen;

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
		Stellplatz s = new Stellplatz();
		Wohnung test = new Wohnung(s);
		System.out.println(test.getLink());
		test.removeLink();
		System.out.println(test.getLink());
	}

}

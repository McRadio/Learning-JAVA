/**
 * 
 */
package nZuEinsBezihungenUnidirektionalHerrBauer;

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
		KlasseA a = new KlasseA();
		a.setLink(new KlasseB());
		a.setLink(new KlasseB());
		a.setLink(new KlasseB());
		a.setLink(new KlasseB());
		a.setLink(new KlasseB());
		for(KlasseB objB : a.getAllLinks()){
			System.out.println(objB);
		}
		
	}

}

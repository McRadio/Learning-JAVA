/**
 * 
 */
package nZuEinsAggregation;

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
		Kurs fain13 = new Kurs();
		int i=1;
		Schueler hoppi = new Schueler(i++, "Hoppe");
		Schueler steini = new Schueler(i++, "Steini");
		Schueler koechi = new Schueler(i++, "Köchi");
		Schueler bahri = new Schueler(i++, "Bahri");
		Schueler uhli = new Schueler(i++, "Uhli");
		Schueler lampi = new Schueler(i++, "Lampi");
		fain13.einschreiben(hoppi);
		fain13.einschreiben(steini);
		fain13.einschreiben(koechi);
		fain13.einschreiben(bahri);
		fain13.einschreiben(uhli);
	
		fain13.auflisten();
		
		fain13.ausschreiben(lampi);
		
		fain13.auflisten();
	}

}

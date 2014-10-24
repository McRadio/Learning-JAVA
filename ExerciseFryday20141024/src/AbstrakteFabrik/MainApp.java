/**
 * 
 */
package AbstrakteFabrik;

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
		
		String [][] data = new String[8][2];
		
		data[0][0] = "1";	data[0][1] = "Borrmann";
		data[1][0] = "2";	data[1][1] = "Köcher";
		data[2][0] = "3";	data[2][1] = "Bahr";
		data[3][0] = "4";	data[3][1] = "Steinhagen";
		data[4][0] = "5";	data[4][1] = "Hoppe";
		data[5][0] = "6";	data[5][1] = "Uhlemann";
		data[6][0] = "7";	data[6][1] = "Bertram";
		data[7][0] = "8";	data[7][1] = "Stabenow";
		
		// wir erzeugen den neuen Client und injizieren die HtmlTableFactory
		Client tC = new Client(new HtmlTableFactory());
		Client tC2 = new Client(new TextTableFactory());
		// und der TabellenClient soll jetzt unsere Daten ausgeben
		
		tC.showData(data);
		tC2.showData(data);
	
	
	
	}

}

/**
 * 
 */
package nZuEinsBezihungenUnidirektional;

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

		for(int i=0;i<4;i++){
			switch (i){
				default:break;
				case 0 :
					Klasse1 k1 = new Klasse1();
					KlasseA wtf = new KlasseA(i, k1, null, null, null);
					System.out.println(wtf.getLink());
					break;
				case 1 :
					Klasse2 k2 = new Klasse2();
					KlasseA wtf2 = new KlasseA(i, null, k2, null, null);
					System.out.println(wtf2.getLink1());
					break;
				case 2 :
					Klasse3 k3 = new Klasse3();
					KlasseA wtf3 = new KlasseA(i, null, null, k3, null);
					System.out.println(wtf3.getLink2());
					break;
				case 3 :
					Klasse4 k4 = new Klasse4();
					KlasseA wtf4 = new KlasseA(i, null, null, null, k4);
					System.out.println(wtf4.getLink3());
					break;
			}
		}
	}

}

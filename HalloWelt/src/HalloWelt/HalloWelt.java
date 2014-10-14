package HalloWelt;

public class HalloWelt {
	public static void main(String[] args){
		for(int i=3;i>0;i--){
			System.out.println("Hallo Welt!");
		}
		MeineZweiteKlasse.willkommen();
		
		//instanziieren der KlasseB
		KlasseB  kb = new KlasseB(100);
		kb.ausgeben();
		KlasseC  kc = new KlasseC(101);
		kc.ausgeben();
		KlasseD kdD = new KlasseD();
		kdD.ausgeben();
		kdD.willkommen();
	}
}
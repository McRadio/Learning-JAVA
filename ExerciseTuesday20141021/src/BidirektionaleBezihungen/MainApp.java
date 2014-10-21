package BidirektionaleBezihungen;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KLasseA a = new KLasseA();
		KlasseB b = new KlasseB();
		KlasseB c = new KlasseB();
		
		a.setLink(b);
		a.removeLink(b);
		a.setLink(c);
	}

}

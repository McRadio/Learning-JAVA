package decorator;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car autoA= new Car("VW", "schwarz", 250);
		System.out.println("AutoA: " + autoA.getManufacturer() + ", " + autoA.getColor() + ", " + autoA.maxSpeed() + "km/h, " + autoA.getDailyRate(8) + "€/Tag");
		Spoiler prollAuto = new Spoiler(autoA);
		System.out.println("prollAuto: " + prollAuto.getManufacturer() + ", " + prollAuto.getColor() + ", " + prollAuto.maxSpeed() + "km/h, " + prollAuto.getDailyRate(8) + "€/Tag");
		BreitReifen oberprollAuto = new BreitReifen(autoA);
		System.out.println("prollAuto: " + oberprollAuto.getManufacturer() + ", " + oberprollAuto.getColor() + ", " + oberprollAuto.maxSpeed() + "km/h, " + oberprollAuto.getDailyRate(8) + "€/Tag");
	}

}

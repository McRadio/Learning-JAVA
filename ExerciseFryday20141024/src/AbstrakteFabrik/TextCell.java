package AbstrakteFabrik;

public class TextCell extends Cell{

	/**
	 * der Konstruktor der Klasse reicht den Wert für den Zellinhalt
	 * 
	 * direkt an den Konstruktor der Cell-Klasse weiter
	 * 
	 * @param c
	 */
	public TextCell(String c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.print("  |  " +  this.content);
	}
}

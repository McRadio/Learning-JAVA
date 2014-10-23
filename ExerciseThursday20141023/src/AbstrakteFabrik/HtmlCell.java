package AbstrakteFabrik;

public class HtmlCell extends Cell{

	/**
	 * der Konstruktor der Klasse reicht den Wert für den Zellinhalt
	 * 
	 * direkt an den Konstruktor der Cell-Klasse weiter
	 * 
	 * @param c
	 */
	public HtmlCell(String c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("\t\t<td>" + this.content + " </td>");
	}
}

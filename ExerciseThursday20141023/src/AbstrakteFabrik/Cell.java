package AbstrakteFabrik;

public abstract class Cell {
	
	/**
	 * wir wollen Textinformationen in der Zelle speichern
	 */
	protected String content = "";
	
	/**
	 * der Konstruktor der Klasse wor dmit Parameter aufgerufen
	 * 
	 * @param c
	 */
	public Cell(String c){
		
		this.content=c;
	}
	
	public abstract void display();
}

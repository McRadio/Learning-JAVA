package AbstrakteFabrik;

public abstract class TableFactory {
	// hier werden die Erzeugungsmethoden für die Objekte der Objektfamilien deklariert
	
	//eine Methode zum erzeugen von Tabellen
	public abstract Table createTable();
	
	//eine Methode zum erzeugen von Zeilen
	public abstract Row createRow();
	
	//eine Methode zum erzeugen von Zellen
	public abstract Cell createCell(String c);
	
}

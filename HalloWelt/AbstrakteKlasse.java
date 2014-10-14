package HalloWelt;

public abstract class AbstrakteKlasse {
	protected int deineZahl;
	
	public AbstrakteKlasse(int deineZahl){
		this.deineZahl = deineZahl;
	}
	
	abstract void ausgeben(); 
}

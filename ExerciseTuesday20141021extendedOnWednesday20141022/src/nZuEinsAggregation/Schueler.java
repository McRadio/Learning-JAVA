/**
 * 
 */
package nZuEinsAggregation;

/**
 * @author Steinhagen
 *
 */
public class Schueler {
	
	private static int nummer = 0; 
	
	private int id;
	private String name;
	
	 Schueler(int id, String name){
		this.id = id;
		this.name = name;
	}
	Schueler(){
		this.id = Schueler.nummer;
		Schueler.nummer++;
	}
	
	public Integer getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public String toString() {
		return " Schueler-ID: " + id +  " Name: " + name;
	}	

}

/**
 * 
 */
package nZuEinsAggregation;

import java.util.TreeMap;

/**
 * @author Steinhagen
 *
 */
public class Kurs {
	
	private TreeMap<Integer, Schueler> teilnehmer;
	
	public Kurs(){
		this.teilnehmer = new TreeMap<Integer, Schueler>();
	}
	
	public void einschreiben(Schueler s){
		this.teilnehmer.put(s.getId(), s);
	}
	
	public void ausschreiben(Schueler s){
		if(s.getId() != null && s.getId() <= teilnehmer.size()){
		this.teilnehmer.remove(s.getId());
		}
	}
	
	
	
	public void auflisten(){
		for(Integer i: teilnehmer.keySet()){
			Schueler schueler = teilnehmer.get(i);
			System.out.println(i + " " + schueler);
		}
	}
}

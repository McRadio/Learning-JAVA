/**
 * 
 */
package nZuEinsBezihungenUnidirektionalHerrBauer;

import java.util.ArrayList;
import java.util.List;




/**
 * @author Steinhagen
 *
 */
public class KlasseA {
	private static final int max = 5;
	private List<KlasseB> container = null;
	
	public KlasseA(){
		this.container = new ArrayList<>();
	}
	
	public void setLink(KlasseB objB){
		if(this.container.size() < KlasseA.max){
			this.container.add(objB);
		}		
	}
	
	public void removeLink(KlasseB objB){
		if(this.container.contains(objB)){
			this.container.remove(objB);
		}
	}
	
	public KlasseB[] getAllLinks(){
		return this.container.toArray(new KlasseB[this.container.size()]);
		
	}
}

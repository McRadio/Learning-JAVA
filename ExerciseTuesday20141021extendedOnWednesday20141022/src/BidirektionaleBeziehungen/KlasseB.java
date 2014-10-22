/**
 * 
 */
package BidirektionaleBeziehungen;

/**
 * @author Steinhagen
 *
 */
public class KlasseB {
	private KLasseA a= null;
	
	//stellt die Beziehung zum Objekt der KlasseA her 
	//und fordert das Objekt der KlasseA auf, eine Beziehung zu sich(this)
	//herzustellen
	public void setLink(KLasseA objA){
		if(this.a != objA && this.a != null){
			this.removeLink(a);
		}	
		this.a = objA;
		
		if(objA.getLink() != this){
			objA.setLink(this);
		}
	}

	public KLasseA getLink() {
		// TODO Auto-generated method stub
		return this.a;
	}
	
	public void removeLink(KLasseA objA){
		if(this.a != objA){
			return;
		}
		KLasseA tmp = this.a;
		this.a = null;
		if(this == tmp.getLink()){
			tmp.removeLink(this);
		}
	}
}

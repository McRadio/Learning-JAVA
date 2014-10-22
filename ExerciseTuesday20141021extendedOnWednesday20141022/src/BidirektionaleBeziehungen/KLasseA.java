package BidirektionaleBeziehungen;

public class KLasseA {
	private KlasseB b= null;
	//stellt die Beziehung zum Objekt der KlasseB her 
	//und fordert das Objekt der Klasse B auf, eine Beziehung zu sich(this)
	//herzustellen
		public void setLink(KlasseB objB){
			if(this.b != objB && this.b != null){
				this.removeLink(b);
			}
			this.b = objB;
			if(objB.getLink() != this){
				objB.setLink(this);
			}}

			public KlasseB getLink(){
				return this.b;
			}
	
			public void removeLink(KlasseB objB){
				if(this.b != objB){
					return;
				}
				KlasseB tmp = this.b;
				this.b = null;
				if(this == tmp.getLink()){
					tmp.removeLink(this);
				}
		}
}


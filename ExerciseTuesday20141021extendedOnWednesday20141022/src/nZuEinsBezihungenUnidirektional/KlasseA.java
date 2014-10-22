package nZuEinsBezihungenUnidirektional;

public class KlasseA {

	private Klasse1 klasse1;
	private Klasse2 klasse2;
	private Klasse3 klasse3;
	private Klasse4 klasse4;

	int [] Klasse = new int [4];
	int a=0;
	
	public KlasseA(int a, Klasse1 klasse1, Klasse2 klasse2, Klasse3 k3, Klasse4 klasse4) {
		super();
		this.a = a;
		this.klasse1 = klasse1;
		this.klasse2 = klasse2;
		this.klasse3 = k3;
		this.klasse4 = klasse4;
		
	}

	public void setLink(int a){
		switch (a){
			case 0:
				this.klasse1 = klasse1;
				break;
			case 1:
				this.klasse2 = klasse2;
				break;
			case 2:
				this.klasse3 = klasse3;
				break;
			case 3:
				this.klasse4 = klasse4;
				break;
		}
	}
	
	public Klasse1 getLink(){
			return this.klasse1;
	}
	public Klasse2 getLink1(){
		return this.klasse2;
	}
	public Klasse3 getLink2(){
		return this.klasse3;
	}
	public Klasse4 getLink3(){
		return this.klasse4;
	}
		
	public void removeLink(int a){
		switch (a){
		case 0:
			this.klasse1 = null;
			break;
		case 1:
			this.klasse2 = null;
			break;
		case 2:
			this.klasse3 = null;
			break;
		case 3:
			this.klasse4 = null;
			break;
		}
	}
}

/**
 * 
 */
package AutoAufgabe;

import java.util.Comparator;

/**
 * @author Steinhagen
 *
 */
public class Car implements Vehicle,Comparator<Car>, Comparable<Car> {

	/* (non-Javadoc)
	 * @see AutoAufgabe.Vehicle#startEngine()
	 */
	
	public boolean status = false;
	public int km = 0;
	public int distance = 0;
	
	public Car(){
		
	}
	
	public Car(boolean status, int km){
		this.status = status;
		this.km = km;
	}
	
	public void startEngine() {
		// TODO Auto-generated method stub
		this.status = true;
	}

	/* (non-Javadoc)
	 * @see AutoAufgabe.Vehicle#move()
	 */
	public void move(int distance) {
		// TODO Auto-generated method stub
		if(!this.status){
			
		}else{
			this.km+= distance;
		}
		
		
	}

	/* (non-Javadoc)
	 * @see AutoAufgabe.Vehicle#stopEngine()
	 */
	public void stopEngine() {
		this.status = false;
	}

	public int move() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int compare(Car arg0, Car arg1) {
		// TODO Auto-generated method stub
		if(arg0.km == arg1.km){
			return 0;
		}
		if(arg0.km > arg1.km){
			return 1;
		}
		return -1;
	}

	public int compareTo(Car o){
		if(this.km == (o).km){return 0;}
		if(this.km > (o).km){return 1;}
		return -1;
	}

	
	public String toString(){
		return this.getClass().getSimpleName()+": " + this.km;
		
	}
}



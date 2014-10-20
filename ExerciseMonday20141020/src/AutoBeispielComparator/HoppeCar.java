/**
 * 
 */
package AutoBeispielComparator;

/**
 * @author Steinhagen
 *
 */
public class HoppeCar {
	private int horsePower;
	private int mileAge;
	
	public HoppeCar(){
		this.horsePower = 0 ;
		this.mileAge = 0;
	}

	public HoppeCar(int horsePower, int mileage){
		this.horsePower = horsePower ;
		this.mileAge = mileage ;
	}
	
	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public int getMileAge() {
		return mileAge;
	}

	public void setMileAge(int mileAge) {
		this.mileAge = mileAge;
	}

	public String toString(){
		return this.getClass().getSimpleName() + " km: " + this.mileAge + " ps: " + this.horsePower;
	}
	
	
	
	
	
}

/**
 * 
 */
package HashMap;

/**
 * @author Steinhagen
 *
 */
public class Car {
	private int id;
	private int mileAge;
	private int horsePower;
	
	public Car(){
		
	}
	
	public Car(int id, int mileAge, int horsePower){
		this.id = id;
		this.mileAge = mileAge;
		this.horsePower = horsePower;		
	}
	
	public int getId(){
		return this.id;
	}

	public int getMileAge() {
		return mileAge;
	}

	public void setMileAge(int mileAge) {
		this.mileAge = mileAge;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	@Override
	public String toString() {
		return "Car [id=" + id + ", mileAge=" + mileAge + ", horsePower="
				+ horsePower + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + horsePower;
		result = prime * result + id;
		result = prime * result + mileAge;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (horsePower != other.horsePower)
			return false;
		if (id != other.id)
			return false;
		if (mileAge != other.mileAge)
			return false;
		return true;
	}
	
}
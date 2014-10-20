/**
 * 
 */
package AutoAufgabe;

import java.util.TreeSet;

/**
 * @author Steinhagen
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Car> treeCar = new TreeSet<>();
		treeCar.add(new Car(true, 100));
		treeCar.add(new Car(true, 1000));
		treeCar.add(new Car(true, 10000));
		treeCar.add(new Car(true, 100000));
		
		for(Car s: treeCar){
			System.out.println(s);
		}
	}

}

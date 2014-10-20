/**
 * 
 */
package HashMap;

import java.util.HashMap;

/**
 * @author Steinhagen
 *
 */
public class CollectionMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car dummy = new Car (1,0,200);
		System.out.println(dummy);
		HashMap<Integer, Car> hmCar = new HashMap<>();
		for(int i=0;i++<20;){
			hmCar.put(i, new Car(i,0,i*15));	
		}
		for(Integer i: hmCar.keySet() ){
			System.out.println(hmCar.get(i));
			
		}
	}

}

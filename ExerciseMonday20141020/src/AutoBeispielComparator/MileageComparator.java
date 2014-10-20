/**
 * 
 */
package AutoBeispielComparator;

import java.util.Comparator;

/**
 * @author Steinhagen
 *
 */
public class MileageComparator implements Comparator<HoppeCar>{

	
	
	@Override
	public int compare(HoppeCar o1, HoppeCar o2) {
		
		return o1.getMileAge() - o2.getMileAge();
	}
	
}

/**
 * 
 */
package AutoBeispielComparator;

import java.util.Comparator;

/**
 * @author Steinhagen
 *
 */
public class HorsePowerComparator implements Comparator<HoppeCar> {

	@Override
	public int compare(HoppeCar arg0, HoppeCar arg1) {
		// TODO Auto-generated method stub
		return arg0.getHorsePower() - arg1.getHorsePower();
	}

	
}

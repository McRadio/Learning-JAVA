import java.util.Arrays;

/**
 * @author Steinhagen
 *
 */
public class Sortieren {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=9;
		int [] a = new int [i+1];
		for (; i>=0; i--) {
			a[i] = myRandom();
		}
		System.out.println(	Arrays.toString(a));
		Bubblesort.sortieren(a);
		System.out.println(	Arrays.toString(a));
	}

	public static int myRandom() {
		return (int) (Math.random()*10);
	}
}
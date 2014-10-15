import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * @author Steinhagen
 *
 */
public class Sortieren {

	/**
	 * @param args
	 * @throws IOException 
	 */
	
	public static void main(String[] args) throws IOException {
		PrintWriter ausgabe = null;
		PrintWriter ausgabeSorted = null;
		try{
			// TODO Auto-generated method stub
			int i=9;
			int [] a = new int [i+1];
			for (; i>=0; i--) {
				a[i] = myRandom();
			}
			System.out.println(	Arrays.toString(a));

			ausgabe = new  PrintWriter(new FileWriter("unsorted.txt"));
			ausgabe.println(Arrays.toString(a));
			Bubblesort.sortieren(a);
			ausgabeSorted = new  PrintWriter(new FileWriter("sorted.txt"));
			System.out.println(	Arrays.toString(a));
			ausgabeSorted.println(Arrays.toString(a));
				
		}finally
		{
			if(ausgabe != null){
				ausgabe.close();
			}
			if(ausgabeSorted != null){
				ausgabeSorted.close();
			}
		}
	}

	public static int myRandom() {
		return (int) (Math.random()*10);
	}
}
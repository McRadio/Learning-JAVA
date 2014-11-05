/**
 * 
 */
package practice;

/**
 * @author Steinhagen
 *
 */
public class HauptProgramm {
	
	public static void main(String[] args){
		 ListenKlasse list = new ListenKlasse();
	        list.addLast("1");
	        list.addLast("2");
	        list.addLast("3");
	        list.addLast("4");
	        list.addLast("5");
	        System.out.println("erstes Element: " + list.getFirstElement().getObj());
	        list.writeList();
	        list.removeFirst();
	        System.out.println("erstes Element: " + list.getFirstElement().getObj());
	        list.writeList();
	        
	    } 
}


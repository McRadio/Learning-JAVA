/**
 * 
 */
package AbstrakteFabrik;

/**
 * @author Steinhagen
 *
 */
public class TextRow extends Row {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		for(Cell c: this.cells){
			c.display();
			
		}
		
		System.out.println("|");
		System.out.println("  +-----+-----------------------+");
	}





}

/**
 * 
 */
package AbstrakteFabrik;

/**
 * @author Steinhagen
 *
 */
public class HtmlRow extends Row {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("\t<tr>");
		
		for(Cell c: this.cells){
			c.display();
		}
		System.out.println("\t</tr>");
	}





}

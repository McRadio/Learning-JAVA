/**
 * 
 */
package AbstrakteFabrik;

/**
 * @author Steinhagen
 *
 */
public class TextTable extends Table {

	/* (non-Javadoc)
	 * @see AbstrakteFabrik.Table#display()
	 */
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("  +-----+-----------------------+");
		for(Row r: this.rows){
			r.display();
		}
		
	}

}

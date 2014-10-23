/**
 * 
 */
package AbstrakteFabrik;

/**
 * @author Steinhagen
 *
 */
public class HtmlTable extends Table {

	/* (non-Javadoc)
	 * @see AbstrakteFabrik.Table#display()
	 */
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("<Table>");
		for(Row r: this.rows){
			r.display();
		}
		
		System.out.println("</Table>");
	}

}

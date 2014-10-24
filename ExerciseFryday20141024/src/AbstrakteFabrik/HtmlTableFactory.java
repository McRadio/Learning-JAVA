/**
 * 
 */
package AbstrakteFabrik;

/**
 * @author Steinhagen
 *
 */
public class HtmlTableFactory extends TableFactory{

	@Override
	public Table createTable() {
		// TODO Auto-generated method stub
		return new HtmlTable();
	}

	@Override
	public Row createRow() {
		// TODO Auto-generated method stub
		return new HtmlRow();
	}

	@Override
	public Cell createCell(String content) {
		// TODO Auto-generated method stub
		return new HtmlCell(content);
	}
	
	
}

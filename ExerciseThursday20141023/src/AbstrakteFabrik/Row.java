/**
 * 
 */
package AbstrakteFabrik;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Steinhagen
 * 
 */
public abstract class Row {

	protected List<Cell> cells = new ArrayList<>();

	/**
	 * eine Methode , um n-Zellen zu einer Zeile hinzuzuf�gen
	 * 
	 * @param c
	 *            ist die hinzuzuf�gende Zelle
	 */

	public void addCell(Cell c) {
		this.cells.add(c);
	}

	public abstract void display();
}

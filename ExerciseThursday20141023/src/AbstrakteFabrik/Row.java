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
	 * eine Methode , um n-Zellen zu einer Zeile hinzuzufügen
	 * 
	 * @param c
	 *            ist die hinzuzufügende Zelle
	 */

	public void addCell(Cell c) {
		this.cells.add(c);
	}

	public abstract void display();
}

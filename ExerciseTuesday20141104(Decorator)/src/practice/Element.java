/**
 * 
 */
package practice;

/**
 * @author Steinhagen
 *
 */
public class Element {

	/**
	 * 
	 */
	protected Object obj;

	protected Element next;
	
	public Element(Object obj) {
		// TODO Auto-generated constructor stub
		this.obj = obj;
		next = null; 
	}

	public Object getObj() {
		return obj;
	}

	public Element getNext() {
		return next;
	}

	public void setNext(Element next) {
		this.next = next;
	}
	
	

}

/**
 * 
 */
package practice;

/**
 * @author Steinhagen
 *
 */
public class ListenKlasse {

	/**
	 * 
	 */
	public ListenKlasse() {
		// TODO Auto-generated constructor stub
	}
	
	Element startElement = new Element("Kopf");
	
	public void addLast(Object o){
		Element newElement = new Element(o);
		Element lastElement = getLastElement();
		lastElement.setNext(newElement);
	}
	
 
	 public void removeFirst(){
		 Element le = startElement;
		 startElement = le.getNext();
		 while(le.getNext() != null){
			 le = le.getNext();			 
		 }
		 
	 }

	public Element getFirstElement(){
		 return startElement;
	 }
	 
	 public Element getLastElement() {
	        Element le = startElement;
	        while(le.getNext() != null){
	            le = le.getNext();
	            
	        }
	        return le;
	    }
	
	 public void writeList() {
	        Element le = startElement;
	        while(le != null){
	            System.out.println(le.getObj());
	            le = le.getNext();
	        }
	    } 
	
}

	
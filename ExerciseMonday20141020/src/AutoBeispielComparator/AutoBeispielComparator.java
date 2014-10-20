package AutoBeispielComparator;

import java.util.Iterator;
import java.util.TreeSet;

public class AutoBeispielComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HoppeCar steini = new HoppeCar(200, 1000);
		System.out.println(steini);
		
		HoppeCar steve = new HoppeCar(150, 10000);
		System.out.println(steve);
		
		TreeSet<HoppeCar> thcMileAge = new TreeSet<>(new MileageComparator());
		TreeSet<HoppeCar> thcHorsePower = new TreeSet<>(new HorsePowerComparator());
		
		thcMileAge.add(new HoppeCar(0,0));
		thcMileAge.add(new HoppeCar(30,10000));
		thcMileAge.add(new HoppeCar(100,1000));
		thcMileAge.add(new HoppeCar(50,5000));
		thcMileAge.add(new HoppeCar(70,3000));
		thcMileAge.add(new HoppeCar(250,35000));
		thcMileAge.add(new HoppeCar(225,10000));
		thcMileAge.add(new HoppeCar(75,100000));
		thcMileAge.add(new HoppeCar(65,4500));
		
		for(HoppeCar hc: thcMileAge){
			System.out.println(hc);
			
		}
		//absteigende Reihenfole:
		Iterator<HoppeCar> itHc = thcMileAge.descendingIterator();
		while(itHc.hasNext()){
			System.out.println(itHc.next());
			
		}
		
		thcHorsePower.add(new HoppeCar(0,0));
		thcHorsePower.add(new HoppeCar(30,10000));
		thcHorsePower.add(new HoppeCar(100,1000));
		thcHorsePower.add(new HoppeCar(50,5000));
		thcHorsePower.add(new HoppeCar(70,3000));
		thcHorsePower.add(new HoppeCar(250,35000));
		thcHorsePower.add(new HoppeCar(225,10000));
		thcHorsePower.add(new HoppeCar(75,100000));
		thcHorsePower.add(new HoppeCar(65,4500));
		
		for(HoppeCar hc: thcHorsePower){
			System.out.println(hc);
			
		}
	}

}

/**
 * 
 */
package VollkommenZahl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * @author Steinhagen
 *
 */
public class PerfekteZahlen {

	/**
	 * @param args
	 */
	public static boolean primZahlTest(int x){
		boolean ret = true;
			if(x/x==1 && x/1 ==x){
				int teiler=2;
				do{
					if(x%teiler==0){
						ret = false;
						break;
					}
					teiler++;
				}while(teiler*teiler <= x);
		}
		return ret;
	}
	
	
	static PrintWriter ausgabe = null;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try{
			
			long [] pZahlen = new long [6];
			int i=1;
			int m=1;
			do{
				
				if( i==2 || i%2==1){
					int basis=2, potenz=1, potenz2=1;
					for(int r=0;r<i-1;r++){
						potenz = potenz * basis;
					}
					for(int r=0;r<i;r++){
						potenz2 = potenz2 * basis;
					}
						if( potenz2 > 1 ){
							potenz2--;
							
						}else{
							potenz2 = 1;
						}
					if(potenz * potenz2 != 1 && potenz * potenz2 != 0 ){
						if(pZahlen[m-1] != potenz * potenz2){
							if(primZahlTest(potenz2)){
								pZahlen[m] = potenz * potenz2;
								m++;
							}
						}	
					}		
				}		
				i++;
				
			}while(m<6);
			ausgabe = new  PrintWriter(new FileWriter("VollkommeneZahlen.txt"));
			ausgabe.println(Arrays.toString(pZahlen));
			System.out.println(Arrays.toString(pZahlen));
			}finally{
				if(ausgabe != null){
					ausgabe.close();
				}
				
			}
	}

}

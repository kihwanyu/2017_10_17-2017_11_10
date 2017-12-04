package practice1;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lottoDisplay();
	}
	public static void lottoDisplay(){
		Random rd = new Random();
		
		TreeSet<Integer> lhset = new TreeSet<Integer>();
		do {			
			lhset.add(rd.nextInt(45)+1);
		} while (lhset.size()<6);
		
		System.out.println(lhset.toString());
		Object[] arr = lhset.toArray();
		
		for(int i = 0; i < arr.length; i++){
			//System.out.println(arr[i]);
			System.out.println(Integer.parseInt(String.valueOf(arr[i]).toString()));
		}
		
		/*Iterator<Integer> iter = lhset.iterator(); 
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}*/
	}
}

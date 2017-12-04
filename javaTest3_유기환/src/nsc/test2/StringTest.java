package nsc.test2;

public class StringTest {

	public static void main(String[] args) {
		String str = "1.22,4.12,5.93,8.71,9.34"; 
		double data[]= new double[5];      
		double sum = 0; 
		int count = 0;
		String[] st = str.split(",");
		
		for(String s : st){
			data[count] = Double.parseDouble(s);
			count++;
		}
		for(int i = 0; i < data.length; i++){
			sum+=data[i];
		}
		
		
		System.out.printf("ÇÕ°è : %3.3f\n",sum);
		System.out.printf("Æò±Õ : %3.3f",sum/data.length);
	}

}

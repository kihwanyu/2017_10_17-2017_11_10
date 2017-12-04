package nsc.test1;

public class ArrayTest {

	public static void main(String[] args) {
		int[][] array = {{12, 41, 36, 56, 21}, 
						{82, 10, 12, 61, 45}, 
						{14, 16, 18, 78, 65}, 
						{45, 26, 72, 23, 34}};
		double tot = 0;
		double avg = 0;
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				tot+=array[i][j];
			}
		}
		avg = tot/(array.length*array[0].length);
		
		System.out.printf("ÇÕ°è : %3.2f\n" , tot);
		System.out.println("Æò±Õ : " + avg);
	}

}

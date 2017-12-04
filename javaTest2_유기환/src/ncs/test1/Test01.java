package ncs.test1;

import java.util.Scanner;

public class Test01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		String str = " ";
		
	
        System.out.print("5개의 점수를 입력해주세요. 예)10 20 40 50 80 = ");
        str = sc.nextLine();
		String[] words = str.split(" ");
		double[] wordsInteger = new double[words.length];
		double tot = 0;
		//System.out.println(words.length);
		
		if(words.length == 5){
			
			for(int i = 0; i < words.length; i++){
				wordsInteger[i] = Double.parseDouble(words[i]);				
				if(wordsInteger[i]<10||wordsInteger[i]>99){ 
					System.out.println("다시 입력해주세요.");
					return;
				}
				
			}
			
			
			tot+=((wordsInteger[0]+wordsInteger[1])/2)*0.6;
			tot+=((wordsInteger[2]+wordsInteger[3])/2)*0.2;
			tot+=wordsInteger[4]*0.2;
			
			
			System.out.printf("평가 점수는 : %d점\n",(int)tot);
			if(tot>=90){
				System.out.println("Gold Class");
			} else if(tot>=80) {
				System.out.println("Silver Class");
			} else if(tot>=70) {
				System.out.println("Bronze Class");
			} else {
				System.out.println("Nomal Class");
			}
		} else {
			System.out.println("다시입력하세요.");
		}
	}
}

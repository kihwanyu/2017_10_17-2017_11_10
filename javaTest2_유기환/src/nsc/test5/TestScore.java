package nsc.test5;

import java.util.Scanner;

public class TestScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[][] score = new double[3][5];
		//과목1 과목2 과목3 총점 평균
		for(int i = 0; i < score.length; i++){
			for(int j = 0; j < score[i].length-2;j++){
				System.out.print("index["+i+"]"+"과목"+(j+1)+"의 점수를 입력하세요. = ");
				score[i][j] = sc.nextDouble();
				sc.nextLine();
			}
			score[i][3] = 0;
			score[i][4] = 0;
		}
		
		for(int i = 0; i < score.length; i++){
			for(int j = 0; j < score[i].length-2;j++){	
				score[i][3] += score[i][j];
			}
		}
		for(int i = 0; i < score.length; i++){
			score[i][4] += score[i][3]/3;
		}
		System.out.printf("index\t과목1\t과목2\t과목3\t총점\t평균\n");
		for(int i = 0; i < score.length; i++){
			System.out.printf("%d\t",i);
			for(int j = 0; j < score[i].length;j++){
				System.out.printf("%03.1f\t",score[i][j]);
			}
			System.out.println(" ");
		}
		
	}
}

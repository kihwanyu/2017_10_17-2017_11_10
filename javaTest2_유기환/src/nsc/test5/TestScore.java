package nsc.test5;

import java.util.Scanner;

public class TestScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[][] score = new double[3][5];
		//����1 ����2 ����3 ���� ���
		for(int i = 0; i < score.length; i++){
			for(int j = 0; j < score[i].length-2;j++){
				System.out.print("index["+i+"]"+"����"+(j+1)+"�� ������ �Է��ϼ���. = ");
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
		System.out.printf("index\t����1\t����2\t����3\t����\t���\n");
		for(int i = 0; i < score.length; i++){
			System.out.printf("%d\t",i);
			for(int j = 0; j < score[i].length;j++){
				System.out.printf("%03.1f\t",score[i][j]);
			}
			System.out.println(" ");
		}
		
	}
}

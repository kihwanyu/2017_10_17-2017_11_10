package silsub2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.util.Stack;

public class SungjukProcess {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		//sungjukSave();
		scoreRead();
	}
	
	public static void sungjukSave(){
		int[] kor = new int[10];
		int[] eng = new int[10];
		int[] mat = new int[10];
		int[] tot = new int[10];
		double[] avg = new double[10];
		int count = 0;
		for(int i = 0;i < kor.length; i++){
			System.out.print("["+i+"]번째 "+"국어점수를 입력하세요. = ");
			kor[i] = sc.nextInt();
			sc.nextLine();
			System.out.print("["+i+"]번째 "+"수학점수를 입력하세요. = ");
			eng[i] = sc.nextInt();
			sc.nextLine();
			System.out.print("["+i+"]번째 "+"영어점수를 입력하세요. = ");
			mat[i] = sc.nextInt();
			sc.nextLine();
			tot[i] = kor[i] + eng[i] + mat[i];
			avg[i] = (double)tot[i]/3;
			count++;
			System.out.print("계속 저장하시겠습니까?(y,n) = ");
			char result = sc.next().charAt(0);
			sc.nextLine();
			if(result=='Y'||result=='y'){
				
			} else {
				System.out.println("score.dat 에 저장 완료.");
				break;
			}
		}

		try (DataInputStream din = new DataInputStream(new FileInputStream("score.txt"));
				DataOutputStream dout = new DataOutputStream(new FileOutputStream("score.txt"))) {
			for(int i = 0 ; i < count ; i++){
				dout.writeInt(kor[i]);
				dout.writeInt(eng[i]);
				dout.writeInt(mat[i]);
				dout.writeInt(tot[i]);
				dout.writeDouble(avg[i]);
			}
			
			while (true) {
				try{
				System.out.println(din.readInt() + "," + din.readInt()+ "," + din.readInt()
				+ "," + din.readInt() + "," + din.readDouble());
				} catch (EOFException e) {
					e.getStackTrace();
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		} 
		
	}
	public static void scoreRead(){
		int[] kor = new int[10];
		int[] eng = new int[10];
		int[] mat = new int[10];
		int[] tot = new int[10];
		int total_all = 0;
		double avg_all = 0.0;
		double[] avg = new double[10];
		int value = 0;
		int count = 0;
		try (DataInputStream din = new DataInputStream(new FileInputStream("score.txt"));
				DataOutputStream dout = new DataOutputStream(new FileOutputStream("score.txt"))) {
			/*while(){
				kor[count] = din.readInt();
				eng[count] = din.readInt();
				mat[count] = din.readInt();
				tot[count] = din.readInt();
				avg[count] = din.readDouble();
				count++;
			}*/
			for(int i = 0; i < count; i++){
				total_all+=tot[i];
				avg_all+=avg[i];
			}

		for(int i = 0; i < count; i++){
				System.out.printf("%d %d %d %d %3.2f",kor[i],eng[i],mat[i],tot[i],avg[i]);			
			}
		} catch (Exception e) {
			// TODO: handle exception
		} 
	}
	 /*- Field
		- sc:Scanner	//초기화 객체 생성함
	 - main() 메소드 포함
		1. 실행을 위한 객체 생성
		2. 메소드 실행
	 - public void sungjukSave(){}
		1. 정수형으로국어, 영어, 수학 점수를 입력받아,
		2. 총점(int), 평균(double)을 계산하고
		3. "score.dat" 파일에 국, 영, 수, 총점, 평균을 기록 저장함
		4. "계속 저장하시겠습니까? (y/n) : " 에서 'Y'이면 반복 실행함
		5. 'N' 이면 반복 종료하고, "score.dat 에 저장 완료." 출력함
	 - public void scoreRead(){}
		1. 파일에 기록된 정보를 국, 영, 수, 총점, 평균 순으로 읽어와서
		2. 변수에 저장하고 출력하고, 총점의 합, 평균의 합을 구하고
		  단, 평균은 소숫점 둘째자리까지만 출력되게 함
		3. 전체 총점과 전체 평균을 읽어온 횟수로 나누어 
			읽은 횟수와 전체총점, 전체 평균 화면 출력함
		  단, 전체 평균은 소숫점 둘째자리까지만 출력되게 함
		4. 읽기가 끝나면 "score.dat 파일 읽기 완료." 출력	*/

}

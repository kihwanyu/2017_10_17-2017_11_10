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
			System.out.print("["+i+"]��° "+"���������� �Է��ϼ���. = ");
			kor[i] = sc.nextInt();
			sc.nextLine();
			System.out.print("["+i+"]��° "+"���������� �Է��ϼ���. = ");
			eng[i] = sc.nextInt();
			sc.nextLine();
			System.out.print("["+i+"]��° "+"���������� �Է��ϼ���. = ");
			mat[i] = sc.nextInt();
			sc.nextLine();
			tot[i] = kor[i] + eng[i] + mat[i];
			avg[i] = (double)tot[i]/3;
			count++;
			System.out.print("��� �����Ͻðڽ��ϱ�?(y,n) = ");
			char result = sc.next().charAt(0);
			sc.nextLine();
			if(result=='Y'||result=='y'){
				
			} else {
				System.out.println("score.dat �� ���� �Ϸ�.");
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
		- sc:Scanner	//�ʱ�ȭ ��ü ������
	 - main() �޼ҵ� ����
		1. ������ ���� ��ü ����
		2. �޼ҵ� ����
	 - public void sungjukSave(){}
		1. ���������α���, ����, ���� ������ �Է¹޾�,
		2. ����(int), ���(double)�� ����ϰ�
		3. "score.dat" ���Ͽ� ��, ��, ��, ����, ����� ��� ������
		4. "��� �����Ͻðڽ��ϱ�? (y/n) : " ���� 'Y'�̸� �ݺ� ������
		5. 'N' �̸� �ݺ� �����ϰ�, "score.dat �� ���� �Ϸ�." �����
	 - public void scoreRead(){}
		1. ���Ͽ� ��ϵ� ������ ��, ��, ��, ����, ��� ������ �о�ͼ�
		2. ������ �����ϰ� ����ϰ�, ������ ��, ����� ���� ���ϰ�
		  ��, ����� �Ҽ��� ��°�ڸ������� ��µǰ� ��
		3. ��ü ������ ��ü ����� �о�� Ƚ���� ������ 
			���� Ƚ���� ��ü����, ��ü ��� ȭ�� �����
		  ��, ��ü ����� �Ҽ��� ��°�ڸ������� ��µǰ� ��
		4. �бⰡ ������ "score.dat ���� �б� �Ϸ�." ���	*/

}

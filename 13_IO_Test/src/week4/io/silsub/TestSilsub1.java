package week4.io.silsub;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestSilsub1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fileSave();
		fileRead();
	}
	public static void fileSave(){
		BufferedReader br = null;
		FileWriter fw = null;
		String value = null;
		
		try {
			fw = new FileWriter("test.txt");
			br = new BufferedReader(new InputStreamReader(System.in));
			while(true){
				System.out.println("���Ͽ� ������ ������ �Է��Ͻÿ�.");
				
				value = br.readLine();
				
				if(value.equals("exit")) {
					System.out.println("���Ͽ� ���������� ����Ǿ����ϴ�.");
					return;
				}
				fw.write(value);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		
	}
	/*>> main() ����
	=> fileSave() �޼ҵ� ������

	>> �޼ҵ� �߰���
	+ fileSave() : void
	=> Ű����� ����� ���ϸ��� �Է¹���
		BufferedReader�� readLine() �����
	=> ������¿� ��Ʈ�� ��ü ������
		FileWriter �����
	=> ȭ�鿡 "���Ͽ� ������ ������ �Է��Ͻÿ�." ���
		�Է°��� �о�鿩�� �ٷ� ���Ͽ� ��� ����ó��
		�ݺ�������
	=> "exit"�� �ԷµǸ�, �ݺ��� �����ϰ�
		ȭ�鿡 "���Ͽ� ���������� ����Ǿ����ϴ�." ����ϰ�
	=> ������� ��Ʈ���� ����.*/
	static void fileRead() {
		FileReader fr = null;
		StringBuilder sb = null;
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("���� ���� �̸��� �Է��ϼ���. = ");
			String fileName = br.readLine();
			
			fr = new FileReader(fileName);
			
			int value;
			sb = new StringBuilder();
			
			while((value = fr.read())!= -1){
				sb.append((char)value);
				//System.out.print((char)value);
			}
			String str = sb.toString();
			System.out.println(str);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				br.close();
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
 	/*>> �޼ҵ�
	+ fileRead() : void
	=> Ű����� ���� ������ϸ��� �Է¹���
	=> ���� �б�� ��Ʈ�� ��ü ������ : FileReader ���
	=> ���� ���� ������ �о, StringBuilder �� ������
	=> �� ���� ����, StringBuilder �� ������ ���� 
	   String���� �ٲپ� ȭ�鿡 �����*/


}

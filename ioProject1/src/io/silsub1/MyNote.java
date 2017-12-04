package io.silsub1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MyNote {
	private Scanner sc = new Scanner(System.in);
	public void fileSave(){
		String str = null;
		FileWriter fw = null;
		StringBuilder sb = new StringBuilder();
		for(;;){
			System.out.print("���Ͽ� ������ ������ �Է����ּ���.");
			
			str = sc.nextLine();
			sb.append(str);
			if(str.equals("exit")){
				char result;
				System.out.print("�����Ͻðڽ��ϱ�?(y,n) = ");
				result = sc.next().charAt(0);
				sc.nextLine();
				if(result=='y'||result=='Y'){
					System.out.print("������ ���ϸ� : ");
					String fileName = sc.nextLine();
					try {
						fw = new FileWriter(fileName+".txt");
						fw.write(sb.toString());
						System.out.println(sb.toString());
						System.out.println(fileName+".txt ���Ͽ� ���������� ����Ǿ����ϴ�.");
					} catch (IOException e) {	
						e.printStackTrace();
					} finally {
						try {
							fw.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					break;
				} else {
					System.out.println("�߸��� �Է����� ����˴ϴ�.");
					return;
				}
			}
		}
	}
	public void fileOpen(){
		FileReader fr = null;
		StringBuilder sb = null;
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("������ ���ϸ� : ");
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
	public void fileEdit(){
		String str = null;
		FileWriter fw = null;
		StringBuilder sb = new StringBuilder();
		FileReader fr = null;
		
		String updateFileName = null;
		
		System.out.print("������ ���ϸ� : ");
		updateFileName = sc.nextLine();
		
		try {
			fr = new FileReader(updateFileName);
			
			int value;
			sb = new StringBuilder();
			
			while((value = fr.read())!= -1){
				sb.append((char)value);
				//System.out.print((char)value);
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for(;;){
			System.out.print("���Ͽ� �߰��� ������ �Է����ּ���.");
			
			str = sc.nextLine();
			sb.append(str);
			if(str.equals("exit")){
				char result;
				System.out.print("����� ������ �����Ͻðڽ��ϱ�?(y,n) = ");
				result = sc.next().charAt(0);
				
				if(result=='y' || result=='Y'){
					try {
						fw = new FileWriter(updateFileName);
						fw.write(sb.toString());
						System.out.println(sb.toString());
						System.out.println(updateFileName+" ������ ������ ����Ǿ����ϴ�.");
					} catch (IOException e) {	
						e.printStackTrace();
					} finally {
						try {
							fw.close();
							fr.close();
							
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					break;
				} else {
					System.out.println("�߸��� �Է����� ����˴ϴ�.");
					return;
				}
			}
		}
	}
	/* fileEdit() �޼ҵ� -----------------------------------------
	1. "������ ���ϸ� : " ����ϰ�, ���ϸ� �Է¹���
	2. ���� �Է� ��Ʈ�� ����
	3. ���� ��� ��Ʈ�� ���� : ��, ���� ���� �� ���·� ������ ��
	4. ������ ������ �о�, StringBuilder �� ����
	5. "���Ͽ� �߰��� ������ �Է��Ͻÿ�." ����ϰ�, �߰��� ���� �Է¹���
	6. �߰������� StringBuilder �� �߰��� : �ݺ�
	7. "exit" �Է��ϸ� �ݺ� ������
	8. "����� ������ ���Ͽ� �߰��Ͻðڽ��ϱ�? (y/n) : " ���
	9. ��ҹ��� ������� 'Y'�̸�, ���Ͽ� �����
	10. "ooo.txt ������ ������ ����Ǿ����ϴ�." ���
	11. ��Ʈ�� �ݳ��ϰ� ������*/
}

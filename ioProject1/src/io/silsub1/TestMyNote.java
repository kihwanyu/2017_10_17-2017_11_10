package io.silsub1;

import java.util.Scanner;

public class TestMyNote {
	
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		MyNote mn = new MyNote();
		//mn.fileSave();
		//mn.fileOpen();
		//mn.fileEdit();
		while(true){
			
			int key = 0;
			System.out.println("******   MyNote  *******");
			System.out.println("1. ��Ʈ ���� �����");
			System.out.println("2. ��Ʈ ����");
			System.out.println("3. ��Ʈ ��� �����ϱ�");
			System.out.println("4. ������");
			System.out.print("�޴� ���� : ");
			System.out.println(sc.hasNext());
			if (sc.hasNext()) {
				key = sc.nextInt();
			}
			switch (key) {
			case 1:
				mn.fileSave();
				break;
			case 2:
				mn.fileOpen();
				break;
			case 3:
				mn.fileEdit();
				break;
			case 4:
				System.out.println("���α׷��� �����մϴ�.");
				return;
	
			default:
				System.out.println("�߸����Է��Դϴ�.");
				break;
			}
		}
		/*******   MyNote  *******
		1. ��Ʈ ���� �����		//MyNote�� fileSave()
		2. ��Ʈ ����		//MyNote�� fileOpen()
		3. ��Ʈ ��� �����ϱ�	//MyNote�� fileEdit()
		4. ������		//main() ���� ����

		�޴� ���� : ��ȣ�Է�

		�Էµ� ��ȣ�� ����, MyNote �� �޼ҵ� �����Ŵ
		�޴� �ݺ� ����*/
	}

}

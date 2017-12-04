package board.view;

import java.util.Scanner;

import board.controller.BoardManager;

public class BoardMenu {
	/*1. �ʵ� : Scanner ��ü ����
	2. ������ : ����Ʈ������
	3. public void mainMenu() �޼ҵ� �ۼ�
	  >> ��³���*/
	private static Scanner sc = new Scanner(System.in);
	public BoardMenu(){
		
	}
	public void mainMenu(){
		BoardManager bm = new BoardManager();
		while(true){
			System.out.println("******* �Խñ� ���� ���α׷� *******");
			System.out.println("1. �Խñ� ���� ");		//BoardManager�� writeBoard() ����
			System.out.println("2. �Խñ� ��ü ���� ");		//		displayAllList()
			System.out.println("3. �Խñ� �Ѱ� ���� ");		//		displayBoard()
			System.out.println("4. �Խñ� ���� ���� ");		//		modifyTitle()
			System.out.println("5. �Խñ� ���� ���� ");		//		modifyContent()
			System.out.println("6. �Խñ� ���� ");	//		deleteBoard()
			System.out.println("7. �Խñ� �˻� ");	//		searchBoard()
			System.out.println("8. ���Ͽ� �����ϱ� ");		//		saveListFile()
			System.out.println("9. �����ϱ� ");		// boardMenu �� sortSubMenu() ����
			System.out.println("0. ������	");	//main() ���� ������
			System.out.print("�޴� ��ȣ : ");
			int key = sc.nextInt();
			sc.nextLine();
			switch (key) {
			case 1:
				bm.writeBoard();
				break;
			case 2:
				bm.displayAllList();
				break;
			case 3:
				bm.displayBoard();
				break;
			case 4:
				bm.modifyTitle();
				break;
			case 5:
				bm.modifyContent();
				break;
			case 6:
				bm.deleteBoard();		
				break;
			case 7:
				bm.searchBoard();
				break;
			case 8:
				bm.saveListFile();
				break;
			case 9:
				sortSubMenu();
				break;
			case 0:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
				break;
			}
		}
	}
	
	public static void sortSubMenu() {
		BoardManager bm = new BoardManager();
		System.out.println("****** �Խñ� ���� �޴� ******");
		System.out.println("1. �۹�ȣ�� ������������ ");	//BoardManager �� 	sortList(1, false) ����
		System.out.println("2. �۹�ȣ�� ������������ ");	//		sortList(1, true) ����
		System.out.println("3. �ۼ���¥�� ������������ ");	//		sortList(2, false) ����		
		System.out.println("4. �ۼ���¥�� ������������ ");	//		sortList(2, true) ����
		System.out.println("5. ������� ������������ ");	//		sortList(3, false) ����
		System.out.println("6. ������� ������������ ");	//		sortList(3, true) ����
		System.out.println("7. ���� �޴��� �̵� ");		//return ó��
		System.out.print("�޴� ��ȣ : ");
		int key = sc.nextInt();
		sc.nextLine();
		switch (key) {
		case 1:
			bm.sortList(1, false);
			break;
		case 2:
			bm.sortList(1, true);
			break;
		case 3:
			bm.sortList(2, false);
			
			break;
		case 4:
			bm.sortList(2, true);
			
			break;
		case 5:
			bm.sortList(3, false);
			
			break;
		case 6:
			bm.sortList(3, true);	
			break;
		case 7:
			System.out.println("�����޴��� ���ư��ϴ�.");
			return;
		default:
			System.out.println("�߸��� �Է��Դϴ�.");
			break;
		}
	}
}

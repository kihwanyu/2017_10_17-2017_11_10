package practice2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManager {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		menu();
		
		
		
		/**** ���� ���� ���α׷� ***

		1. �� ���� �߰�	//addBook(inputBook() �� ������ ��ü) ����
		2. �������� ������ ��� //sortedBookList() ���� 
				=> Book[] ���Ϲ޾� printBookList(Book[]) ����
		3. ���� ����	//deleteBook(������ �ε���) ����
		4. ���� �˻����	//searchBook(�˻��� ������) ���� 
				=> index ���Ϲ޾� printBook(index) ����
		5. ��ü ���	//displayAll() ����
		6. ������

		>>�߰�, ����, �˻��� �ʿ��� Ű������ Ű����� �Է¹޵��� ��
		//Book ��ü�� �ʵ尪�� Ű����� �Է¹޾� �ʱ�ȭ�ϰ� ��ü ����
		+ static inputBook() : Book

		//���� �Ǵ� �˻��� ���� ���� Ÿ��Ʋ�� Ű����� �Է¹޾� ����
		+ static inputBookTitle() : String

		>> ������ �޴� ���� �������� �޴� �ݺ� ����ǵ��� ó����*/
	
	}
	public static void menu() {
		
		ArrayList<Book> arraylist = new ArrayList<>();
		while(true){
			
		System.out.println("*** ���� ���� ���α׷� ***");
		System.out.println("1. �� ���� �߰� ");
		System.out.println("2. �������� ");
		System.out.println("3. ���� ���� ");
		System.out.println("4. ���� �˻����	");
		System.out.println("5. ��ü ��� ");
		System.out.println("6. ������ ");
		System.out.println("******************");
		System.out.print("��ȣ�� �Է����ּ���.");
		
		int key = sc.nextInt();
		sc.nextLine();
			switch (key) {
			case 1:
				/*arraylist.add(new Book("1", 4, "��� �ᳪ��", null));
				arraylist.add(new Book("2", 1, "����� ������", null));
				arraylist.add(new Book("3", 3, "�����", null));
				arraylist.add(new Book("4", 5, "�ŵ�����", null));
				arraylist.add(new Book("5", 2, "���ݼ���", null));*/
				addBook(arraylist);
				break;
			case 2:
				sortedBookList(arraylist);
				printBookList(arraylist);
				break;
			case 3:
				deleteBook(arraylist);
				break;
			case 4:
				searchBook(arraylist);
				break;
			case 5:
				printBookList(arraylist);
				break;
			case 6:
				System.out.println("�ý����� �����ϰڽ��ϴ�.");
				return;
			default:
				System.out.println("�ٽ��Է����ּ���.");
				break;
			}
		}
	}
	public static void addBook(ArrayList<Book> arraylist){
		String bNo;
		int cartegory;
		String title;
		String author;
		System.out.print("å�� ��ȣ�� �Է����ּ���.");
		bNo = sc.nextLine();
		System.out.print("ī�װ��� �Է����ּ���.");
		cartegory = sc.nextInt();
		sc.nextLine();
		System.out.print("å�� ���� �Է����ּ���.");
		title = sc.nextLine();
		System.out.print("å�� �۰��� �Է����ּ���.");
		author = sc.nextLine();
		
		arraylist.add(new Book(bNo, cartegory, title, author));
	}
	
	public static void deleteBook(ArrayList<Book> arraylist){
		int index = 0;
		System.out.println("�����Ϸ��� �ϴ� �ε����� �Է����ּ���.");
		index = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < arraylist.size(); i++){
			arraylist.remove(i);
		}
	}
	public static void sortedBookList(ArrayList<Book> arraylist){
		arraylist.sort(new AscCategory());
	}
	public static void printBookList(ArrayList<Book> arraylist){
		for(Book b : arraylist){
			System.out.println(b);
		}	
	}
	public static void searchBook(ArrayList<Book> arraylist){
		String title = " ";
		System.out.println("�˻��Ϸ��� å�� ������ �Է����ּ���.");
		title = sc.nextLine();
		
		for(int i = 0; i < arraylist.size(); i++){
			System.out.println(arraylist.get(i).getTitle());
			if(arraylist.get(i).getTitle().equals(title)){
				System.out.println(arraylist.get(i));
				break;
			}
		}
	}
}

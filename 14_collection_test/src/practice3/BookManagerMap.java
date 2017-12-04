package practice3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import practice2.Book;

public class BookManagerMap {
		static Scanner sc = new Scanner(System.in);
		static HashMap<String, Book> bookMap = new HashMap<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
		
	}
	public static void menu(){
		while(true){
			System.out.println("*** ���� ���� ���α׷� ***");
			System.out.println("1. �� ���� �߰� ");	//addBook(inputBook() �� ������ ��ü) ����
			System.out.println("2. �������� ������ ��� "); //sortedBookList() ���� 
													//=> Book[] ���Ϲ޾� printBookList(Book[]) ����
			System.out.println("3. ���� ���� ");	//deleteBook(������ �ε���) ����
			System.out.println("4. ���� �˻���� ");	//searchBook(�˻��� ������) ���� 
												//=> index ���Ϲ޾� printBook(index) ����
			System.out.println("5. ��ü ��� ");	//displayAll() ����
			System.out.println("6. ������ ");
			System.out.println("��ȣ�� �Է����ּ���.");
			
			int key = sc.nextInt();
			sc.nextLine();
			
			switch (key) {
			case 1:
				putBook();
				break;
			case 2:
				sortedBookMap();	
				break;
			case 3:
				removeBook();
				break;
			case 4:
				System.out.println("�˻��� å ������ �Է����ּ���. = ");
				String bTitle = sc.nextLine();
				
				System.out.println(searchBook(bTitle));
				break;
			case 5:
				printBookMap();
				break;
			case 6:
				
				break;
			default:
				break;
			}
		}
	}
	public static void putBook(){
		String bNo;
		int cartegory;
		String title;
		String author;
		
		bNo = String.valueOf(bookMap.size()+1).toString();
		System.out.print("ī�װ��� �Է����ּ���.");
		cartegory = sc.nextInt();
		sc.nextLine();
		System.out.print("å�� ���� �Է����ּ���.");
		title = sc.nextLine();
		System.out.print("å�� �۰��� �Է����ּ���.");
		author = sc.nextLine();
		
		bookMap.put(bNo,new Book(bNo, cartegory, title, author));
		
	}
	public static void removeBook() {
		String bNo;
		System.out.println("Ű ��ȣ�� �Է����ּ���.");
		bNo=sc.nextLine();
		Iterator<String> keyIter = bookMap.keySet().iterator();
		
		while (keyIter.hasNext()) {
			String key = keyIter.next();
			if(bNo.equals(key)){
				bookMap.remove(key);
			}	
		}
	}
	public static String searchBook(String bTitle){
		StringBuilder sb = new StringBuilder();
		Iterator<String> keyIter = bookMap.keySet().iterator();
		
		if(!keyIter.hasNext()){
			System.out.println("null");
		}
		
		while (keyIter.hasNext()) {
			String key = keyIter.next();
			if(bTitle.equals(bookMap.get(key).getTitle())){
			Book value = bookMap.get(key);
			sb.append(key + " = " + value + "\n");
			}
		}
		
		return sb.toString();
		
	}
	public static void printBookMap(){
		Iterator<String> keyIter = bookMap.keySet().iterator();
		
		while (keyIter.hasNext()) {
			String key = keyIter.next();
			Book value = bookMap.get(key);
			System.out.println(key + " = " + value);
		}
		
	}
	public static void sortedBookMap(){
		ArrayList<Book> arrBookMap = new ArrayList<Book>();
		
		Iterator<String> keyIter = bookMap.keySet().iterator();
		
		while (keyIter.hasNext()) {
			
		}
	}
	/*//Field
		- booksMap : HashMap	//������ȣ�� Ű�� �����

		//�⺻������ : �� ��ü ������
		//�Ű������ִ� ������ : �ٸ� ���� ���޹޾�. 
		//		booksMap ��ü�� �ʱⰪ���� ������

		//Method
		+ putBook(book:Book) : void	//�ʿ� ��ü �߰�, ������ȣ�� Ű�� �����
		+ removeBook(key:String) : void	//�ʿ��� ��ü ����
		+ searchBook(String bTitle) : String	: entrySet() ���
			//�������� ��ġ�ϴ� ��ü�� ������ȣ�� ����
			//�������� ��ü�� �ʿ� ������, null ������
		+ displayAll():void		//������ ��� ��� : keySet() ���
		+ sortedBookMap():Book[]
			// �ش� ����������� �������������ؼ� ��ü�迭 ������
		+ printBookMap(Book[] br) : void
			//��ü �迭 ���, for each �� ���
		+ printBook(key:String) : void	//
*/}

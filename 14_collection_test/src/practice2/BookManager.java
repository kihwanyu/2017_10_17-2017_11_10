package practice2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManager {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		menu();
		
		
		
		/**** 도서 관리 프로그램 ***

		1. 새 도서 추가	//addBook(inputBook() 이 리턴한 객체) 실행
		2. 도서정보 정렬후 출력 //sortedBookList() 실행 
				=> Book[] 리턴받아 printBookList(Book[]) 실행
		3. 도서 삭제	//deleteBook(삭제할 인덱스) 실행
		4. 도서 검색출력	//searchBook(검색할 도서명) 실행 
				=> index 리턴받아 printBook(index) 실행
		5. 전체 출력	//displayAll() 실행
		6. 끝내기

		>>추가, 삭제, 검색에 필요한 키정보는 키보드로 입력받도록 함
		//Book 객체의 필드값을 키보드로 입력받아 초기화하고 객체 리턴
		+ static inputBook() : Book

		//삭제 또는 검색을 위한 도서 타이틀을 키보드로 입력받아 리턴
		+ static inputBookTitle() : String

		>> 끝내기 메뉴 선택 전까지는 메뉴 반복 실행되도록 처리함*/
	
	}
	public static void menu() {
		
		ArrayList<Book> arraylist = new ArrayList<>();
		while(true){
			
		System.out.println("*** 도서 관리 프로그램 ***");
		System.out.println("1. 새 도서 추가 ");
		System.out.println("2. 도서정보 ");
		System.out.println("3. 도서 삭제 ");
		System.out.println("4. 도서 검색출력	");
		System.out.println("5. 전체 출력 ");
		System.out.println("6. 끝내기 ");
		System.out.println("******************");
		System.out.print("번호를 입력해주세요.");
		
		int key = sc.nextInt();
		sc.nextLine();
			switch (key) {
			case 1:
				/*arraylist.add(new Book("1", 4, "잭과 콩나물", null));
				arraylist.add(new Book("2", 1, "선녀와 나무꾼", null));
				arraylist.add(new Book("3", 3, "어린왕자", null));
				arraylist.add(new Book("4", 5, "신데렐라", null));
				arraylist.add(new Book("5", 2, "연금술사", null));*/
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
				System.out.println("시스템을 종료하겠습니다.");
				return;
			default:
				System.out.println("다시입력해주세요.");
				break;
			}
		}
	}
	public static void addBook(ArrayList<Book> arraylist){
		String bNo;
		int cartegory;
		String title;
		String author;
		System.out.print("책의 번호를 입력해주세요.");
		bNo = sc.nextLine();
		System.out.print("카테고리를 입력해주세요.");
		cartegory = sc.nextInt();
		sc.nextLine();
		System.out.print("책의 제목를 입력해주세요.");
		title = sc.nextLine();
		System.out.print("책의 작가를 입력해주세요.");
		author = sc.nextLine();
		
		arraylist.add(new Book(bNo, cartegory, title, author));
	}
	
	public static void deleteBook(ArrayList<Book> arraylist){
		int index = 0;
		System.out.println("삭제하려고 하는 인덱스를 입력해주세요.");
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
		System.out.println("검색하려는 책의 제목을 입력해주세요.");
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

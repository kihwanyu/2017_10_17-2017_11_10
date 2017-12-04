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
			System.out.println("*** 도서 관리 프로그램 ***");
			System.out.println("1. 새 도서 추가 ");	//addBook(inputBook() 이 리턴한 객체) 실행
			System.out.println("2. 도서정보 정렬후 출력 "); //sortedBookList() 실행 
													//=> Book[] 리턴받아 printBookList(Book[]) 실행
			System.out.println("3. 도서 삭제 ");	//deleteBook(삭제할 인덱스) 실행
			System.out.println("4. 도서 검색출력 ");	//searchBook(검색할 도서명) 실행 
												//=> index 리턴받아 printBook(index) 실행
			System.out.println("5. 전체 출력 ");	//displayAll() 실행
			System.out.println("6. 끝내기 ");
			System.out.println("번호를 입력해주세요.");
			
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
				System.out.println("검색할 책 제목을 입력해주세요. = ");
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
		System.out.print("카테고리를 입력해주세요.");
		cartegory = sc.nextInt();
		sc.nextLine();
		System.out.print("책의 제목를 입력해주세요.");
		title = sc.nextLine();
		System.out.print("책의 작가를 입력해주세요.");
		author = sc.nextLine();
		
		bookMap.put(bNo,new Book(bNo, cartegory, title, author));
		
	}
	public static void removeBook() {
		String bNo;
		System.out.println("키 번호를 입력해주세요.");
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
		- booksMap : HashMap	//도서번호를 키로 사용함

		//기본생성자 : 맵 객체 생성함
		//매개변수있는 생성자 : 다른 맵을 전달받아. 
		//		booksMap 객체의 초기값으로 생성함

		//Method
		+ putBook(book:Book) : void	//맵에 객체 추가, 도서번호를 키로 사용함
		+ removeBook(key:String) : void	//맵에서 객체 제거
		+ searchBook(String bTitle) : String	: entrySet() 사용
			//도서명이 일치하는 객체의 도서번호를 리턴
			//도서명이 객체가 맵에 없으면, null 리턴함
		+ displayAll():void		//맵정보 모두 출력 : keySet() 사용
		+ sortedBookMap():Book[]
			// 해당 도서명순으로 오름차순정렬해서 객체배열 리턴함
		+ printBookMap(Book[] br) : void
			//객체 배열 출력, for each 문 사용
		+ printBook(key:String) : void	//
*/}

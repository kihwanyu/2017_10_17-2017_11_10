package ncs.test8;

import nsc.test7.Book;

public class BookStore {

	public static void main(String[] args) {
		Book bookdata;
		BookUpdate bookUpdate;
		
		bookdata = new Book(" ","HTML5",30000.0,15.0);
		bookUpdate = new BookUpdate(bookdata);
		System.out.println("�⺻����");
		System.out.println(bookdata.getBookName()+" "+bookdata.getBookPrice());
		System.out.println("����� ����");
		bookUpdate.updateBookPrice(bookdata);
		System.out.println(bookdata.getBookName()+" "+bookdata.getBookPrice());
	}

}

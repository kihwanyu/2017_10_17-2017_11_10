package ncs.test8;

import nsc.test7.Book;

public class BookUpdate {
	private Book bookData;

	public BookUpdate() {

	}

	public BookUpdate(Book bookData) {
		this.bookData = bookData;
	}

	public void updateBookPrice(Book bookData) {
		this.bookData.setBookPrice(bookData.getBookPrice()
				-(bookData.getBookPrice()*(bookData.getBookDiscountRate()/100)));
	}
	
	public Book getBookData() {
		return bookData;
	}

	public void setBookData(Book bookData) {
		this.bookData = bookData;
	}
	
	
}

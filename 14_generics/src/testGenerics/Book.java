package testGenerics;

public class Book {
	private String title;
	
	public Book() {
		
	}
	public Book(String title){
		this.title = title;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + "]";
	}
	
	
}

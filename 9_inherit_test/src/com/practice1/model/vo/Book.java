package com.practice1.model.vo;

public class Book {
	protected String title;
	protected String author;
	protected int price;
	public Book() {
		super();
	}
	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	@Override
	public boolean equals(Object obj){
		Book b = (Book) obj;
		
		boolean result = false;
		if(this.title.equals(b.getTitle())&&this.author.equals(b.getAuthor())&&this.price == b.getPrice()){
			result = true;
		};
		return result;
	}
	@Override
	public Object clone(){
		return new Book(title, author, price);
	}
	
}

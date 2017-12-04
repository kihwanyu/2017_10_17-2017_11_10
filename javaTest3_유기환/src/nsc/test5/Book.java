package nsc.test5;

public class Book {
	private String title;
	private String author;
	private int pirce;
	private String publisher;
	private double discountRate;
	public Book() {
		super();
	}
	public Book(String title, String author, int pirce, String publisher, double discountRate) {
		super();
		this.title = title;
		this.author = author;
		this.pirce = pirce;
		this.publisher = publisher;
		this.discountRate = discountRate;
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
	public int getPirce() {
		return pirce;
	}
	public void setPirce(int pirce) {
		this.pirce = pirce;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
}

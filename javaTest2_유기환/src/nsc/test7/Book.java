package nsc.test7;

public class Book {
	private String category;
	private String bookName;
	private Double bookPrice;
	private Double bookDiscountRate;
	
	public Book() {
	}
	public Book(String category, String bookName, Double bookPrice, Double bookDiscountRate) {
		this.category = category;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public Double getBookDiscountRate() {
		return bookDiscountRate;
	}
	public void setBookDiscountRate(Double bookDiscountRate) {
		this.bookDiscountRate = bookDiscountRate;
	}
	
	
}

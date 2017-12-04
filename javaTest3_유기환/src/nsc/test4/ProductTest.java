package nsc.test4;

public class ProductTest {

	public static void main(String[] args) {
			Product p = new Product("°¶·°½Ã s7", 563500, 3);
			
			System.out.println(p.information());
			System.out.println("ÃÑ ±¸¸Å °¡°Ý : " + (p.getPrice() * p.getQuantity()) + "¿ø");
	}

}

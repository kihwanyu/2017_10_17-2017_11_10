package nsc.test4;

public class ProductTest {

	public static void main(String[] args) {
			Product p = new Product("������ s7", 563500, 3);
			
			System.out.println(p.information());
			System.out.println("�� ���� ���� : " + (p.getPrice() * p.getQuantity()) + "��");
	}

}

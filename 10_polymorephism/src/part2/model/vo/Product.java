package part2.model.vo;

// �߻�޼ҵ带 ����� ���� ��쿡��  classŰ���� �տ� 
// �ݵ�� abstract ǥ���ؾ���
// �߻�Ŭ���� : �̿ϼ��� Ŭ������ ���ϸ�,
//          �̿ϼ��� �޼ҵ�� �ݵ�� ����� ���� �ļ��� �ϼ��ؾ� �Ѵ�.
// �߻�޼ҵ��  ��ü�� �������� ���Ѵ�.

public abstract class Product {
	public Product() {
		
	}
	//�߻� �޼ҵ�
	//�޼ҵ��� ��常 �ְ� �ٵ�� ���� �޼ҵ�
	public abstract void abstMethod();
	public void printProduct(){
		System.out.println("ProductŬ������ printProduct() �޼ҵ��Դϴ�.");
	}
	@Override
	public String toString(){
		return "ProductŬ������ toString() �޼ҵ帳�ϴ�.";
		
	}
}

package part2.model.vo;

public class Book extends Product implements IProduct{

	@Override
	public void abstMethod() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void abstIMethod() {
		// TODO Auto-generated method stub
		
	}
	public void printBook(){
		System.out.println("BookŬ������ printBook() ����...");
	}
	@Override
	public String toString(){
		return "BookŬ������ toString() �޼ҵ� �Դϴ�.";
		
	}
	// �������̽� , �߻�޼ҵ� ��ӽ� �ݵ�� ��� �߻�޼ҵ带 �������̵� �ؾ��Ѵ�.
}

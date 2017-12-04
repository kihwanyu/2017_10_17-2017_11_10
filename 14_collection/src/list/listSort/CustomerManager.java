package list.listSort;

import java.util.ArrayList;

public class CustomerManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Customer> list = new ArrayList<Customer>();
		
		list.add(new Customer("ȫ�浿",25,'��',1250.42));
		list.add(new Customer("Ȳ����",30,'��',2250.42));
		list.add(new Customer("�̼���",35,'��',1750.42));
		
		for(Customer c : list){
			System.out.println(c);
		}
		System.out.println(" �̸� : ��������");
		// �̸� �������� ����
		list.sort(new AscendingName());
		

		for(Customer c : list){
			System.out.println(c);
		}
		System.out.println(" �̸� : ��������");
		// �̸� �������� ����
		list.sort(new DescendingName());
		

		for(Customer c : list){
			System.out.println(c);
		}
		System.out.println(" ���� : ��������");
		// ���� �������� ����
		list.sort(new AscendingAge());
	
		for(Customer c : list){
			System.out.println(c);
		}
		System.out.println(" ���� : ��������");
		// ���� �������� ����
		list.sort(new DescendingAge());
	
		for(Customer c : list){
			System.out.println(c);
		}
	}

}

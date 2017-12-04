package part2.controller;

import part2.model.vo.Book;
import part2.model.vo.Galluxy;
import part2.model.vo.Product;
import part2.model.vo.SmartPhone;

public class Run {
	public static void main(String[] args){
		//������(Polymorphism)
		//��Ӱ��迡 �ִ� Ŭ������ �� �θ�Ŭ������ ���۷����� 
		//�ļ� ��ü�� �ּҸ� ��� ������ �� �ִ�.
		/*Product p1 = new Product();*/
		Product p1 = new SmartPhone();
		Product p2 = new Galluxy();
		Product p3 = new Book();
		
		/*System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);*/
		
		//ObjectŬ������ ��� Ŭ������ �����̴�.
		//�θ� Ŭ���� Ÿ������ (Object) �ڽ� ��ü�� �ּҸ� ���� �� �ִ�.
		
		Object obj1 = new SmartPhone();
		
		//System.out.println(obj1);
		
		//�ļ�Ŭ���� Ÿ������ �θ� ��ü�� �ּҸ� ���� �� ����.
		/*Galluxy g = new SmartPhone();*/
	
		print(new Galluxy());
		
	}
	public static void print(Object obj){
		
		//�θ� ���۷����� �ļ� ��ü�� �ּҸ� �޴� �������� 
		//�ڵ����� Ŭ���� ����ȯ�� �߻���(up-casting)
		// => �θ� Ŭ������ ���� ����� ������ �� ����
		// => �ļհ��� ���� �� �� ����
		System.out.println(obj);
		// = > ���� �θ� ���۷����� �ļ� ��ü�� ���� ����� ������ ���
		// = > ���� �ش� Ŭ���������� ���۷����� ����ȯ �ؾ���. (down-casting)
		if(obj instanceof Galluxy){
			((Galluxy) obj).printGalluxy();
		}
		else if(obj instanceof SmartPhone){
			((SmartPhone) obj).printSmartPhone();
		}
		else if(obj instanceof Book){
			((Book) obj).printBook();
		}
		else if(obj instanceof Product){
			((Product) obj).printProduct();
		}		
	}
}

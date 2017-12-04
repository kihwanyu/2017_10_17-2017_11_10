package list.listTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedList;


public class TestArrayList {

	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		
		arrayList.add(10);
		
		
		//ArrayList�� ���� ������ ������ : index(����)����
		
		arrayList.add("apple");
		arrayList.add("123"); // �� -> ��ü : boxing (Auto boxing)
		//�ߺ� ������ �����.
		arrayList.add(new Integer(123));
		arrayList.add(45.67);
		//���ϴ� ��ġ�� �߰��� �� �� �ִ�.
		//�߰��� �ϴ� ��쿡�� �ε��� ��ġ�� ����� ���� �ƴϰ�, �ϳ��� �ε����� �ڷ� �и���.
		arrayList.add(1, "�ٳ���");
		System.out.println(arrayList);
		//�ε����� ����Ǳ� ������ for���� �̿��ؼ� ����� �� �ִ�.
		
		//����� ��ü�� ����
		arrayList.remove(2);
		//����� ��ü�� ����
		arrayList.set(0, "����");
		for(int i = 0 ; i < arrayList.size(); i++){
			System.out.println(i+" : "+arrayList.get(i));
		}
		
		ArrayList list = new ArrayList();
		
 		
 		list.add("goguma");
 		list.add("apple");
 		list.add("banana");
 		
 		
 		
 		for(int i = 0 ; i < list.size(); i++){
			System.out.println(i+" : "+list.get(i));
		}
		//�������� ����
 		Collections.sort(list);
 		
 		for(int i = 0 ; i < list.size(); i++){
			System.out.println(i+" : "+list.get(i));
		}
 		//�������� ����
 		Iterator iter = new LinkedList(list).descendingIterator();
 		while(iter.hasNext()){
 			System.out.println(iter.next());
 		}
	}

}

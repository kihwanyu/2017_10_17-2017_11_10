package set;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

	public static void main(String[] args) {
		HashSet<Object> hset = new HashSet<>();
		hset.add("hello");
		//������ �����Ͽ� ���� ���۷��� ��� ������.
		hset.add(new String("java"));
		hset.add(123);
		hset.add(new Double(45.67));
		hset.add(new Date());
		hset.add(123);
		System.out.println(hset.toString());
		//toStirng �������̵� �޼ҵ�
		//���� ������ ���� �ȵȴ�.
		
		//�ߺ� ��� ���� ����
		hset.add(123);
		hset.add("java");
		System.out.println("����� ��ü�� : " + hset.size());
		System.out.println("���� Ȯ�� : " + hset.contains(new Integer(123)));
		
		//����� ��ü�� �ϳ��� ������ ����� ����
		//1. toArray()�� �迭�� �ٲٰ� for loop ���
		
		Iterator iter = hset.iterator();
		
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
		hset.remove(123);
		
		System.out.println("hset : " + hset.toString());
		
		hset.clear();
		
		System.out.println("hset : " + hset.toString());
	}

}

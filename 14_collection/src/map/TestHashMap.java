package map;

import java.util.Date;
import java.util.HashMap;

public class TestHashMap {

	public static void main(String[] args) {
		HashMap<Object, Object> hashMap = new HashMap<>(); 
		//Ű�� ��(value) ������ �����Ѵ�.
		
		//Ű�� �� �Ѵ� �ݵ�� ��ü���� �Ѵ�.
		
		hashMap.put(2,new Date());
		hashMap.put(12, "red apple");
		hashMap.put(33,12);
		
		System.out.println(hashMap.toString());
		
		// Ű�� �ߺ� ������� �ʴ´�(set) : �ֱ� Ű�� override�� (���)
		hashMap.put(12, "yello banana");
		
		System.out.println(hashMap.toString());
		
		// �� ��ü�� �ߺ� ������ ����Ѵ�.
		hashMap.put(1, "yello banana");
		
		System.out.println(hashMap.toString());
		
		//�� ��ü�� ������ ������ ��
		System.out.println("Ű 9�� ���� ��ü : " + hashMap.get(2));
		
		//Ű ���� ������ ����ó���� �� ��
		hashMap.remove(2);
		
		System.out.println(hashMap.toString());
		
		//����� ��ü ���� Ȯ�� �� ��
		System.out.println("hmap�� ����� ��ü �� : " + hashMap.size());
	}

}

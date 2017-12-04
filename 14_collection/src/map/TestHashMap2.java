package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestHashMap2 {

	public static void main(String[] args) {
		//Map�� ����� ��ü ���� ���� ó�� �׽�Ʈ
		
		HashMap<String, String> hmap = new HashMap<>();
		
		hmap.put("one", "java 8");
		hmap.put("two", "oracle 11g");
		hmap.put("three", "jdbc");
		hmap.put("four", "html5");
		hmap.put("five", "css3");
		
		//1. keySet()�� �̿��ؼ� Ű�� ���� set���� �и�
		//iterator()�� Ű����� �̿��ؼ� ó��
		
		//Set keys = hmap.keySet();
		Iterator<String> keyIter = hmap.keySet().iterator();
		
		while (keyIter.hasNext()) {
			String key = keyIter.next();
			String value = hmap.get(key);
			System.out.println(key + " = " + value);
		}
		//2. ����� value ��ü�鸸 values()�� Collection�� ����
		
		Collection<String> values = hmap.values();
		
		//2-1. iterator()�� ��� ���� ó��
		Iterator<String> valueIter = values.iterator();
		while (valueIter.hasNext()) {
			System.out.println(valueIter.next());
		}
		//2-2. �迭�� ���� ó��
		Object[] valueArr = values.toArray();
		for(int i = 0; i < valueArr.length; i++){
			System.out.println(i + " : " + valueArr[i]);
		}
		
		//3. Map�� ����Ŭ������ EntrySet�� �̿� : entrySet()
		Set<Entry<String, String>> set = hmap.entrySet(); 
		//Entry : Ű ��ü�� �� ��ü�� ������ ���� ��
		Iterator<Entry<String, String>> entryIter = set.iterator();
		while(entryIter.hasNext()){
			Map.Entry<String, String> entry = entryIter.next();
			
			System.out.println(entry.toString());
		}
		
	}

}

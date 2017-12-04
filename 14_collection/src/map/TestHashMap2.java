package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestHashMap2 {

	public static void main(String[] args) {
		//Map에 저장된 객체 정보 연속 처리 테스트
		
		HashMap<String, String> hmap = new HashMap<>();
		
		hmap.put("one", "java 8");
		hmap.put("two", "oracle 11g");
		hmap.put("three", "jdbc");
		hmap.put("four", "html5");
		hmap.put("five", "css3");
		
		//1. keySet()을 이용해서 키만 따로 set으로 분리
		//iterator()로 키목록을 이용해서 처리
		
		//Set keys = hmap.keySet();
		Iterator<String> keyIter = hmap.keySet().iterator();
		
		while (keyIter.hasNext()) {
			String key = keyIter.next();
			String value = hmap.get(key);
			System.out.println(key + " = " + value);
		}
		//2. 저장된 value 객체들만 values()로 Collection을 만듦
		
		Collection<String> values = hmap.values();
		
		//2-1. iterator()로 목록 만들어서 처리
		Iterator<String> valueIter = values.iterator();
		while (valueIter.hasNext()) {
			System.out.println(valueIter.next());
		}
		//2-2. 배열로 만들어서 처리
		Object[] valueArr = values.toArray();
		for(int i = 0; i < valueArr.length; i++){
			System.out.println(i + " : " + valueArr[i]);
		}
		
		//3. Map의 내부클래스인 EntrySet을 이용 : entrySet()
		Set<Entry<String, String>> set = hmap.entrySet(); 
		//Entry : 키 객체와 값 객체를 쌍으로 묶은 것
		Iterator<Entry<String, String>> entryIter = set.iterator();
		while(entryIter.hasNext()){
			Map.Entry<String, String> entry = entryIter.next();
			
			System.out.println(entry.toString());
		}
		
	}

}

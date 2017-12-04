package testGenerics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestGenerics4 {

	public static void inputMap(HashMap<Integer, Book> map){
		map.put(1, new Book("java"));
		map.put(2, new Book("oracle"));
		map.put(3, new Book("jdbc"));
		map.put(4, new Book("html5"));
	}
	
	public static void putputMap(HashMap<Integer, Book> map){
		Set<Map.Entry<Integer, Book>> entry = map.entrySet();
		
		Iterator<Entry<Integer, Book>> entryIter = entry.iterator();
		while(entryIter.hasNext()){
			Entry<Integer, Book> ent = entryIter.next();
			Integer key = ent.getKey();
			Book value = ent.getValue();
			
			System.out.println(key + " : " + value);
		}
		
		Set<Integer> keys = map.keySet();
		
		Iterator<Integer> keyIter = keys.iterator();
		
		while(keyIter.hasNext()){
			int key = keyIter.next();
			Book book = map.get(key);
		}
		
		ArrayList<Book> list = new ArrayList<>(map.values());
		for(Book b : list){
			System.out.println(b);
		}
	}
	public static void main(String[] args) {
		HashMap<Integer, Book> map = new HashMap<>();
		
		inputMap(map);
		putputMap(map);
	}

}

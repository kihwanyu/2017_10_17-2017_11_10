package set;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {
		//TreeSet test
		//자동 오름차순 정렬 기준이 되어 있음
		
		TreeSet tset = new TreeSet();
		
		tset.add("java");
		tset.add("oracle");
		tset.add("html");
		tset.add("css");
		
		System.out.println(tset);
		
		//목록 만들어서 하나씩 꺼내고 대문자로 변경해서 출력
		
		Iterator tIter = tset.iterator();
		
		while(tIter.hasNext()){
			System.out.println((String)tIter.next().toString().toUpperCase());
		}
		
		Object[] arr = tset.toArray();
		
		for(Object o : arr){
			System.out.println((String)o.toString().toUpperCase());
		}
	}
}

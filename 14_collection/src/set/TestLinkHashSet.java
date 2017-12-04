package set;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestLinkHashSet {

	public static void main(String[] args) {
		// LinkedHashSet Test
		// 저장 순서 유지 기능이 추가됨
		
		LinkedHashSet lhset = new LinkedHashSet();
		
		lhset.add("java");
		lhset.add(123);
		lhset.add(45.67);
		lhset.add(true);
		lhset.add(new Date());
		
		System.out.println(lhset.toString());
		
		LinkedHashSet lhset2 = new LinkedHashSet();
		
		lhset2.add("java");
		lhset2.add("oracle");
		lhset2.add("html");
		lhset2.add("css");
		
		System.out.println(lhset2.toString());
		
		TreeSet tset = new TreeSet(lhset2);
		
		System.out.println(tset.toString());
		
	}

}

package stringTest;

import java.util.StringTokenizer;

public class StringTest {
	public static void stringMethod() {
		String s1 = "java";
		String s2 = "java";
		
		System.out.println("s1 : " + s1.hashCode());
		System.out.println("s2 : " + s2.hashCode());
		
		s2 += "oracle";
		System.out.println("s2 : " + s2.hashCode());
	}
	
	//StringBuilder 클래스 테스트
	
	public static void stringBuilderMethod(){
		StringBuilder sb = new StringBuilder("oracle");
		System.out.println("sb : " + sb);
		System.out.println("sb : " + sb.hashCode());
		sb.append("JDBC");
		System.out.println("sb : " + sb);
		System.out.println("sb : " + sb.hashCode());
	}
	
	//문자열 분리 처리용 메소드
	public static void testSplit(){
		String str = "java,oracle,JDBC,HTML5,CSS3";
		String[] split = str.split(",");

		System.out.println("분리된 문자열 갯수 split : " + split.length);
		/*for(int i = 0 ; i < str.length() ; i++){
			System.out.println("split["+i+"] : "+split[i]);
		}*/
		for (String s : split) {			
			System.out.println(s);
		}
		StringTokenizer stn = new StringTokenizer(str, ",");
		System.out.println("분리된 문자열 갯수 stn : " + stn.countTokens());
		while(stn.hasMoreTokens()){
			System.out.println(stn.nextToken());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//stringMethod();
		//stringBuilderMethod();
		testSplit();
	}

}

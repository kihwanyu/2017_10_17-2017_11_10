package ncs.test2;

public class CharTest {

	public static void main(String[] args) {
		String st = args[0].toUpperCase();
		char[] ch = st.toCharArray();
		
		//System.out.println(ch.length);
		for(int i = ch.length-1 ; i > -1; i--){
			System.out.print(ch[i]);		
		}
	}
}

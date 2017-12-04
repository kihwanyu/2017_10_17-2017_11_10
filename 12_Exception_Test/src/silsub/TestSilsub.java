package silsub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestSilsub {
	static CharacterProcess cp = new CharacterProcess();
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.printf("%d\n",(int)'a');
		System.out.printf("%d\n",(int)'z');
		System.out.printf("%d\n",(int)'A');
		System.out.printf("%d",(int)'Z');*/
		
		//sibsub();
		try {
			sibsub2();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void sibsub(){
		
		try {
			String st = br.readLine();
			char[] ch = st.toCharArray();
			for(int i = 0; i < ch.length; i++){
				if(ch[i]==' '){
					try {
						throw new CharCheckException("체크할 문자열 안에 공백 포함할 수 없습니다.");
					} catch (CharCheckException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
					return;
				} 
			}
			System.out.println(cp.countAlpha(st));
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public static void sibsub2() throws IOException{
		NumberProcess np = new NumberProcess();
		Scanner sc = new Scanner(System.in);
		boolean result;
		System.out.print("첫번째 정수를 입력해주세요. = ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("두번째 정수를 입력해주세요. = ");
		int num2 = sc.nextInt();
		sc.nextLine();
		if((0<num1&&101>num1)&&(0<num2&&101>num2)){
			result = np.checkDouble(num1,num2);
		} else {
			try {
				throw new NumberRangeException("1부터 100사이의 값이 아닙니다.");
			} catch (NumberRangeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			return;
		}
		if(result == true){
			System.out.println(num1+"는(은) "+num2+"의 배수이다.");
		} else {
			System.out.println(num1+"는(은) "+num2+"의 배수가 아니다.");
		}
			
	}
}
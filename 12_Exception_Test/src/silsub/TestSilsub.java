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
						throw new CharCheckException("üũ�� ���ڿ� �ȿ� ���� ������ �� �����ϴ�.");
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
		System.out.print("ù��° ������ �Է����ּ���. = ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("�ι�° ������ �Է����ּ���. = ");
		int num2 = sc.nextInt();
		sc.nextLine();
		if((0<num1&&101>num1)&&(0<num2&&101>num2)){
			result = np.checkDouble(num1,num2);
		} else {
			try {
				throw new NumberRangeException("1���� 100������ ���� �ƴմϴ�.");
			} catch (NumberRangeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			return;
		}
		if(result == true){
			System.out.println(num1+"��(��) "+num2+"�� ����̴�.");
		} else {
			System.out.println(num1+"��(��) "+num2+"�� ����� �ƴϴ�.");
		}
			
	}
}
package fileTest;

import java.io.File;

public class TestFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("sample2.txt");
		
		System.out.println("���ϸ� : " + f.getName());
		System.out.println("������ : " + f.getAbsolutePath());
		System.out.println("������ : " + f.getPath());
		System.out.println("���Ͽ뷮 : " + f.length());
		System.out.println("�������� : " + f.getParent());
	}

}

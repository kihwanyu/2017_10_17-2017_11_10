package fileTest;

import java.io.File;

public class TestFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("sample2.txt");
		
		System.out.println("파일명 : " + f.getName());
		System.out.println("저장경로 : " + f.getAbsolutePath());
		System.out.println("저장경로 : " + f.getPath());
		System.out.println("파일용량 : " + f.length());
		System.out.println("상위폴더 : " + f.getParent());
	}

}

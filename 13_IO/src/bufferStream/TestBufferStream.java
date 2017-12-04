package bufferStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestBufferStream {

	public static void main(String[] args) {
		addBufferStream();
	}
	public static void addBufferStream() {
		//보조스트림 클래스 단독으로는 객체 생성 못함
		//반드시 기본스트림클래스에 대한 객체가 필요하다.
		try (BufferedInputStream bin = new BufferedInputStream(new FileInputStream("sample.dat"));
				BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("dsam.dat"))) {
			int readDate;
			while ((readDate = bin.read()) != -1) {
				bout.write(readDate);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// 내일 시험문제 
	public void fileOpen(String fileName) {
		//보조스트림 클래스 단독으로는 객체 생성 못함
		//반드시 기본스트림클래스에 대한 객체가 필요하다.
		try (BufferedInputStream bin = new BufferedInputStream(new FileInputStream("fileName"))) {
			int readBufferData;
			while ((readBufferData = bin.read()) != -1) {
				System.out.println(readBufferData);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

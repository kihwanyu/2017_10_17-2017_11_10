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
		//������Ʈ�� Ŭ���� �ܵ����δ� ��ü ���� ����
		//�ݵ�� �⺻��Ʈ��Ŭ������ ���� ��ü�� �ʿ��ϴ�.
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
	// ���� ���蹮�� 
	public void fileOpen(String fileName) {
		//������Ʈ�� Ŭ���� �ܵ����δ� ��ü ���� ����
		//�ݵ�� �⺻��Ʈ��Ŭ������ ���� ��ü�� �ʿ��ϴ�.
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

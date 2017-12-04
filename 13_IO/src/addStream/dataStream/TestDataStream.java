package addStream.dataStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestDataStream {
	public static void addDataStream(){
		//������ �ڷ��� ���� ó���ϴ� ����� �߰��� ������Ʈ��
		try (DataInputStream din = new DataInputStream(new FileInputStream("score.dat"));
				DataOutputStream dout = new DataOutputStream(new FileOutputStream("score.dat"))) {
			dout.writeUTF("������");
			dout.writeInt(95);
			dout.writeChar('A');
			
			dout.writeUTF("ȫ�浿");
			dout.writeInt(87);
			dout.writeChar('B');
			
			dout.writeUTF("�̼���");
			dout.writeInt(100);
			dout.writeChar('C');
			
			while (true) {
				try{
				System.out.println(din.readUTF() + "," + din.readInt() + "," + din.readChar());
				} catch (EOFException e) {
					e.getStackTrace();
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} 
	}
	public static void main(String[] args) {
		addDataStream();
	}

}

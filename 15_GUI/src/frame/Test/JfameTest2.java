package frame.Test;

import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class JfameTest2 {

	public static void main(String[] args) {
		JFrame mainFrame = new JFrame("hello");
		Rectangle r = new Rectangle(200, 300, 800, 500);
		//ũ�� ��ġ ����
		//mainFrame.setBounds(200, 300, 800, 500);
		mainFrame.setBounds(r);
		//x��ư ���ؼ� �ݱ�
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ������ �������� �ϱ�
		mainFrame.setVisible(true);
		
		try {
			mainFrame.setIconImage(ImageIO.read(new File("img\\dogIcon.png")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

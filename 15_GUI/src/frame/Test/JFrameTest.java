package frame.Test;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class JFrameTest extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3607011881137118618L;

	public JFrameTest() {
		//������ ũ��
		/*this.setLocation(400,300);
		this.setSize(500, 500);*/
		this.setTitle("myFrame");
		
		this.setBounds(300, 200, 800, 500);
		//������ ������ �̹��� ����
		try {
			this.setIconImage(ImageIO.read(new File("img\\catIcon.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		//������ ������ ���� �Ұ��� ����
		//�⺻������ Ȱ��ȭ�� �Ǿ� �ִ� ����
		this.setResizable(false);
		
		//x��ư���� �ݱ� ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//������ �������� ����
		this.setVisible(true);
		
	}
	public static void main(String[] args) {
		new JFrameTest();
	}

}

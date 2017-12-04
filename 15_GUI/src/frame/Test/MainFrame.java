package frame.Test;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class MainFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4248811398623106260L;

	public MainFrame(String title){
		super(title);
		
		try {
			this.setIconImage(ImageIO.read(new File("img\\dogIcon.png")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//������ ������ ����
		this.setResizable(false);
		//�������� ũ��
		this.setBounds(200, 300, 500, 500);
		//x��ư Ŭ�� �ݱ�
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//������ ��������
		this.setVisible(true);
	}
}

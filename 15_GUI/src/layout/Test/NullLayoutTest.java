package layout.Test;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NullLayoutTest {

	public static void main(String[] args) {
		//Layout �������� ��ġ�� ������ ���鼭 ��ġ�ϴ� ���
		
		JFrame f= new JFrame("NullLayoutTest");
		
		f.setBounds(200, 200, 500, 500);
		
		f.setLayout(null);
		
		JLabel nameLb = new JLabel("�̸� : ");
		nameLb.setLocation(50, 100);
		nameLb.setSize(150,50);
		
		JTextField nameTf = new JTextField(20);
		nameTf.setLocation(200,100);
		nameTf.setSize(150, 50);
		
		JButton bt = new JButton("�� ��");
		bt.setLocation(350,100);
		bt.setSize(100,50);
		f.add(nameLb);
		f.add(nameTf);
		f.add(bt);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}

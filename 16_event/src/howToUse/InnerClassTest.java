package howToUse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InnerClassTest extends JFrame {
	private JButton button;
	private JLabel label;
	public InnerClassTest(){
		this.setSize(300, 200);
		this.setTitle("���� Ŭ���� ����");
		
		JPanel panel = new JPanel();
		button = new JButton("��ư�� �����ּ���.");
		label = new JLabel("���� ��ư�� ���������ϴ�.");
		
		panel.add(button);
		panel.add(label);
		
		this.add(panel);
		
		//button.addActionListener(new MyEvent(button, label));
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private class MyEvent implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
		
		}
		
	}
}

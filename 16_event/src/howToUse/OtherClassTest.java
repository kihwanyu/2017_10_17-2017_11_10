package howToUse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OtherClassTest extends JFrame {
	private JButton button;
	private JLabel label;
	
	public OtherClassTest(){
		this.setSize(300, 200);
		
		JPanel panel = new JPanel();
		
		button = new JButton("��ư�� ����������.");
		label = new JLabel("��ư�� ������ �ʾҽ��ϴ�.");
		
		
		
		panel.add(button);
		panel.add(label);
		
		this.add(panel);
		
		button.addActionListener(new MyEvent(button, label));
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
class MyEvent implements ActionListener{
	private JButton button;
	private JLabel label;
	public MyEvent(JButton button, JLabel label) {
		button.addActionListener(this);
		this.label = label;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//if(e.getSource() == button){
		System.out.println(e.getSource());
			label.setText("���� ��ư�� ���������ϴ�.");
		//}
	}
	
}
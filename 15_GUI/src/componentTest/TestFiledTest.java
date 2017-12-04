package componentTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestFiledTest {

	public static void main(String[] args) {
		JFrame mf = new JFrame();
		mf.setBounds(300, 300, 300, 130);
		JPanel panel = new JPanel();
		
		panel.add(new JLabel("�����Է�: "));
		
		JTextField text = new JTextField(15);
		panel.add(text);
		panel.add(new JLabel("������ �� : "));
		
		JTextField result = new JTextField(15);
		result.setEditable(false);
		
		panel.add(result);
		
		JButton btn = new JButton("OK");
		panel.add(btn);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int value = Integer.parseInt(text.getText());
				
				result.setText(String.valueOf(value*value).toString());
				
				text.requestFocus(); // ��û�� ���콺 Ŀ�� ��ġ
			}
		});
		mf.add(panel);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

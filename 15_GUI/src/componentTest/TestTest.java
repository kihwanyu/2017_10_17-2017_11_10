package componentTest;

import java.awt.GridLayout;
import java.awt.PageAttributes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TestTest {

	public static void main(String[] args) {
		JFrame mf = new JFrame();
		JPanel panel = new JPanel();
		
		panel.setLayout(new GridLayout(3, 2));
		
		JTextField id = new JTextField(30);
		mf.add(panel);
		panel.add(new JLabel("ID"));
		panel.add(id);
		
		JPasswordField jpassword = new JPasswordField(30);
		panel.add(new JLabel("PW"));
		panel.add(jpassword);
		
		JTextArea textArea = new JTextArea(10,30);
		panel.add(new JLabel("내용"));
		textArea.setEditable(false); // 수정불가
		panel.add(textArea);
		
		JButton btn = new JButton("보내기");
		mf.pack();
		
		mf.add(panel, "North");
		mf.add(textArea, "Center");
		mf.add(btn, "South");
		
		btn.addActionListener((new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String text = "id = " + id.getText() + "\n"
						+ "password = " + jpassword.getPassword();
				textArea.append(text);
				char[] pass = jpassword.getPassword();
				for(int i = 0; i < pass.length; i++)
				{
					System.out.println(pass[i]);
				}
			}
		}));
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setVisible(true);
	}

}

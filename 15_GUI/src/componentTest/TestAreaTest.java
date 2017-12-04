package componentTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TestAreaTest {

	public static void main(String[] args) {
		JFrame mf = new JFrame();
		
		JTextField tf = new JTextField(30);
		JTextArea ta = new JTextArea(10,30);
		ta.setEditable(false);
		tf.setText("숫자를 입력해주세요.");
		tf.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				tf.setText("");
			}
		});
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 String text= tf.getText();
				 ta.append(text+"\n");
				 tf.setText("");
			}
		});
		
		mf.add(tf, "North");
		mf.add(ta, "Center");
		
		mf.pack();
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

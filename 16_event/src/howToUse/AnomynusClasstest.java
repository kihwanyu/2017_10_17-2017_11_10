package howToUse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AnomynusClasstest {

	public static void main(String[] args) {
		JFrame mf = new JFrame();
		mf.setSize(300, 200);
		
		JPanel panel = new JPanel();
		JButton button = new JButton("버튼을 눌러주세요.");
		JLabel label = new JLabel("아직버튼이 눌려지지 않았습니다.");
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button){
					label.setText("버튼이 눌려졌습니다.");
				}
			}
		});
		
		panel.add(button);
		panel.add(label);
		
		mf.add(panel);
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

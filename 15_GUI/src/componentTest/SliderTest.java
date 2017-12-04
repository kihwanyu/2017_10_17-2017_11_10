package componentTest;

import java.awt.Component;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;

public class SliderTest {

	public static void main(String[] args) {
		JFrame mf = new JFrame("슬라이더 테스트");
		mf.setSize(300, 300);
		
		Panel panel1 = new Panel();
		Panel panel2 = new Panel();
		Panel resultPanel = new Panel();
		
		mf.add(panel1, "North");
		mf.add(panel2, "Center");
		mf.add(resultPanel, "South");
		
		JLabel label = new JLabel("슬라이더를 움직여보세요. ", JLabel.CENTER);
		
		label.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		panel1.add(label);
		
		JSlider slider = new JSlider(0, 30, 15);
		slider.setMajorTickSpacing(10);
		slider.setMinorTickSpacing(1);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		panel2.add(slider); 
		
		JButton button = new JButton("전송");
		panel2.add(button);
		
		JLabel text = new JLabel("결과값");
		resultPanel.add(text);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text.setText(slider.getValue() + " ");
			}
		});
		
		
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setVisible(true);
	}

}

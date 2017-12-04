package componentTest;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.xml.soap.Text;

public class RadioButtonTest {

	public static void main(String[] args) {
		JFrame mf = new JFrame("라디오 버튼 테스트");
		
		mf.setSize(300, 150);
		
		JPanel topPanel = new JPanel();
		JPanel sizePanel = new JPanel();
		JPanel resultPanel = new JPanel();
		
		mf.add(topPanel, "North");
		mf.add(sizePanel, "Center");
		mf.add(resultPanel, "South");
		
		topPanel.add(new JLabel("어떤 크기의 커피를 주문하시겠습니까?"));
		
		JRadioButton s = new JRadioButton("Samll size");
		JRadioButton m = new JRadioButton("Medium size");
		JRadioButton l = new JRadioButton("Large size");
		
		ButtonGroup size = new ButtonGroup();
		
		size.add(s);
		size.add(m);
		size.add(l);
		
		sizePanel.add(s);
		sizePanel.add(m);
		sizePanel.add(l);
		
		JLabel result = new JLabel("크기가 선택되지 않았습니다.");
		
		resultPanel.add(result);
		
		s.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText("Smail size가 선택되었습니다.");
			}
		});
		m.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText("Medium size가 선택되었습니다.");
			}
		});
		l.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText("Large size가 선택되었습니다.");
			}
		});
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

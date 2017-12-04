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
		JFrame mf = new JFrame("���� ��ư �׽�Ʈ");
		
		mf.setSize(300, 150);
		
		JPanel topPanel = new JPanel();
		JPanel sizePanel = new JPanel();
		JPanel resultPanel = new JPanel();
		
		mf.add(topPanel, "North");
		mf.add(sizePanel, "Center");
		mf.add(resultPanel, "South");
		
		topPanel.add(new JLabel("� ũ���� Ŀ�Ǹ� �ֹ��Ͻðڽ��ϱ�?"));
		
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
		
		JLabel result = new JLabel("ũ�Ⱑ ���õ��� �ʾҽ��ϴ�.");
		
		resultPanel.add(result);
		
		s.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText("Smail size�� ���õǾ����ϴ�.");
			}
		});
		m.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText("Medium size�� ���õǾ����ϴ�.");
			}
		});
		l.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText("Large size�� ���õǾ����ϴ�.");
			}
		});
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

package componentTest;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListTest {

	public static void main(String[] args) {
		JFrame mf = new JFrame("리스트");
		
		mf.setSize(300, 200);
		
		JPanel listPanel = new JPanel();
		JPanel pannel = new JPanel();
		
		String[] cities = {"서울","대전","대구","부산","인천"};
		
		JList list = new JList();
		
		list.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
		
		JScrollPane scroller = new JScrollPane(list);
		scroller.setPreferredSize(new Dimension(200, 100));
		
		JLabel label = new JLabel("선택된 항목 : ");
		JTextField selected = new JTextField(10);
		selected.setEditable(false);
		
		list.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				selected.setText(String.valueOf(list.getSelectedValue()).toString());
			}
		});
		
		listPanel.add(scroller);
		pannel.add(label);
		pannel.add(selected);
		
		mf.add(listPanel, "North");
		mf.add(pannel, "Center");
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

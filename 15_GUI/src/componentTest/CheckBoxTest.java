package componentTest;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheckBoxTest {

	public static void main(String[] args) {
		JFrame mf = new JFrame();
		
		String[] fruits = {"apple", "orange", "banana"};
		
		JCheckBox[] buttons = new JCheckBox[3];
		
		for(int i = 0; i < buttons.length; i++){
			buttons[i] = new JCheckBox(fruits[i]);
		}
		
		JPanel checkPanel = new JPanel();
		
		for(int i = 0; i < buttons.length; i++){
			checkPanel.add(buttons[i]);
		}
		
		JPanel resultPanel = new JPanel();
		JLabel text = new JLabel("선택한 과일이 없습니다.");
		resultPanel.add(text);
		
		for(int i = 0; i < buttons.length; i++){
			buttons[i].addItemListener(new ItemListener() {
				
				@Override
				public void itemStateChanged(ItemEvent e) {
					String result = "";
					int ctn = 0;
					
					for(int j = 0; j < buttons.length; j++){
						if(buttons[j].isSelected()){
							result += buttons[j].getText() + "";
							ctn++;
						}
						text.setText(result);
					}
					if(ctn ==0){
						text.setText("선택한 과일이 없습니다.");
					}
				}
			});
		}
		
		mf.add(checkPanel,"North");
		mf.add(resultPanel, "Center");
		
		mf.pack();
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

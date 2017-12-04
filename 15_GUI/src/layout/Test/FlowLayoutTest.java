package layout.Test;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutTest {
	public static void main(String[] arg){
		JFrame mf = new JFrame("FlowLayout");
		
		mf.setBounds(300, 200, 800, 500);
		
		
		mf.setLayout(new FlowLayout(FlowLayout.CENTER));
		//mf.setLayout(new FlowLayout(FlowLayout.LEFT));
		//mf.setLayout(new FlowLayout(FlowLayout.RIGHT));
		//mf.setLayout(new FlowLayout(FlowLayout.LEADING)); //왼쪽
		//mf.setLayout(new FlowLayout(FlowLayout.TRAILING)); //오른쪽
		
		mf.add(new JButton("1번")); 
		mf.add(new JButton("2번"));
		mf.add(new JButton("3번"));
		mf.add(new JButton("4번")); 
		mf.add(new JButton("6번"));
		mf.add(new JButton("7번"));
		mf.add(new JButton("8번"));
		mf.add(new JButton("9번"));
		mf.add(new JButton("10번"));
		mf.add(new JButton("11번"));
		mf.add(new JButton("12번"));
		mf.add(new JButton("13번"));
		mf.add(new JButton("14번"));
		mf.add(new JButton("15번"));
		mf.add(new JButton("16번"));
		mf.add(new JButton("17번"));
		mf.add(new JButton("18번"));

		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setVisible(true);
	}
}

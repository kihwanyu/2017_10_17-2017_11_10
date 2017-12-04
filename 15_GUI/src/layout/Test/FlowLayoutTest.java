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
		//mf.setLayout(new FlowLayout(FlowLayout.LEADING)); //����
		//mf.setLayout(new FlowLayout(FlowLayout.TRAILING)); //������
		
		mf.add(new JButton("1��")); 
		mf.add(new JButton("2��"));
		mf.add(new JButton("3��"));
		mf.add(new JButton("4��")); 
		mf.add(new JButton("6��"));
		mf.add(new JButton("7��"));
		mf.add(new JButton("8��"));
		mf.add(new JButton("9��"));
		mf.add(new JButton("10��"));
		mf.add(new JButton("11��"));
		mf.add(new JButton("12��"));
		mf.add(new JButton("13��"));
		mf.add(new JButton("14��"));
		mf.add(new JButton("15��"));
		mf.add(new JButton("16��"));
		mf.add(new JButton("17��"));
		mf.add(new JButton("18��"));

		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setVisible(true);
	}
}

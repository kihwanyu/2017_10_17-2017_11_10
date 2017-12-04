package layout.Test;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutTest {

	public static void main(String[] args) {
		JFrame mf = new JFrame("BorderLayout");
		mf.setBounds(300, 200, 800, 500);
		//���̾ƿ� �⺻���� borderLayout�̱� ������ ������ �����ϴ�.
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setResizable(false);
		
		mf.setLayout(new BorderLayout());
		
		/*//������Ʈ ��ü ����
		JButton north = new JButton("North"); 
		JButton south = new JButton("South"); 
		JButton east = new JButton("East"); 
		JButton west = new JButton("West"); 
		JButton center = new JButton("Center");
		
		//���̾ƿ� ��ġ�� ������Ʈ ��ġ
		mf.add(north, "North"); //��ҹ��� ���� 
		mf.add(south, "South");  //���� ��� ���� 
		mf.add(east, "East"); 
		mf.add(west, "West"); 
		mf.add(center, "Center");*/
		
		mf.add(new JButton("North"),"North");
		mf.add(new JButton("South"),"South");
		mf.add(new JButton("East"),"East");
		mf.add(new JButton("West"),"West");
		mf.add(new JButton("Center"),"Center");
	}

}

package layout.Test;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutTest {

	public static void main(String[] args) {
		JFrame mf = new JFrame("BorderLayout");
		mf.setBounds(300, 200, 800, 500);
		//레이아웃 기본값이 borderLayout이기 때문에 생략이 가능하다.
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setResizable(false);
		
		mf.setLayout(new BorderLayout());
		
		/*//컴포넌트 객체 생성
		JButton north = new JButton("North"); 
		JButton south = new JButton("South"); 
		JButton east = new JButton("East"); 
		JButton west = new JButton("West"); 
		JButton center = new JButton("Center");
		
		//레이아웃 위치별 컴포넌트 배치
		mf.add(north, "North"); //대소문자 주의 
		mf.add(south, "South");  //순서 상관 없음 
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

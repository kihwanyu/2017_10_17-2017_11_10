package part1.inheritTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubClass extends SuperClass 
implements SuperInterface , ActionListener{
	// 다중상속이 불가능하다.
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	} 
	
}

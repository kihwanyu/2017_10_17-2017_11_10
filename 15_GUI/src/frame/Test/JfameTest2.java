package frame.Test;

import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class JfameTest2 {

	public static void main(String[] args) {
		JFrame mainFrame = new JFrame("hello");
		Rectangle r = new Rectangle(200, 300, 800, 500);
		//크기 위치 설정
		//mainFrame.setBounds(200, 300, 800, 500);
		mainFrame.setBounds(r);
		//x버튼 통해서 닫기
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 프레임 보여지게 하기
		mainFrame.setVisible(true);
		
		try {
			mainFrame.setIconImage(ImageIO.read(new File("img\\dogIcon.png")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

package frame.Test;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class JFrameTest extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3607011881137118618L;

	public JFrameTest() {
		//프레임 크기
		/*this.setLocation(400,300);
		this.setSize(500, 500);*/
		this.setTitle("myFrame");
		
		this.setBounds(300, 200, 800, 500);
		//프레임 아이콘 이미지 설정
		try {
			this.setIconImage(ImageIO.read(new File("img\\catIcon.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		//프레임 사이즈 조정 불가능 설정
		//기본적으로 활성화가 되어 있는 상태
		this.setResizable(false);
		
		//x버튼으로 닫기 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//프레임 보여지게 설정
		this.setVisible(true);
		
	}
	public static void main(String[] args) {
		new JFrameTest();
	}

}

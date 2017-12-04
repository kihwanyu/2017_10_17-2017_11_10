package frame.Test;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class MainFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4248811398623106260L;

	public MainFrame(String title){
		super(title);
		
		try {
			this.setIconImage(ImageIO.read(new File("img\\dogIcon.png")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//프레임 사이즈 조절
		this.setResizable(false);
		//프레임의 크기
		this.setBounds(200, 300, 500, 500);
		//x버튼 클릭 닫기
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//프레임 보여지기
		this.setVisible(true);
	}
}

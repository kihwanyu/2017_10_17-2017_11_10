package layout.Test;

import java.awt.GridLayout;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutTest {

	public static void main(String[] args) {
		//GridLayout Test
		JFrame mf = new JFrame("gridLayout");
		int[] binggo = new int[25] ;
		boolean restart = false;
		mf.setBounds(300, 200, 800, 500);
		
		Random rd = new Random();
		
		Set<Integer> set = new LinkedHashSet<>();
		
		while(set.size() < 25){
			set.add(rd.nextInt(25)+1);
		}
		
		mf.setLayout(new GridLayout(5, 5, 10, 10));
		
		Object[] obj = set.toArray();
		
		for(int i = 0; i < obj.length; i++){
			String str = new Integer((int)obj[i]).toString();
			mf.add(new JButton(str));
		}
		/*do{
			restart = false;
			for(int i = 0; i < 25; i ++){
				binggo[i] = rd.nextInt(50)+1;
			}
			for(int i = 0; i < binggo.length; i++){
				for(int j = 0; j < binggo.length; j++){
					if(i!=j){	
						if(binggo[i]==binggo[j]){
							System.out.println(binggo[i]);
							restart = true;
							break;
						}
					}
				}
			}
		} while (restart!=false);
		
		for(int i = 0; i < binggo.length; i++){
			mf.add(new JButton(String.valueOf(binggo[i]).toString()));
		}*/
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

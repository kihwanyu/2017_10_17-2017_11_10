package layout.Test;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CardLayoutTest {

	public static void main(String[] args) {
		//CardLayout Test
		//panel을 이용해서 카드 판을 만들어 겹쳐 놓음
		//이벤트 를 이용해서 다른 판이 보이게 설정해야함
		JFrame mf = new JFrame("CardLayout");
		
		CardLayout card = new CardLayout();
		
		mf.setLayout(card);
		
		mf.setBounds(300, 200, 800, 500);
		
		JPanel card1 = new JPanel();
		JPanel card2 = new JPanel();
		JPanel card3 = new JPanel();
		
		card1.setBackground(Color.BLUE);
		card2.setBackground(Color.RED);
		card3.setBackground(new Color(0, 255, 0));
		
		// 패널에 라벨 추가
		
		card1.add(new JLabel("card1"));
		card2.add(new JLabel("card2"));
		card3.add(new JLabel("card3"));
		
		card1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e){
				if(e.getButton()==1){
					card.next(card1.getParent());
				}
				
				if(e.getButton()==3){
					card.previous(card1.getParent());
				}	
			}
		});
		card2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e){
				if(e.getButton()==1){
					//card.next(card1.getParent());
					card1.setVisible(false);
					card2.setVisible(true);
					card3.setVisible(false);
				}
				
				if(e.getButton()==3){
					//card.previous(card1.getParent());
					card1.setVisible(false);
					card2.setVisible(false);
					card3.setVisible(true);
				}	
			}
		});
		card2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e){
				if(e.getButton()==1){
					//card.next(card2.getParent());
					card1.setVisible(false);
					card2.setVisible(false);
					card3.setVisible(true);
				}
				
				if(e.getButton()==3){
					//card.previous(card2.getParent());
					card1.setVisible(true);
					card2.setVisible(false);
					card3.setVisible(false);
				}	
			}
		});
		card3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e){
				if(e.getButton()==1){
					//card.next(card3.getParent());
					card1.setVisible(true);
					card2.setVisible(false);
					card3.setVisible(false);
				}
				
				if(e.getButton()==3){
					//card.previous(card3.getParent());
					card1.setVisible(false);
					card2.setVisible(true);
					card3.setVisible(false);
				}	
			}
		});
		
		mf.add(card1);
		mf.add(card2);
		mf.add(card3);
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

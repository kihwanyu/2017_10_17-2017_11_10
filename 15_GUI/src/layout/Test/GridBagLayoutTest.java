package layout.Test;

import java.applet.Applet;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridBagLayoutTest extends Applet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5729181748943074817L;
	public JButton makeButton(String name, GridBagLayout g, GridBagConstraints constraints){
		JButton button = new JButton(name);
		
		g.setConstraints(button, constraints);
		
		return button;
	}
	
	public void init(){
		GridBagLayout girdBag = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		
		this.setFont(new Font("SansSerif",Font.PLAIN, 14));
		this.setLayout(girdBag);
		
		c.fill = GridBagConstraints.BOTH;
		
		//������Ʈ�� ���η� ������ �� ũ�� ����
		c.weightx = 1.0;
		
		this.add(this.makeButton("Button", girdBag, c));
		this.add(this.makeButton("Button1", girdBag, c));
		this.add(this.makeButton("Button3", girdBag, c));
		
		//���� ������ ��ġ ����
		
		c.gridwidth = GridBagConstraints.REMAINDER;
		this.add(this.makeButton("Button4", girdBag, c));
		c.weightx = 0.0;
		this.add(this.makeButton("Button5", girdBag, c));
		c.gridwidth = GridBagConstraints.RELATIVE;
		this.add(this.makeButton("Button6", girdBag, c));
		c.gridwidth = GridBagConstraints.REMAINDER;
		this.add(this.makeButton("Button7", girdBag, c));
		c.gridwidth = 1;
		c.gridheight = 2;
		c.weighty = 1.0;
		this.add(this.makeButton("Button8", girdBag, c));
		c.gridwidth = GridBagConstraints.REMAINDER;
		c.gridheight = 1;
		this.add(this.makeButton("Button9", girdBag, c));
		this.add(this.makeButton("Button10", girdBag, c));
	}
	public static void main(String[] args) {
		JFrame f = new JFrame("GridBagLayout");
		GridBagLayoutTest test = new GridBagLayoutTest();
		test.init();
		
		f.add("Center",test);
		f.pack();
		f.setSize(f.getPreferredSize());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		
	}

}

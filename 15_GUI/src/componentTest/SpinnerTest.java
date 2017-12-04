package componentTest;

import java.awt.Panel;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

public class SpinnerTest {

	public static void main(String[] args) {
		JFrame mf = new JFrame("���ǳ� �׽�Ʈ");
		
		mf.setSize(500, 100);
		
		JPanel panel = new JPanel();
		JPanel resultPanel = new JPanel();
		mf.add(panel, "North");
		mf.add(resultPanel, "South");
		
		//ListModel Test
		
		String[] items = {"�Ҽ�","����","��������","���"};
		
		SpinnerListModel listModel = new SpinnerListModel(items);
		
		JSpinner spinner1 = new JSpinner(listModel);
		
		panel.add(spinner1);
		
		SpinnerNumberModel numberModel = new SpinnerNumberModel(1, 0, 9, 1);
		
		JSpinner spinner2 = new JSpinner(numberModel);
		
		panel.add(spinner2);
		
		Calendar calendar = Calendar.getInstance();
		
		Date value = calendar.getTime(); // ���糯¥
		
		calendar.add(Calendar.YEAR, -50); // ���� ��¥���� 50���� ��
		
		Date start = calendar.getTime();
		
		calendar.add(Calendar.YEAR, 100);
		
		Date end = calendar.getTime();
		
		SpinnerDateModel dateModel = new SpinnerDateModel(value, start, end, Calendar.DATE);
		
		JSpinner spinner3 = new JSpinner(dateModel);
		
		spinner3.setEditor(new JSpinner.DateEditor(spinner3, "yyyy/MM/dd"));
		
		panel.add(spinner3);
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

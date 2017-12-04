package dateTest;

import java.io.StringReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.text.StyleContext.SmallAttributeSet;

public class DateTest {
	//Date Ŭ���� �׽�Ʈ
	public static void testDate(){
		Date today = new Date();
		Date when = new Date(41412421L);
		System.out.println(today + "/" + today.getTime());
		System.out.println(when + "/" + when.getTime());
	}
	//Calendar Ŭ���� �׽�Ʈ
		public static void testCalendar() {
			/*Calendar today = Calendar.getInstance();
			System.out.println(today.getWeekYear() +" "+ today.get);*/
			Calendar today = new GregorianCalendar();
			
			int year = today.get(Calendar.YEAR);
			int month = today.get(Calendar.MONTH)+1;
			int day = today.get(Calendar.DATE);
			int ampm = today.get(Calendar.AM_PM);
			int hour = today.get(Calendar.HOUR);
			int min = today.get(Calendar.MINUTE);
			int sec = today.getMaximum(Calendar.SECOND);
			
			String sAmPm = (ampm == 0)? "����" : "����";
			System.out.println(year +"��" +month+"��"+day+"��"+sAmPm +" "+ +hour+"��" + min +"��" + sec+"��");
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� E����"); 
			String formatDate = sdf.format(today.getTime());
			System.out.println(formatDate);
		}
	public static void main(String[] args) {
		//testDate();
		testCalendar();
	}	
	
}

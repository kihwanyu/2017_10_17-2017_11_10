package dateTest;

import java.io.StringReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.text.StyleContext.SmallAttributeSet;

public class DateTest {
	//Date 클래스 테스트
	public static void testDate(){
		Date today = new Date();
		Date when = new Date(41412421L);
		System.out.println(today + "/" + today.getTime());
		System.out.println(when + "/" + when.getTime());
	}
	//Calendar 클래스 테스트
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
			
			String sAmPm = (ampm == 0)? "오전" : "오후";
			System.out.println(year +"년" +month+"월"+day+"일"+sAmPm +" "+ +hour+"시" + min +"분" + sec+"초");
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월dd일 E요일"); 
			String formatDate = sdf.format(today.getTime());
			System.out.println(formatDate);
		}
	public static void main(String[] args) {
		//testDate();
		testCalendar();
	}	
	
}

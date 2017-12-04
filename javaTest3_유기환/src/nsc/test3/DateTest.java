package nsc.test3;

import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar today = new GregorianCalendar(2016,4-1,18);
		Calendar birthday = new GregorianCalendar(1987,5-1,27);
		
		SimpleDateFormat today_sdf = new SimpleDateFormat("yyyy�� M�� dd��"); 
		SimpleDateFormat birthday_sdf = new SimpleDateFormat("yyyy�� M�� dd�� E����");
		
		String today_formatDate = today_sdf.format(today.getTime());
		String birthday_formatDate = birthday_sdf.format(birthday.getTime());
		
		int today_Year = today.get(today.YEAR);
		int birthday_Year = birthday.get(today.YEAR);
		
		int age = today_Year - birthday_Year;
		
		System.out.println("���� : " + birthday_formatDate);
		System.out.println("���� : " + today_formatDate);
		System.out.println("����  : " + age+ " ��");
	}

}

package com.week4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestWork1 {

	public static void main(String[] args) {
		Calendar c = new GregorianCalendar();
		
		int day_of_month = c.get(c.DAY_OF_WEEK); // 토요일이 0 이다.
		String day_of_month_str = " ";
		System.out.println(day_of_month);
		switch (day_of_month) {
		case 0:
			day_of_month_str = "토요일";
			break;
		case 1:
			day_of_month_str = "일요일";
			break;
		case 2:
			day_of_month_str = "월요일";
			break;
		case 3:
			day_of_month_str = "화요일";
			break;
		case 4:
			day_of_month_str = "수요일";
			break;
		case 5:
			day_of_month_str = "목요일";
			break;
		case 6:
			day_of_month_str = "금요일";
			break;
		
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일"); 
		String formatDate = sdf.format(c.getTime());

		System.out.println(formatDate);
	}

}

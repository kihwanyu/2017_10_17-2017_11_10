package com.week4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestWork1 {

	public static void main(String[] args) {
		Calendar c = new GregorianCalendar();
		
		int day_of_month = c.get(c.DAY_OF_WEEK); // ������� 0 �̴�.
		String day_of_month_str = " ";
		System.out.println(day_of_month);
		switch (day_of_month) {
		case 0:
			day_of_month_str = "�����";
			break;
		case 1:
			day_of_month_str = "�Ͽ���";
			break;
		case 2:
			day_of_month_str = "������";
			break;
		case 3:
			day_of_month_str = "ȭ����";
			break;
		case 4:
			day_of_month_str = "������";
			break;
		case 5:
			day_of_month_str = "�����";
			break;
		case 6:
			day_of_month_str = "�ݿ���";
			break;
		
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E����"); 
		String formatDate = sdf.format(c.getTime());

		System.out.println(formatDate);
	}

}

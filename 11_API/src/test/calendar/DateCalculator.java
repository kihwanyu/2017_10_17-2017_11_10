package test.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateCalculator {
	Calendar first = new GregorianCalendar(1, 1, 1);
	Calendar today = new GregorianCalendar();

	public long getDays() {
		long sumDays = 0L;
		int firstYear = first.get(first.YEAR);
		int firstMonth = first.get(first.MONTH);
		int firstDate = first.get(first.DATE);

		int todayYear = today.get(today.YEAR);
		int todayMonth = today.get(today.MONTH) + 1;
		int todayDate = today.get(today.DATE);

		System.out.println(todayDate);
		for (int i = firstYear; i <= 2017; i++) {
			for (int j = firstMonth; j <= 12; j++) {
				
				for (int k = firstDate; k <= 31; k++) {
					sumDays++;	
					
					System.out.println("�� :"+i+"�� :"+j+"�� :"+k);
					if (j == 2) {
						
						if (isLeapYear(i) == true) {
							if (k == 29) {
								break;
							}
						} else {
							if( k == 28) {
								break;
							}
						}
					}
					if ((j == 4 || j == 6 || j == 9 || j == 11) && k == 30) {
						break;
					}
					
					if (i == todayYear && j == todayMonth && k == todayDate) {
						return sumDays;
					}
								
				}
			}
		}
		return sumDays;
	}

	/*
	 * => �� ���� ���� : �ѳ��� ����� => long sumDays = 0L; => for loop ��� : 1�� 1�� 1�Ϻ���
	 * ���ñ����� �ѳ��� ����� - 1����� ���� �⵵���� �� �⵵�� �����̸� 366����, ����̸� 365���� ���� ���� - �ش� ����
	 * �⵵�� �����̸� 2���� 29�Ϸ�, �ƴϸ� 28�Ϸ� ���� - ���� ��¥�� ���� ���� 31���� ��(ū��) : 1, 3, 5, 7, 8,
	 * 10, 12�� 30���� ��(������) : 4, 6, 9, 11�� 2, isLeapYear(�⵵) ���� ����
	 */

	public boolean isLeapYear(int year) {
		boolean leapYear = false;
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			leapYear = true;
		}
		// 4�� ����̸鼭, 100�� ����� �ƴϰų� 400�� ���
		return leapYear;
	}

	/*
	 * isLeapYear(�⵵) ���� ���� => �⵵�� �����̸� true, ����̸� false ������ => �⵵�� 4�� ����̸鼭,
	 * 100�� ����� �ƴϰų� 400�� ����� �Ǵ� �ذ� ������. (1�� : �� 365.2422 ��)
	 */

}

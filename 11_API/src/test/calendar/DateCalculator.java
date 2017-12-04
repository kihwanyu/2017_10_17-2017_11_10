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
					
					System.out.println("년 :"+i+"월 :"+j+"일 :"+k);
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
	 * => 각 변수 선언 : 총날수 저장용 => long sumDays = 0L; => for loop 사용 : 1년 1월 1일부터
	 * 오늘까지의 총날수 계산함 - 1년부터 현재 년도까지 각 년도가 윤년이면 366일을, 평년이면 365일을 더해 나감 - 해당 현재
	 * 년도가 윤년이면 2월을 29일로, 아니면 28일로 더함 - 월의 날짜수 더해 나감 31일인 달(큰달) : 1, 3, 5, 7, 8,
	 * 10, 12월 30일인 달(작은달) : 4, 6, 9, 11월 2, isLeapYear(년도) 구현 내용
	 */

	public boolean isLeapYear(int year) {
		boolean leapYear = false;
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			leapYear = true;
		}
		// 4의 배수이면서, 100의 배수가 아니거나 400의 배수
		return leapYear;
	}

	/*
	 * isLeapYear(년도) 구현 내용 => 년도가 윤년이면 true, 평년이면 false 리턴함 => 년도가 4의 배수이면서,
	 * 100의 배수가 아니거나 400의 배수가 되는 해가 윤년임. (1년 : 약 365.2422 일)
	 */

}

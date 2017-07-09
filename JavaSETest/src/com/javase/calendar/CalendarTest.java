package com.javase.calendar;

import java.util.Calendar;

import org.junit.Test;

/**
 * Calendar的一些常用方法
 * 
 * @author tonghuo
 *
 */
public class CalendarTest {

	@Test
	public void test01() {
		Calendar calendar = Calendar.getInstance();

		int year = calendar.get(Calendar.YEAR);
		System.out.println("year=" + year);

		int month = calendar.get(Calendar.MONTH);
		System.out.println("month=" + month);

		int date = calendar.get(Calendar.DATE);
		System.out.println("date=" + date);

		int monthDay = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println("一个月的第几天::" + monthDay);

		int weekDay = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println("星期" + weekDay);

		int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println("一年中的第几天::" + dayOfYear);

		int day_of_week_in_month = calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		System.out.println("day_of_week_in_month=" + day_of_week_in_month);

		int week_of_month = calendar.get(Calendar.WEEK_OF_MONTH);
		System.out.println("week_of_month=" + week_of_month);

		int week_of_year = calendar.get(Calendar.WEEK_OF_YEAR);
		System.out.println("week_of_year=" + week_of_year);

		int hour = calendar.get(Calendar.HOUR);
		System.out.println("hour=" + hour);

		int minute = calendar.get(Calendar.MINUTE);
		System.out.println("minute=" + minute);

		int second = calendar.get(Calendar.SECOND);
		System.out.println("second=" + second);
	}

}

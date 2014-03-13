package com.vesmile.framework.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DateUtil {

	private static final String MIN_DATE = "1900-01-01";
	private static final String MAX_DATE = "2500-12-31";
	public static final String YMD_FORMAT = "yyyy-MM-dd";

	public static Date fmtStrToDate(String dtFormat) {
		if (dtFormat == null)
			return null;
		try {
			if (dtFormat.length() == 9 || dtFormat.length() == 8) {
				String[] dateStr = dtFormat.split("-");
				if (dateStr.length > 1)
					dtFormat = dateStr[0]
							+ (dateStr[1].length() == 1 ? "-0" : "-")
							+ dateStr[1]
							+ (dateStr[2].length() == 1 ? "-0" : "-")
							+ dateStr[2];
			}
			if (dtFormat.length() != 10 & dtFormat.length() != 19)
				return null;
			if (dtFormat.length() == 10)
				dtFormat = dtFormat + " 00:00:00";
			SimpleDateFormat dateFormat = new SimpleDateFormat(
					"yyyy-MM-dd HH:mm:ss");
			return dateFormat.parse(dtFormat);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static Date toDate(String dateStr, String dateFormat) {
		if (dateStr == null)
			return null;
		SimpleDateFormat dtFormat = new SimpleDateFormat(dateFormat);
		try {
			return dtFormat.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static Date getMinDate() {
		return fmtStrToDate("1900-01-01");
	}

	public static Date getMaxDate() {
		return fmtStrToDate("2999-12-31");
	}

	public static int getDaysOfMonth(Date date) {
		return getDayOfMonth(getLastDayOfMonth(date));
	}

	public static Date fmtStrToDate(String dtFormat, Date def) {
		Date d = fmtStrToDate(dtFormat);
		if (d == null)
			return def;
		return d;
	}

	public static Date getToDay() {
		return toShortDate(new Date());
	}

	public static String getToDayStr() {
		return DateUtil.fmtDateToStr(new Date(), "yyyy-MM-dd");
	}

	public static String fmtDateStrYYYYMMDD(String dateStr) {
		if (!(dateStr == null || "".equals(dateStr))) {
			dateStr = DateUtil.fmtDateToStr(DateUtil.fmtStrToDate(dateStr,
					"yyyy-MM-dd"), "yyyy-MM-dd");
		}
		return dateStr;
	}

	public static String fmtDateToStr(Date date, String dtFormat) {
		if (date == null)
			return "";
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat(dtFormat);
			return dateFormat.format(date);
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}

	public static Date fmtStrToDate(String date, String dtFormat) {
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat(dtFormat);
			return dateFormat.parse(date);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static String fmtDateToYMDHM(Date date) {
		return fmtDateToStr(date, "yyyy-MM-dd HH:mm");
	}

	public static String fmtDateToYMD(Date date) {
		return fmtDateToStr(date, "yyyy-MM-dd");
	}

	public static String fmtDateToYM(Date date) {
		return fmtDateToStr(date, "yyyy-MM");
	}

	public static String fmtDateToM(Date date) {
		return fmtDateToStr(date, "MM");
	}

	public static Date toShortDate(Date date) {
		String strD = fmtDateToStr(date, "yyyy-MM-dd");
		return fmtStrToDate(strD);
	}

	public static Date toShortDate(String date) {
		if (date != null && date.length() >= 10) {
			return fmtStrToDate(date.substring(0, 10));
		} else
			return fmtStrToDate(date);
	}

	public static String transformDate(String dateStr) {
		if (dateStr == null)
			throw new IllegalArgumentException("dateStr must not be null");
		if (dateStr.length() != 10)
			throw new IllegalArgumentException("dateStr's length must be 10");
		String[] array = dateStr.split("-");
		StringBuffer buffer = new StringBuffer();
		for (int index = 0; index < array.length; index++) {
			String each = array[index];
			buffer.append(each);
		}
		return buffer.toString();
	}

	public static String antitransformDate(String dateStr) {
		if (dateStr == null)
			throw new IllegalArgumentException("dateStr must not be null");
		if (dateStr.length() != 8)
			throw new IllegalArgumentException("dateStr's length must be 8");
		String year = dateStr.substring(0, 4);
		String month = dateStr.substring(4, 6);
		String day = dateStr.substring(6);

		StringBuffer buffer = new StringBuffer();
		buffer.append(year).append("-").append(month).append("-").append(day);
		return buffer.toString();
	}

	public static Date getCounterglow(int countMonth, boolean before) {
		Calendar ca = Calendar.getInstance();
		return getCounterglow(ca.getTime(), before ? -countMonth : countMonth);
	}

	public static Date getCounterglow(Date date, int num) {
		Calendar ca = Calendar.getInstance();
		ca.setTime(date);
		ca.add(Calendar.MONTH, num);
		return ca.getTime();
	}

	public static Date addDay(Date date) {
		Calendar cd = Calendar.getInstance();
		cd.setTime(date);
		cd.add(Calendar.DAY_OF_YEAR, 1);
		return cd.getTime();
	}

	public static boolean isWorkDay(Date date) {
		Calendar cd = Calendar.getInstance();
		cd.setTime(date);
		int dayOfWeek = cd.get(Calendar.DAY_OF_WEEK);
		if (dayOfWeek != Calendar.SUNDAY && dayOfWeek != Calendar.SATURDAY)
			return true;
		return false;
	}

	public static String getChDayOfWeek(Date date) {
		Calendar cd = Calendar.getInstance();
		cd.setTime(date);
		switch (cd.get(Calendar.DAY_OF_WEEK)) {
		case Calendar.MONDAY:
			return "星期一";
		case Calendar.TUESDAY:
			return "星期二";
		case Calendar.WEDNESDAY:
			return "星期三";
		case Calendar.THURSDAY:
			return "星期四";
		case Calendar.FRIDAY:
			return "星期五";
		case Calendar.SATURDAY:
			return "星期六";
		case Calendar.SUNDAY:
			return "星期日";
		}
		return null;
	}

	public static Date getLastDayOfMonth(Date date1) {
		Calendar date = Calendar.getInstance();
		date.setTime(date1);
		date.set(Calendar.DAY_OF_MONTH, 1);
		date.add(Calendar.MONTH, 1);
		date.add(Calendar.DAY_OF_YEAR, -1);
		return toShortDate(date.getTime());
	}

	public static int getDaysInterval(Date d1, Date d2) {
		if (d1 == null || d2 == null)
			return 0;
		Date[] d = new Date[2];
		d[0] = d1;
		d[1] = d2;
		Calendar[] cal = new Calendar[2];
		for (int i = 0; i < cal.length; i++) {
			cal[i] = Calendar.getInstance();
			cal[i].setTime(d[i]);
			cal[i].set(Calendar.HOUR_OF_DAY, 0);
			cal[i].set(Calendar.MINUTE, 0);
			cal[i].set(Calendar.SECOND, 0);
		}
		long m = cal[0].getTime().getTime();
		long n = cal[1].getTime().getTime();
		int ret = (int) Math.abs((m - n) / 1000 / 3600 / 24);
		return ret;
	}

	public static Date addDay(Date date1, int days) {
		Calendar date = Calendar.getInstance();
		date.setTime(date1);
		date.add(Calendar.DAY_OF_YEAR, days);
		return date.getTime();
	}

	public static Date addMonth(Date date1, int months) {
		Calendar date = Calendar.getInstance();
		date.setTime(date1);
		date.add(Calendar.MONTH, months);
		return date.getTime();
	}

	public static Date addYear(Date date1, int years) {
		Calendar date = Calendar.getInstance();
		date.setTime(date1);
		date.add(Calendar.YEAR, years);
		return date.getTime();
	}

	public static Date getPeriodStart(Calendar date, int type, int diff) {
		date.add(type, diff * (-1));
		return date.getTime();
	}

	public static Date getPeriodStart(Date date, int type, int diff) {
		return getPeriodStart(dateToCalendar(date), type, diff);
	}

	public static Date getPeriodEnd(Calendar date, int type, int diff) {
		date.add(type, diff);
		return date.getTime();
	}

	public static Date getPeriodEnd(Date date, int type, int diff) {
		return getPeriodEnd(dateToCalendar(date), type, diff);
	}

	public static Date getWeekStart(Date date) {
		Calendar cdate = dateToCalendar(date);
		cdate.set(Calendar.DAY_OF_WEEK, 2);
		return cdate.getTime();
	}

	public static Calendar dateToCalendar(Date date) {
		Calendar cdate = Calendar.getInstance();
		cdate.setTime(date);
		return cdate;
	}

	public static Date getMonthStart(Date date) {
		Calendar cdate = dateToCalendar(date);
		cdate.set(Calendar.DAY_OF_MONTH, 1);
		return toShortDate(cdate.getTime());
	}

	public static Date getTenDaysStart(Date date) {
		Calendar cdate = dateToCalendar(date);
		int day = cdate.get(Calendar.DAY_OF_MONTH) / 10 * 10 + 1;
		if (cdate.get(Calendar.DAY_OF_MONTH) % 10 == 0 || day == 31)
			day = day - 10;
		cdate.set(Calendar.DAY_OF_MONTH, day);
		return cdate.getTime();
	}

	public static Date getTenDaysEnd(Date date) {
		Calendar cdate = dateToCalendar(date);
		if (cdate.get(Calendar.DAY_OF_MONTH) / 10 == 2
				&& cdate.get(Calendar.DAY_OF_MONTH) != 20)
			return getLastDayOfMonth(date);
		else
			return addDay(getTenDaysStart(addDay(date, 10)), -1);
	}

	public static Date getYearStart(Date date) {
		Calendar cdate = dateToCalendar(date);
		cdate.set(Calendar.DAY_OF_YEAR, 1);
		return cdate.getTime();
	}

	public static Date getQuarterStart(Date date) {
		Calendar cdate = dateToCalendar(date);
		int month = (cdate.get(Calendar.MONTH) / 3) * 3;
		cdate.set(Calendar.MONTH, month);
		return getMonthStart(cdate.getTime());
	}

	public static Date getQuarterEnd(Date date) {
		Calendar cdate = dateToCalendar(date);
		int month = (cdate.get(Calendar.MONTH) / 3 + 1) * 3;
		cdate.set(Calendar.MONTH, month - 1);
		return getLastDayOfMonth(cdate.getTime());
	}

	public static int getHour(Date date) {
		Calendar cdate = dateToCalendar(date);
		System.out.println(cdate);
		return cdate.get(Calendar.HOUR_OF_DAY);
	}

	public static int getMonthsInterval(Date d1, Date d2) {
		if (d1 == null || d2 == null || d1.compareTo(d2) > 0)
			return 0;
		Date[] d = new Date[2];
		d[0] = d1;
		d[1] = d2;
		Calendar[] cal = new Calendar[2];
		for (int i = 0; i < cal.length; i++) {
			cal[i] = Calendar.getInstance();
			cal[i].setTime(d[i]);
		}
		int y1 = cal[0].get(Calendar.YEAR);
		int y2 = cal[1].get(Calendar.YEAR);
		int m1 = cal[0].get(Calendar.MONTH);
		int m2 = cal[1].get(Calendar.MONTH);
		int t1 = cal[0].get(Calendar.DATE);
		int t2 = cal[1].get(Calendar.DATE);
		int ret = (int) Math.abs((y2 - y1) * 12 + (m2 - m1));
		if (t2 - t1 > 15)
			return ret + 1;
		else
			return ret;
	}

	public static int getDayOfMonth(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c.get(Calendar.DAY_OF_MONTH);
	}

	public static String getNextMonth(Date date) {
		Date next = DateUtil.addMonth(date, 1);
		return DateUtil.fmtDateToStr(next, "yyyyMM");
	}

	public static String fmtDateToYyyyMM(Date date) {
		return fmtDateToStr(date, "yyyyMM");
	}

	public static List getIntervalDates(Date sdate, Date edate) {
		if (sdate == null || edate == null)
			return null;
		List list = new ArrayList();
		edate = DateUtil.addDay(edate);
		while (sdate.before(edate)) {
			list.add(sdate);
			sdate = DateUtil.addDay(sdate);
		}
		return list;
	}

	public static Date getYMStart(int year, int month) {
		return fmtStrToDate(year + "-" + month + "-" + 1);
	}

	public static Date getYMEnd(int year, int month) {
		return getLastDayOfMonth(fmtStrToDate(year + "-" + month + "-" + 1));
	}

	public static String[] processMinAndMaxDate(String startDate, String endDate) {
		String[] results = new String[2];
		results[0] = startDate;
		results[1] = endDate;
		if (startDate == null && endDate == null)
			return null;
		if (startDate == null)
			results[0] = MIN_DATE;
		if (endDate == null)
			results[1] = MAX_DATE;
		return results;
	}

	public static long formatToLong(String date) {
		if (date == null)
			return 0;
		String replaced = date.replaceAll("-", "");
		return Long.valueOf(replaced).longValue();
	}

}
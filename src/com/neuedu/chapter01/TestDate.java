package com.neuedu.chapter01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		//1. 获取当前系统时间
		Date now = new Date();
		System.out.println(now);
		
		long time = now.getTime();//当前时间距离时间原点走过的毫秒数。//1970-1-1 0:0:0
		
		Date now2 = new Date();
		System.out.println(now.compareTo(now2));//== 0 now在前，返回负数 ，now在后，返回正数
		
		//Calendar
		//1. Calendar is singleton
		//2. getInstance method return child class of Calendar.
		Calendar c = Calendar.getInstance(); //current system time
		
		c.set(2019, 0, 1, 15, 12, 12);
		
		Date d = c.getTime();
		
		System.out.println(d);
		
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.HOUR)); //12小时制
		System.out.println(c.get(Calendar.HOUR_OF_DAY)); //24小时制
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.SECOND));
		
		//Date 《-》 String, conversion
		//Date -> String format yyyy-MM-dd hh:mm:ss
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(d));
		
		//String -> Date
		String str = "2019-1-1 12:12:12";
		try {
			Date d2 = sdf.parse(str);
			System.out.println(d2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

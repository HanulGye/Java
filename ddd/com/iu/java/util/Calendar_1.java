package com.iu.java.util;

import java.util.Calendar;

public class Calendar_1 {

	public static void main(String[] args) {
		//new GregorianCalendar
		Calendar ca = Calendar.getInstance();
		System.out.println(ca);
		
		//년도
		int year = ca.get(Calendar.YEAR);
		System.out.println(year);
		//월
		int month = ca.get(Calendar.MONTH);
		System.out.println(month+1);
		//일
		int date = ca.get(Calendar.DATE);
		System.out.println(date);
		
		//시
		int hour = ca.get(Calendar.HOUR_OF_DAY);
		System.out.println(hour);
		//분
		int min = ca.get(Calendar.MINUTE);
		System.out.println(min);
		//초
		int sec = ca.get(Calendar.SECOND);
		System.out.println(sec);
		//밀리
		int mil =ca.get(Calendar.MILLISECOND);
		System.out.println(mil);
		
		//
		System.out.println("============");
		int a = Calendar.AM;
		System.out.println(a);
		int p = Calendar.PM;
		System.out.println(p);
		int ap = ca.get(Calendar.AM_PM);
		System.out.println(ap);
		
		System.out.println("============");
		int s = Calendar.SUNDAY;//1
		System.out.println(s);
		int m = Calendar.MONDAY;//2
		System.out.println(m);
		int st = Calendar.SATURDAY;
		System.out.println(st);//7
		
		

	}

}

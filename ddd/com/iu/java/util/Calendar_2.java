package com.iu.java.util;

import java.util.Calendar;

public class Calendar_2 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		long l1 = ca.getTimeInMillis();
		System.out.println(l1);//50
		
		Calendar ca2 = Calendar.getInstance();//11:11
		ca2.set(Calendar.MINUTE, ca2.get(Calendar.MINUTE)+1);
		long l2 = ca2.getTimeInMillis();
		System.out.println(l2);//10
		
		long l3 = l2-l1;
		System.out.println("초 : "+l3/1000);
		System.out.println("분 : "+l3/(1000*60));
		System.out.println("시 : "+l3/(1000*60*60));
		
		

	}

}

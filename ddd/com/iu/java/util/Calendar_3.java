package com.iu.java.util;

import java.util.Calendar;
import java.util.Scanner;

public class Calendar_3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar ca = Calendar.getInstance();
		Calendar ca2 = Calendar.getInstance();
		//10분당 1000원
		System.out.println("퇴실 시간 입력");
		int h = sc.nextInt();
		System.out.println("퇴실 분 입력");
		int m = sc.nextInt();
		ca2.set(Calendar.HOUR_OF_DAY, h);
		ca2.set(Calendar.MINUTE, m);
		
		long in = ca.getTimeInMillis();
		long out = ca2.getTimeInMillis();
		long result = out-in;
		double r2 = result/(1000.0*60*10);
		r2 = Math.ceil(r2);
		System.out.println(r2);
		
		
		
		
		
		
	}

}

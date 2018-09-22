package com.iu.java.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calendar_4 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		ca.roll(Calendar.MINUTE, 50);
		System.out.println(ca.getTime());
		
		ca = Calendar.getInstance();
		ca.add(Calendar.MINUTE, 50);
		System.out.println(ca.getTime());
		
		ca = Calendar.getInstance();
		SimpleDateFormat sd = new SimpleDateFormat("yyyy년MM월dd일 E");
		String s = sd.format(ca.getTime());
		System.out.println(s);
		

	}

}

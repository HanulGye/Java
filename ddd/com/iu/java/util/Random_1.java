package com.iu.java.util;

import java.util.Random;

public class Random_1 {

	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt();
		
		System.out.println(num);
		
		num = r.nextInt(5);
		
		System.out.println(num);
		
		double d = r.nextDouble();
		int n =(int)(d*10);
		System.out.println(n);//0~9

	}

}

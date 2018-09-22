package com.iu.java.lang;

public class Wrapper_1 {

	public static void main(String[] args) {
		Integer n1 = new Integer(10);//Boxing
		Integer n2 = new Integer("20");
		int num1 = n1.intValue();	 //unBoxing
		int num2 = n2.intValue();
		System.out.println(num1+num2);
		
		n1 = num1; //AutoBoxing
		num1 = n1; //AutoUnBoxing
		
		double d = 3.14;
		Double dou = d;
		n1 = (int)d;
		dou = (double)num1;
		
		//n1 =(int)dou;
		
	}

}

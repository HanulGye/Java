package com.iu.java.lang;

public class String_2 {

	public static void main(String[] args) {
		String s1 ="iu";
		String s2 ="iu";
		String s3 = new String("iu");
		String s4 = new String("iu");
		
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		
		boolean check=s1.equals(s2);
		System.out.println(check);
		check = s3.equals(s4);
		System.out.println(check);
		

	}

}

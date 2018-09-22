package com.iu.java.lang;

public class String_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcdefg";
		String result = s.substring(2);
		
		System.out.println(result);
		result = s.substring(0, 2);
		System.out.println(result);
		
		s = "iuImageFile.jpg";
		int index = s.lastIndexOf('.')+1;
		result = s.substring(index);
		System.out.println(result);
		
		//toCharArray
		char [] ar = s.toCharArray();
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		//toLowerCase, toUpperCase
		String low =s.toLowerCase();
		String upper = s.toUpperCase();
		System.out.println(low);
		System.out.println(upper);
		
		s= "sam sung ";
		s=s.trim();
		System.out.println(s.equals("samsung"));
		System.out.println(s);
		int c =10;
		String cc ="10";
		s=String.valueOf(c);
		s=c+"";
		System.out.println(s.equals(cc));
		
		
		

	}

}

package com.iu.java.lang;

public class String_5 {

	public static void main(String[] args) {
		String s ="computer protable mouse";
		String res = s.replaceAll("computer", "mobile");
		System.out.println(s);
		System.out.println(res);
		
		s="010 1234 5678";
		String [] ns =s.split(" ");
		
		for(int i=0;i<ns.length;i++) {
			System.out.println(ns[i]);
		}

	}

}

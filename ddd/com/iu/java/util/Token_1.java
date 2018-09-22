package com.iu.java.util;

import java.util.StringTokenizer;

public class Token_1 {
	
	public static void main(String[] args) {
		String s ="iu,suji,hani,choa,kim,lee";
		//s = s.replace('-', ',');
		
		StringTokenizer st = new StringTokenizer(s, ",");
		while(st.hasMoreTokens()) {
			String result= st.nextToken();
			System.out.println(result);
		}
		
		st = new StringTokenizer(s);
		while(st.hasMoreTokens()) {
			String result = st.nextToken(",");
			System.out.println(result);
		}
		
		
		
		
		int count = st.countTokens();
		String [] ar = s.split(",");
		System.out.println(ar.length);
		System.out.println(count);
		
	}

}

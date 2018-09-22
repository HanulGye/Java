package com.iu.java.util;

import java.util.ArrayList;

public class Collection_ArrayList_2 {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add("First");
		ar.add(2);
		ar.add('c');
		ar.add(4.12);
		
		String s = (String)ar.get(0);
		int n = (int)ar.get(1);
		char ch = (char)ar.get(2);
		double d = (double)ar.get(3);
		
		ArrayList<String> ar2 = new ArrayList<>();
		ar2.add("First");
		
		String ss = ar2.get(0);
		

	}

}









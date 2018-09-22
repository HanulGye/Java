package com.iu.java.util;

import java.util.ArrayList;

public class Collection_ArrayList_1 {
	
	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add("First");
		int num=2;
		Integer n = num;//autoBoxing
		//Integer n2 = new Integer(num);
		ar.add(2);
		ar.add('3');
		ar.add(4.12);
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		System.out.println("==== add  ====");
		ar.add(1, "Second");
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		System.out.println("====  set  =======");
		ar.set(1, "two");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		System.out.println("==== remove ====");
		ar.remove(1);
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		System.out.println("====  clear =====");
		ar.clear();
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		
	}

}

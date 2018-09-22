package com.iu.java.lang;

public class Object_1 {
	
	public static void main(String[] args) {
		Object obj = new Object();
		int n=obj.hashCode();
		System.out.println(n);
		String s=obj.toString();
		System.out.println(s);
		System.out.println(obj);
		boolean check=obj.equals(obj);
		System.out.println(check);
		Object obj2 = new Object();
		check = obj.equals(obj2);
		System.out.println(check);
		System.out.println(obj==obj2);
	}

}

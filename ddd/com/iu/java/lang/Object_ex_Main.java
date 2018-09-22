package com.iu.java.lang;

public class Object_ex_Main {

	public static void main(String[] args) {
		Object_ex ob1 = new Object_ex();
		Object_ex ob2 = new Object_ex();
		ob2.a=20;
		boolean check=ob1.equals(ob2);
		System.out.println(check);
		System.out.println(ob1==ob2);
		
		System.out.println(String.CASE_INSENSITIVE_ORDER);
		

	}

}

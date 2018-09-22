package com.iu.java.lang;

public class String_1 {
	
	

	public static void main(String[] args) {
		String s ="hello";
		char [] ch = {'a', 'b', 'c'};
		//String s = new String("abcdefg")
		//참조변수명.메서드명();
		char c =s.charAt(0);
		System.out.println(c);
		int n=s.codePointAt(1);
		System.out.println(n);
		
		s="hello";
		String str=s.concat("iu");
		System.out.println(str);
		System.out.println(s);
		
		
		
		

	}

}

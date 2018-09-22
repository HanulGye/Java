package com.hanul.staticTest;

public class StaticMain {

	
	public static void main(String[] args) {
		
		//StaticTest s = new StaticTest();
		//s.a=5;
		StaticTest.b = 100;
		//클래스변수 초기화
		//클래스명.변수명 = 초기화값;
		System.out.println(StaticTest.b);
		
		StaticTest.prn2();
		//클래스 메서드 호출하는 방법.
		//클래스명.메서드명();
		
		StaticTest s = new StaticTest();
		
		s.prn1();
		
		
		
	}
	
}

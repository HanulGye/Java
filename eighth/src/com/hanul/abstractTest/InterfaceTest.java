package com.hanul.abstractTest;

public interface InterfaceTest {
	
	//상수와 추상메서드만 가질 수 있다.
	
	public static final int a = 10;
	public static int b=20;
	int c=30;
	
	//interface 상수앞에는 무조건 public static final이 들어가야되는데, 
	//자동으로 들어가있다(생략되어있을뿐)
	
	
	public abstract void test();
	void test2();
	
	//interface 추상메서드 역시 public abstract 는 고정임 그래서 생략가능.
	
	
	
	
}

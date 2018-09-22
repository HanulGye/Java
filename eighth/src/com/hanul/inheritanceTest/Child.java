package com.hanul.inheritanceTest;

//import com.hanul.finalTest.FinalTest;
//import com.hanul.finalTest.*;
//import란 이 처럼 다른 패키지에 있는 클래스의 메서드나 변수들을 사용할 수 있게끔 위치를 명시해주는것.


public class Child extends Parent {

	//FinalTest f = new FinalTest(10);
	
	public void play() {
		System.out.println("놀이터에 가서 논다.");
	}
	
	int a = 100;
	
	public void info() {
		System.out.println("this 이건 child의 a"+this.a);
		System.out.println("super 이건 parent의 a"+super.a);
	}
	
	
	
}

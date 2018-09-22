package com.hanul.staticTest;

public class StaticTest {

	//그외 지정자
	//그외지정자는 중첩사용가능(그러나 의미적으로 모순이면 중첩 불가)
	//접근지정자는 안됐지만.
	//1. static
	//	공통의, 클래스의 라는 뜻
	// 	메모리의 method 영역(static)에 값을 만들어라. 	
	//
	//	1) 사용가능한 곳
	//	static은 멤버 메서드 선언부, 멤버 변수 선언부에만 들어간다.
	//	2) 객체를 생성하지 않고도 사용 가능.
	//	클래스명.멤버메서드or멤버변수 (선언방법)
	//	3) 언제쓰나?
	//	여러 클래스에서 공용으로 사용할 변수,메서드 같은경우 static으로 지정해줌.
	
	int a;
	public static int b; //이렇게 그외지정자가 붙으면, 클래스변수라고 함.
	
	public void prn1() {
		System.out.println("MemberMethod Test");
		System.out.println("a : "+this.a);
		System.out.println("b : "+StaticTest.b);
		StaticTest.prn2();
		
	}
	
	public static void prn2() { 
		System.out.println("ClassMethod Test");
		System.out.println("b : "+b);
		//System.out.println("a : "+this.a);
		//this.prn1();
		//위의 주석처리된 2 코드가 왜 에러가 뜰까?
		//그것은 생성순서의 차이때문.
		//멤버변수및 메서드는 객체가 생성된 이후에 사용이 가능한데 반해,
		//클래스변수및 메서드는 객체 생성과는 관계없이 메서드영역에 선행되어 만들어지기 때문.
		//즉 prn2는 이미 만들어졌는데, prn1, a는 안만들어졌을수도 있기에 코드에러발생.
		
	}//이 경우는 클래스 메서드 
	
	
	
}

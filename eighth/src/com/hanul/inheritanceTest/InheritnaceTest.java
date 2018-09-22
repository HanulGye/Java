package com.hanul.inheritanceTest;

public class InheritnaceTest {
	public static void main(String[] args) {
		
		
		Child c = new Child();
		c.info();
		
		Parent p = new Child();
		//이게 바로 다형성!
		
		
		
		System.out.println (p.name);
		System.out.println(p.age);
		//System.out.println(p.info);
		//부모타입 참조변수 p에 새로운 자식클래스 Child를 참조할 수는 있지만
		//자식클래스가 상속받은거 이외(공통적으로 갖고 있는 변수및 메서드 이외)는 사용할 수 없다.
		//그래서 주석처리된 sysout이 오류가 발생하는것.
		
		
		
		
		
	}
}

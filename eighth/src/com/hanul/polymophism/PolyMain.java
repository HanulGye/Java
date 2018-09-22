package com.hanul.polymophism;

public class PolyMain {

	public static void main (String[]args) {
		
		Child c = new Child();
		c.page = 60;
		c.age = 20;
		c.c();
		c.p();
		
		
		Parent p = new Parent();
		p.page = 30;
		p.p();
		

		p=c;
		//이게 된다는 건? 
		//child클래스가 parent클래스로부터 상속받으면서 is a 관계가 성립
		//즉 child는 parent다
		//child는 parent 타입과 같다.
		
		//하지만!
		//바뀐 p의 주소값으로 Child클래스(객체)에 접근할 수 있지만,
		//p가 원래 parent 클래스였기에 child클래스에서 선언한 변수 및 메서드는 접근불가함!
		//부모클래스(공통)의 내용은 알지만 자식클래스(개별)의 내용은 인식못한다. 
		
		c=(Child)p; 
		c.c();
		c.page=10;
		c.p();
		
		
		Parent p2 = new Parent();
		
		
		
		
		
		
		
		
		
	}
	
}

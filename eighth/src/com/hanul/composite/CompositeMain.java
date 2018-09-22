package com.hanul.composite;

public class CompositeMain {

	public static void main(String[] args) {
		
	
	Circle o = new Circle();
	CompositeView v = new CompositeView();
	
	o.setR(10);
	o.xYPrint();
	//v.view(o);
	v.view2(o);
	
	//has a관계(포함)라는건
	//기존에 우리가 한 클래스에서 메서드와 변수들을 다른 클래스에서도 사용하고 싶을 때
	//했던 것처럼 사용하고 싶은 클래스를 다른 클래스에 생성하고(객체) 거기서 메서드 호출이나
	//변수 초기화등 하면되는거임. 
	
	
	}
}

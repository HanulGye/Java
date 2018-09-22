package com.hanul.composite;

public class CompositeView {

	public void view(Circle c) {
		
		System.out.println("반지름 : "+c.getR());
		System.out.println("x의 좌표 : "+c.c.getX());
		System.out.println("y의 좌표 : "+c.c.getY());
	}
	
	public void view2(Circle c) {
		
		System.out.println("x의 좌표 : "+c.c.getX());
		System.out.println("y의 좌표 : "+c.c.getY());
		
	}
	
}

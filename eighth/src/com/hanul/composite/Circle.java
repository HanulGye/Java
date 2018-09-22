package com.hanul.composite;

public class Circle {

	
	Point c = new Point();
	
	
	private int r; //반지름
	public Point getC() {
		return c;
	}
	public void setC(Point c) {
		this.c = c;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	
	public void xYPrint() {
		
		c.setX(3);
		c.setY(8);
		
		
	}
	
	
}

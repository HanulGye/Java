package com.hanul.mart;

public class Product {

	//제품명, 가격, 포인트(적립포인트) 
	
	private String name;
	private int price;
	private int point;
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getPoint() {
		return point;
	}
}

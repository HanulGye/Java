package com.hanul.mart;

public class ProductView {

	/*public void view(String name, int price, int point) {
		System.out.println(name);
		System.out.println(price);
		System.out.println(point);
	}*/
	
	public void view(Product p) {
		System.out.println(p.getName());
		System.out.println(p.getPrice());
		System.out.println(p.getPoint());
	}
	
}

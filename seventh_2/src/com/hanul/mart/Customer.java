package com.hanul.mart;

public class Customer {

	private int money, point;
	
	Customer(){
		this.money=10000000;
		this.point=0;
		
	}
	
	//buy method 만들자
			//계산기능, (물건값, 포인트)
			//최종적으로 남은 돈과 포인트 출력해주자.
			
	public void buy(Product p) {
		
		money= money-p.getPrice();
		point= point+p.getPoint();
		System.out.println(money);
		System.out.println(point);
		
	}
	
	public void buys(Product[] p) {
		
		
			for(int i=0;i<p.length;i++) {
			money = money-p[i].getPrice();
			point = point+p[i].getPoint();
			
			}
			System.out.println(money);
			System.out.println(point);
		
	}
	
	
}

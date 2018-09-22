package com.hanul.o10;

public class View {

	public void view(Product p) {
		
		System.out.println((p.name)+(p.price));
		
	}//프로덕트 타입을 출력하는 뷰
	
	public void view2(Product [] p1) {
		
		System.out.println(p1[0].name);
		System.out.println(p1[0].price);
	}	
}

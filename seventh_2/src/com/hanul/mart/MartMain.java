package com.hanul.mart;

import java.util.Scanner;

public class MartMain {

	//제품 3개를 만들어보자
	//아이폰 x , 1,000,000 , 200p
	//갤럭시노트9, 1,200,00 , 100p
	//v45, 800,000 , 50p

	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);
		
		Customer kim = new Customer();
		Product ix = new Product();
		Product g9 = new Product();
		Product v45 = new Product();
		ProductView pv = new ProductView();


		ix.setName("아이폰x");
		ix.setPrice(1000000);
		ix.setPoint(200);

		g9.setName("갤노트9");
		g9.setPrice(1200000);
		g9.setPoint(100);
		
		v45.setName("v45");
		v45.setPrice(800000);
		v45.setPoint(50);
		
	
			System.out.println("1.아이폰\n2.갤노트9\n3.v45\n4.안사요");

			//위에 입력한 프로덕트 정보를 받아줄 빈통들.
			/*String name;
			int price;
			int point;*/

			//어느 프로덕트의 정보를 볼 것인가 선택.
			int select = sc.nextInt();



			if(select==1) {
				/*name = ix.getName();
			price = ix.getPrice();
			point = ix.getPoint();*/
				pv.view(ix);
				
				


			}else if(select==2) {
				/*name = g9.getName();
			price = g9.getPrice();
			point = g9.getPoint();*/
				pv.view(g9);
				


			}else {
				/*name = v45.getName();
			price = v45.getPrice();
			point = v45.getPoint();*/
				pv.view(v45);
				


			}
		

		//입력했던 프로덕트 번호에 맞게 출력해줄 녀석.
		//pv.view(name, price, point);
		
		Product [] p = new Product [3];
		p[0]=ix;
		p[1]=g9;
		p[2]=v45;
		
		kim.buys(p);
				
		
		

	}
}

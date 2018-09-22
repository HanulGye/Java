package com.hanul.o6;

import java.util.Scanner;

public class Cash {
	int m;
	public void cc(){


		Scanner sc = new Scanner(System.in);
		System.out.println("현금을 투입해주세요.");
		m = sc.nextInt();
		System.out.println("투입하신 금액은\n"+
				"천원권 : "+m/1000+"장\n"+
				"백원권 : "+(m%1000)/100+"개\n"+
				"십원권 : "+(m%100)/10+"개 입니다.");
	}//현금 투입 및 확인
	
	
	
	public void dk(){
		int d1 = 500;
		int d2 = 700;
		int d3 = 2200;
		int d4 = 1200;
		int select = 0; 

		Scanner sc = new Scanner(System.in);
		if(m>=500) 
			//별도의 class B를 만든 뒤, Cash class의 m을 불러오고
			//B에서 아래와 같은 연산을 수행하려면 어떻게 해야하는가.
			//B에서 Cash class의 객체를 생성하면 m의 값은 0이 되버림.
			//원하는 건 cc 메서드가 수행된 뒤의 금액으로서의 m임.
			
			{
			System.out.println("음료를 선택해 주세요.");
			System.out.println("1. d1\n2. d2\n3. d3\n4. d4");
			select = sc.nextInt();

			switch(select) {

			case 1 : System.out.println(m-d1);
			break;

			case 2 : if(m>=700) { System.out.println("거스름 돈 : "+(m-d2)+"원");	
			break;}else {System.out.println("투입 금액을 확인해주십시오");
			}break;

			case 3 : if(m>=2200) {System.out.println("거스름 돈 : "+(m-d3)+"원"); 
			break;}else {System.out.println("투입 금액을 확인해주십시오");
			}break;

			case 4 : if(m>=1200) { System.out.println("거스름 돈 : "+(m-d4)+"원");
			break;}else {System.out.println("투입금액을 확인해주십시오");
			}break;

			default : System.out.println("잘못 누르셨습니다.");
			break;


			}//switch의 끝
		}else {
			System.out.println("금액이 부족합니다.");
		}//if else의 끝


		System.out.println("반환된 거스름 돈을 확인해주세요.\n이용해주셔서 감사합니다.");


	}//음료 선택 및 거스름돈 반환 
}
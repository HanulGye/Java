package com.hanul.ctrlIfTest;

public class Control_1_if {
	public static void main(String[] args) {
	
		//if - 만약에(조건문) 
		// 기본형식 : if(조건식){조건식이 참이라면 실행되는 내용} - 단일 if문
		
		// 예제를 만들어 봅시다.(커피를 산다.)
		int money=5000;
		int coffee=2000;
		boolean check=false;//배고프면 t, 아니면 f
		
		if(money>=coffee) {
			System.out.println("커피를 구매한다.");
			money=money-coffee;
			
		}
		
		if(check==true)//check값 자체가 boolean타입이기에 굳이 ==true,false 쓸 필요 없음.
			{
			System.out.println("물을 먹자 ㅠㅠ");
			
		}
		
		
		System.out.println("잔돈 : "+money);
		System.out.println("학원에 온다.");
		
	}
}

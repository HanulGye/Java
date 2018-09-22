package com.hanul.ctrlSwitchTest;

import java.util.Scanner;

public class Control_1_switch {

	public static void main(String[] args) {
		//switch case문 
		//형식은 switch(정수식){case : }
		//if문과의 차이점은 ()안에 조건식이 아닌 정수식!이 들어감 
		//중요한 건 정수식이지 타입이 정수만 가능하다는 건 아님. (char타입 string등도 가능, 자동형변환 덕분)
		//정수식에 결과값은 하나여야 됨!
		
		Scanner sc = new Scanner(System.in);
		int select =0;
		System.out.println("1~4번 중 하나 입력하시오");
		select = sc.nextInt();
		
		
		switch(select) {
		case 1: //case의 값은 언제나 상!수!여야함! 변수를 넣는건 노노
			System.out.println("김창식");
			break;//break안걸어주면 계속 실행함.
		case 2:
			System.out.println("노영식");
			break;
		case 3:	
			System.out.println("변창호");
			//case ? : ?에 들어갈 숫자의 순서는 상관없음.
			//if else문과 달리 case에 해당되지 않는 나머지는 처리하지 않음
			break;
		default:
			System.out.println("범인");
			//나머지를 표시해주는 기능이 switch에선 default 
		}
		
		
		
	}
}

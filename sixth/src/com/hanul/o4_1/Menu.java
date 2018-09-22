package com.hanul.o4_1;

import java.util.Scanner;

import com.hanul.o4_1.Sal;

public class Menu {
	public void start() {
		int money = 0;
		int select = 0;
		boolean check = true;
		Scanner sc = new Scanner(System.in);
		Sal s = new Sal();
		//얘는 input 받고 거기서 보험료계산이 이뤄지기에 
		//반복문에서 생성하면 안됨.
		//객체 하나 만들고 메서드 호출하고 이게 무조건 통용되는게 아님
		//메서드(기능)를 사용하기 위해선 객체가 필요하지만
		//이미 생성된 객체를 변경하는 경우는 굳이 새로운 객체 만들 필요가 없음.
		
		while(check) {
			System.out.println("1. 급여입력\n2. 국민연금계산\n3. 의료보험계산\n4. 고용보험 계산\n5. 산재보험 계산\n6. 종료");
			select = sc.nextInt();
			switch(select) {
			case 1:
				s.input(money);
				break;
			case 2:	
				
				s.ins1(money);
				
				break;
			case 3:	
				s.ins2(money);
				break;
			case 4:	
				s.ins3(money);
				break;
			case 5:	
				s.ins4(money);
				break;
			default:	
				System.out.println("종료합니다.");
				check=!check;
				
				
			}

		}





	}
}

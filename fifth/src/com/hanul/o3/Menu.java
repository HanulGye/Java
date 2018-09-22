package com.hanul.o3;

import java.util.Scanner;

public class Menu {

	//메서드 명은 start

	public void start() {
		int select = 0;
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		boolean result = false;
		while(check) {System.out.println("1. 로그인\n2. 게임 실행\n3. 종료");
		select = sc.nextInt();
		
		if(select==1) {
			Member m = new Member();
			result = m.login(); //이거 결과물이 boolean타입임
			

		}else if(select==2) {
			if(result==true) {
			Game p = new Game();
			p.play();
			}else {
				System.out.println("로그인을 하십시오.");
			}

		}else {
			System.out.println("프로그램을 종료합니다.");
			break;
			//check =!check 해줘도 됨. 
			//근데 if문 썼으니 break도 가능한거.

		}

		
		}

	}

}

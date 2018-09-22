package com.hanul.o3;

import java.util.Scanner;

public class Member {

	//메서드명 login
	//아이디 1234
	//비번 5678
	public boolean login() {
		int id = 1234;
		int pw = 5678;
		int yId, yPw;
		boolean result = false;

		Scanner sc = new Scanner(System.in);
		boolean check = true;
		while(check) {
		System.out.println("아이디를 입력하세요.");
		yId = sc.nextInt();
		System.out.println("비밀번호를 입력하세요.");
		yPw = sc.nextInt();

		if(yId==id&&yPw==pw) {

			System.out.println("로그인 성공");
			result = !result;
			break;

		}else {

			System.out.println("로그인 실패");
			
		}



	}

		return result;
	}
	
	
}

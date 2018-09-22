package com.hanul.ctrlForTest;

import java.util.Scanner;

public class For_6_ex5 {

	public static void main(String[] args) {

		//for문은 반복횟수를 정해져 있는 경우 쓴다.
		//정해져있지않은 경우는 다른거 쓴대
		//로그인 성공시, 종료. 로그인 실패시, 다시 시도해야되는 for문 만들어보셈
		//로그인 시도 횟수 한도는 3번으로 하자.
		//3번 전부 실패했을 시, "은행방문"을 출력하시오


		int id = 1234; //정해진 id값
		int pw = 4321; //정해진 pw값
		boolean check = true;
		Scanner sc = new Scanner(System.in);

		System.out.println("아이디를 입력하세요.");
		int iid = sc.nextInt();
		System.out.println("비밀번호를 입력하세요.");
		int ppw = sc.nextInt();

		if(iid!=id||ppw!=pw) {
			System.out.println("로그인 실패");
			for(int i=0;i<2;i++) {
				if(i<=1) {
					System.out.println("아이디를 입력하세요.");
					iid = sc.nextInt();
					System.out.println("비밀번호를 입력하세요.");
					ppw = sc.nextInt();
				}else {
					i=4;
					check=!check;}
			} 
		}else {System.out.println("로그인 성공");
			   check = !check;
		}

		if(check) {System.out.println("은행방문");}






	}
}

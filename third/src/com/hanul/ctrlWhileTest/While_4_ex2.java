package com.hanul.ctrlWhileTest;

import java.util.Scanner;

public class While_4_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		//로그인
		int id =1234;
		int pw =5678;
		int yId =0;
		int yPw =0;
		boolean check = true;//로그인 반복 수행을 위함.

		while(check) {
			System.out.println("1. 로그인 | 2. 종료");
			int select = sc.nextInt();

			if(select==1) {
				System.out.println("id, pw순으로 입력하시오");
				yId = sc.nextInt();
				yPw = sc.nextInt();
				if(yId==id&&yPw==pw) {
					System.out.println("로그인 성공");
					break;
				}else {
					System.out.println("로그인 실패");
				}


			}else {
				check = !check;//프로그램 종료로 넘어가기위한. 
			}
		}//로그인 끝

		if(check) {
			//게임 실행
			int level=0;//렙
			int gold=0;//돈
			for(level=1;level<15;level++) {
				if(level%5==0) {
					gold = gold+ level/5*1000;
					System.out.println(level/5*1000+" gold 지급");
				}


				System.out.println("1.사냥 | 2.종료");
				int select = sc.nextInt();
				if(select==1) {
					for(int m=1;m<=3*level;m++) {
						System.out.println("몬스터 "+m+" 마리 사냥");
					}
				}else {
					break;
				}

				System.out.println("level up!");
			}//레벨업 라인

			System.out.println("현재 레벨 : "+level);
			System.out.println("현재 골드 : "+gold);


		}else {
			//로그인 실패로 인한 종료
		}			


		System.out.println("프로그램 종료");//완전 종료






	}
}

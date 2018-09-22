package com.hanul.ctrlWhileTest;

import java.util.Scanner;

public class While_4_ex {
	public static void main(String[] args) {

		//월 ~ 목 내용 정리 예제
		//RPG게임을 만들어보자
		int id = 1234;
		int pw = 5678;
		int yId = 0;
		int yPw = 0;
		boolean check = true;
		int input =0;
		int level =0;

		Scanner sc = new Scanner(System.in);

		System.out.println("게임을 시작하시겠습니까?\n1. 예\n2. 아니오");
		input = sc. nextInt();

		while(input==1) {

			System.out.println("아이디를 입력하세요.");
			yId = sc.nextInt();
			System.out.println("비밀번호를 입력하세요.");
			yPw = sc.nextInt();
			if(yId==id&&yPw==pw) {
				System.out.println("로그인 성공");
				break;
			}else {System.out.println("로그인 실패\n1. 재 로그인\n2. 프로그램 종료");
			input = sc.nextInt();
			if(input==2) {

				break;
			}


			}

		}//여기까지가 로그인 파트


		while(level<16) {
			System.out.println("1. 사냥\n2. 프로그램 종료");
			input = sc.nextInt();
			if(input==1) {
				for(level=0;level<15;level++) { 
					if(level>1) {
						System.out.println("level up!");
						System.out.println("사냥 or 종료?\n1. 사냥\n2. 종료");
						input = sc.nextInt();
						if(input==2) {
							break;
						}

					}

					System.out.println("현재레벨 : "+(level+1));
					for(int m=0;m<level*3;m++) {
						System.out.println("몬스터를 사냥했다.");
						System.out.println("현재 잡은 몬스터 수: "+(m+1));
						System.out.println();


					}
				}		





			}else {
				break;//사냥 안한다고 했을 때.
			}
		}



		System.out.println("프로그램 종료");





	}
}




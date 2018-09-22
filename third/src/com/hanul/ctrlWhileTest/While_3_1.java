package com.hanul.ctrlWhileTest;

import java.util.Scanner;

public class While_3_1 {
	public static void main(String[] args) {
		//성적관리 프로그램 만들어보자.
		//버튼을 입력하시오. 메시지 출력
		//1 입력하면 -> 성적(국영수)입력 메시지 출력
		//2 입력하면 -> 총점 출력
		//3 입력하면 -> 평균 출력 -> 버튼을 입력하시오 메시지 출력
		//4 입력하면 -> 프로그램종료
		//묶여서 반복되는건 버튼입력~3번까지.
		Scanner sc =new Scanner(System.in);
		boolean check = true;
		int kor = 0;
		int eng = 0;
		int math = 0;


		while(check) {
			System.out.println("1. 성적입력");
			System.out.println("2. 총점출력");
			System.out.println("3. 평균출력");
			System.out.println("4. 종료");

			int input = sc.nextInt();

			
			if(input==1) {
				System.out.println("국어 영어 수학 순으로 성적을 입력하시오");
				kor = sc.nextInt();
				eng = sc.nextInt();
				math = sc.nextInt();
			}else if(input==2) {
				System.out.println("총점 : "+(kor+eng+math)+"점");
			}else if(input==3) {
				System.out.println("평균 : "+((kor+eng+math)/3)+"점");
			}else if(input==4){
				check=!check;
				System.out.println("프로그램을 종료합니다.");
			}else {System.out.println("선택 오류");
			}
		}

	}
}

//숙제 : 총, 게임, 
//숙제할 때, 알고리즘 짜 보고 프로그래밍하자!!

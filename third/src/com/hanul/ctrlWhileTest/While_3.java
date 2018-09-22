package com.hanul.ctrlWhileTest;

import java.util.Scanner;

public class While_3 {
	public static void main(String[] args) {
		//성적관리 프로그램 만들어보자.
		//버튼을 입력하시오. 메시지 출력
		//1 입력하면 -> 성적(국영수)입력 메시지 출력
		//2 입력하면 -> 총점 출력
		//3 입력하면 -> 평균 출력 -> 버튼을 입력하시오 메시지 출력
		//4 입력하면 -> 프로그램종료
		boolean check = true;
		Scanner sc = new Scanner (System.in);
		int kor=0;
		int eng=0;
		int math=0;
		while(check) {System.out.println("1~4중 입력하시오\n1.성적\n2.총점\n3.평균\n4.프로그램종료");
		int input = sc.nextInt();

		if(input==1) {System.out.println("성적을 입력하세요(국,영,수 순서)");
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		}else if(input==2) {
			System.out.println("총점 : "+(kor+eng+math)+"점");
		}else if(input==3) {
			System.out.println("평균 : "+(kor+eng+math)/3+"점");
		}else if(input==4) {
			check = !check;
			System.out.println("종료");
		}
		}

	}
}

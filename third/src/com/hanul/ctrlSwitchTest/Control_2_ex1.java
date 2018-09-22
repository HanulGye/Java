package com.hanul.ctrlSwitchTest;

import java.util.Scanner;

public class Control_2_ex1 {
	
	public static void main(String[] args) {
		
		//예제 요구사항
		//국영수 입력 및 평균값 구하시오
		//90이상 a 80 이상b 70이상 c 60이상 d 나머지 f
		
		int kor,eng,math;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하시오");
		kor = sc.nextInt();
		System.out.println("영어 점수를 입력하시오");
		eng = sc.nextInt();
		System.out.println("수학 점수를 입력하시오");
		math = sc.nextInt();
		
		int avg = (kor+eng+math)/3;
		System.out.println("평균 점수 : "+avg);
		
		switch(avg/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default :
			System.out.println("나머지");
			
		}
		//70~79점까지 c로 만들고 싶으믄, 10개의 수를 하나로 묶어서 파악해야되는데
		//이 경우에 필요한 10단위의 수 7만 따로 떼낼 수 있으면 가능함. 그래서 /10 한거
		
		
	}
}

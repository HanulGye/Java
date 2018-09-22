package com.hanul.ctrlIfTest;

import java.util.Scanner;

public class Control_2_ex1 {
	public static void main(String[] args) {
		//예제를 풀어보시오
		//키보드로부터 국,영,수 점수를 입력받는다.
		//평균을 구하시오
		//평균이 90<=우등상 
		//우등상 수여자 중 평균>=95 특별상 수상 
		int kor = 0;
		int eng = 0;
		int math = 0;
		//int total = kor+eng+math;
		//int avg = total/3;	이렇게 미리 적어넣으면 디폴트값으로 계산을 수행하기에 아래의 조건문 작동 x!!!
		//						위에서는 변수선언만 하는 것도 괜찮은 방법(어떤 변수들이 등장하는지 한 눈에 보이기 위해서)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하시오");
		kor = sc.nextInt();
		System.out.println("영어점수를 입력하시오");
		eng = sc.nextInt();
		System.out.println("수학점수를 입력하시오");
		math = sc.nextInt();
		
		int total = kor+eng+math;
		double avg = total/3.0;
		int price = 0;
		System.out.println("평균 점수 : "+avg);
		
		if(avg>=90&&avg<95) { 
			System.out.println("우등상 수여 대상입니다.");
			//int price = 100; 중괄호{} 안에 선언된 변수 '지역변수'라고 한다. 
			//int타입이기에 primitive타입이기도 하고.
			//지역변수의 특징! {}가 종료되면 사용이 불가하다.
			if(avg>=95)	{
				System.out.println("특별상 수여 대상입니다.");
						}
		}
		
		
		
		
		//System.out.println(price); 이 구문은 현재 에러인데, 이유는 중괄호를 벗어난 영역에서 출력하고자 했기에.
		System.out.println("졸업");
		
	}
}

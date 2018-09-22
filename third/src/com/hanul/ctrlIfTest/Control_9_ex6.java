package com.hanul.ctrlIfTest;

import java.util.Scanner;

public class Control_9_ex6 {

	public static void main(String[] args) {
		
		
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
		
		double avg = (kor+eng+math)/3.0;
		
		System.out.println("평균 점수 : "+avg);
		
		if(avg>=90) {System.out.println("A");
		}else if(avg>=80) {System.out.println("B");
		}else if(avg>=70) {System.out.println("C");
		}else if(avg>=60) {System.out.println("D");
		}else {System.out.println("F");
		}
		
		//중괄호를 사용안하고 if문 만들어도 자동으로 영역이 잡힘
		//그런데 안 치면 한 줄만 영역이 잡히므로 유의할 것. 
		
	}
	
}

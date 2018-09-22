package com.hanul.ctrlIfTest;

import java.util.Scanner;

public class Control_3_if {
	
	public static void main(String[] args) {
		
		//점수를 입력받아서
		//평균 60이상이면 합격, 아니면 탈락
		//위와 같은 조건에 따라 결과값을 "둘 중 하나만 골라" 출력할 경우
		//if else 문 써야됨
		//if(){조건식 참이면 출력}else{조건식이 거짓이면 출력}
		int score = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하시오.");
		score = sc.nextInt();
		
		if(score>=60) {
			System.out.println("합격");}
			else {
				System.out.println("탈락");}
		
		
	}
}

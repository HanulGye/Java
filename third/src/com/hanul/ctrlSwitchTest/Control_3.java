package com.hanul.ctrlSwitchTest;

import java.util.Scanner;

public class Control_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("회원가입은 1번, 로그인은 2번, 종료는 3번을 입력하시오.");
		int select = sc.nextInt();
		
		if(select==1) {
			System.out.println("회원가입 진행");
		}else if(select==2) {
			System.out.println("로그인 진행");
		}else if(select==3){
			System.out.println("종료");
		}else {
			System.out.println("잘못 입력하였습니다. 다시 선택하십시오.");
		}
		
		
	
	}
}

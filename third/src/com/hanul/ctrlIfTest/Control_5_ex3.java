package com.hanul.ctrlIfTest;

import java.util.Scanner;

public class Control_5_ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("남자는 M, 여자는 F를 입력하십시오.");
		String num = sc.next();
		
		if(num=="M") {
			System.out.println("M");
		}else {
			System.out.println("F");
		}
		//reference 타입을 if문에 넣는 경우, 조건식에 ==를 넣으면 맞을 때도 있고 틀릴 때도 있다.
		//위의 소스코드도 실행값이 틀림 (M을 입력해도 F로 나옴)
		//== 기호는 primitive타입만 사용하는 걸로(당분간)
		
		
	}
}

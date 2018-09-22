package com.hanul.ctrlForTest;

import java.util.Scanner;

public class For_3_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//이름을 반복해서 프린트. 단, 입력한 숫자만큼
		System.out.println("반복할 횟수를 입력하시오.");
		int count =sc.nextInt();
		
		for(int i=0;i<count;i++) {
			System.out.println("계한울");
			}
		System.out.println("===========");
		for(int i=count;i>0;i--) {
			System.out.println("계한울");
		}
		//바로 위의 식 왜 이렇게 만드는지 원리를 좀 파악합시다.
		
	}
}

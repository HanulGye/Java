package com.hanul.ctrlIfTest;

import java.util.Scanner;

public class Control_4_ex2 {

	public static void main(String[] args) {
		//나이를 입력받아서, 10대인지 아닌지 판단
		
		int age = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력하시오.");
		age = sc.nextInt();
		
		if(age>=10&&age<20) {
			System.out.println("10대입니다.");}
			else {
				System.out.println("10대가 아닙니다.");
			}
		
	}
}

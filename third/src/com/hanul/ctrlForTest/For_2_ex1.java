package com.hanul.ctrlForTest;

import java.util.Scanner;

public class For_2_ex1 {

	public static void main(String[] args) {
		//예제 조건 :	키보드로부터 구구단수 입력 받음
		//			9단까지 값이 나오게끔 출력하시오.
		System.out.println("단 수를 입력하시오.");
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		
		for(int gugu=1;gugu<10;gugu++) {
			System.out.println(select+"*"+gugu+"="+select*gugu);
		}
		
		
		
		
	}
}

package com.hanul.ctrlForTest;

public class For_7_1 {
	public static void main(String[] args) {

		int num = 4;
		for(int i=0;i<10;i++) {
			if(i==num) {
				System.out.println("break");
				break;
			}
			System.out.println(i);
		}

		for(int i=0;i<10;i++) {
			if(i==num) {
				System.out.println("continue");
				continue;
			}
			System.out.println(i);
		}

		System.out.println("종료");

	}
}

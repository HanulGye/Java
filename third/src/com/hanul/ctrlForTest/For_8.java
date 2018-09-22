package com.hanul.ctrlForTest;

import java.util.Scanner;

public class For_8 {
	public static void main(String[] args) {
		//시간을 출력, 0분 0초부터 시작,
		//0분 59초 -> 1분 0초 -> 1분 59초 -> 2분 0초 식.

		int min=0;
		int sec=0;
		Scanner sc = new Scanner(System.in);

		System.out.println("분과 초를 입력하시오");
		min = sc.nextInt();
		sec = sc.nextInt();
		
		for(int m=0;m<60;m++) {
			for(int s=0;s<60;s++) {
				System.out.println(m+"분"+s+"초");
				
				if(min==m&&sec==s) {
					m=60;//break 하기전 분 단위를 for를 종료시키기 위한 코드
					break; //초단위에서 for를 종료시키기 위한 코드
				}
			}//안쪽for
		}//바깥쪽for
	
	}
}

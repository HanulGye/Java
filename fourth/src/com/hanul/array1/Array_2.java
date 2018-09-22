package com.hanul.array1;

import java.util.Scanner;

public class Array_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		int[] ar = new int[3]; //정수형 배열 만들어보자
		ar[0]=10;
		ar[1]=20;
		ar[2]=30;

		for(int i=0; i<3; i++) {
			System.out.println(ar[i]);

		}
		//이처럼 배열 과 for문은 자주 묶어 사용됨. 
		//정해진 횟수=배열의 배정된 칸 수 있기 때문에 while보단 for


		//사람 이름을 3개 받아서 저장하고 모두출력
		String[] name = new String[3];


		for(int i=0; i<3; i++) {
			System.out.println(i+1+" 번째 이름 입력");	
			name[i] =sc.next();
		}

		for(int d=0; d<3; d++)
		{System.out.println(name[d]);

		}


	}
}

package com.hanul.ctrlWhileTest;

import java.util.Scanner;

public class While_1 {
	public static void main(String[] args) {

		//while 문(반복문) 
		//while(조건식){조건식이 true일 때 실행됨}

		/*int i=0;
		while(i<5) {
			System.out.println("number");
			i++;
		}*/
		//반복할 횟수가 정해져있을때 : for / 아닐때 : while
		//while -> eg로그인 될 때까지 시도하는 경우.(숙제)

		Scanner sc= new Scanner(System.in);
		boolean check =true;
		int answer =4;
		int count =0;

		while(check) {
			System.out.println("0부터 10 사이에 숫자 입력하시오");
			int num = sc.nextInt();
			count = count+1;//count++
			if(num==answer) {
				System.out.println("o");

				//check=!check; //1) 조건식 false로 만들어 반복중지 
				break;			//2) 맞았을 때 break걸어 반복중지
				//contine; 라면 조건식으로 되돌아감.
				
			}else {
				System.out.println("x");

			}//if,else -> 입력한 값이 정답인지 여부 나타내기위해 삽입 
			 //			  +입력한 값이 정답이었을 때 반복 그만하고 나가기 위해서

		}//while의 끝

		System.out.println("총 시도한 횟수 : "+count);

	}
}

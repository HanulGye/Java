package com.hanul.ctrlForTest;

import java.util.Scanner;

public class For_5_ex4 {
	public static void main(String[] args) {
		//내가 입력한 숫자만큼 초를 세시오(출력하시오)
		//단 for문 ()안은 고정.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("0이상 ~ 60미만의 숫자를 입력하시오");
		int second = sc.nextInt();
		for(int i=0;i<60;i++) {
			if(second>=i) {System.out.println(i+"초");
			
			}else {i=60;}
		//for(int i=0;i<60;i++) {
		//	if(i==second) {i=60}
		//	} 선생님이 하신거임.
		}
		System.out.println("종료");
		//위와같이 짜도 for문은 계속 진행됨(0~59까지)
		//요구조건은 입력한 값에 따라 출력됨과 동시에 for문도 종료하고 싶음.
		//그럼 for문을 벗어나는 방법이 머지?
		//for문은 조건식이 f면 반복멈춤.
		//근데 조건식 부분은 건드리면 안됨.
		
		}
		
		
	}

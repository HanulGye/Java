package com.hanul.ctrlIfTest;

import java.util.Scanner;

public class Control_6_ex4 {
	public static void main(String[] args) {
		//sysout, sout (systemout 약어)
		//한줄 지우기 : 지우고싶은 라인에 커서 놓고 ctrl+d
		//코드 이동 : 옮기고 싶은 코드에 커서 놓고 alt+화살표 (블럭잡아서 여러 코드 이동 가능) 
		//정렬 : ctrl+i
		
		//이름 입력 , 월급 입력 , 정규직 1 비정규직 2 선택
		//정규직 실업 급여 1.2%, 의료보험 2%, 고용보험 1.5%, 산재보험  0.5%
		//비정규직 원천징수세 3.3%
		//출력값 : 이름 , 세전급여, 세후급여
		
		double s = 0.012; 
		double u = 0.02; 
		double g = 0.015; 
		double sj = 0.005;
		double w = 0.033;
		
		Scanner sc = new Scanner(System.in);
		String name = "";
		int month = 0;//세전월급
		int jungyu = 0;//정규 비정규 여부
		double sehoo = 0.0;//세후급여
		
		System.out.println("이름을 입력하세요.");
		name = sc.next();
		System.out.println("월급을 입력하세요.");
		month = sc.nextInt();
		System.out.println("정규직이면 1, 비정규직이면 2를 입력하세요.");
		jungyu = sc.nextInt();
		if(jungyu==1) {
			sehoo=month-month*s;
			sehoo=sehoo-month*u;
			sehoo=sehoo-month*g;
			sehoo=sehoo-month*sj;		
					
		}else {
			sehoo=month-month*w;
			
		}
		
		
		System.out.println("이름 : "+name);
		System.out.println("세전 급여 : "+month+"원");
		System.out.println("세후 급여 : "+sehoo+"원");
		
		
	}
}

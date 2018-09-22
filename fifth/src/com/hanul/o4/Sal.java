package com.hanul.o4;

import java.util.Scanner;

public class Sal {
	int s; //월급을 담을 멤버 변수
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월급을 입력하세요");
		s = sc.nextInt();
		System.out.println(s+"원");
	}
	
	//메서드명 ins1 -> 국민연금계산
	//월급의 1.2%가 국민연금이다. + 내야 될 보험료 출력
	
	public void ins1() {
		System.out.println("국민연금 : "+s*0.012+"원");
		
		
	}
	
	
	//메서드명 ins2 -> 의료보험계산
	//월급의 1.5%가 국민연금이고 내야될 보험금액 출력
	
	public void ins2() {
		System.out.println("의료보험 : "+s*0.015+"원");
		
	}
	
	//메서드명 ins 3 고용보험 , 월급 1%
	
	public void ins3() {
		
		System.out.println("고용보험 : "+s*0.01+"원");
		
	}
	
	
	//메서드명 ins 4 산재보험, 월급의 1.3%
	
	public void ins4() {
		
		System.out.println("산재보험 : "+s*0.013+"원");
		
	}
	
	
	
	
	
	public void info() {
		System.out.println("월급 지급 : "+s+"원");
		
		
	}
	
	
}

package com.hanul.ctrlIfTest;

import java.util.Scanner;

public class Control_6_ex4_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name = "";
		int month = 0;//세전월급
		int jungyu = 0;//정규 비정규 여부
		double sehoo = 0.0;//세후급여
		double tax = 0.0;//세금
		
		System.out.println("이름을 입력하세요.");
		name = sc.next();
		System.out.println("월급을 입력하세요.");
		month = sc.nextInt();
		System.out.println("정규직이면 1, 비정규직이면 2를 입력하세요.");
		jungyu = sc.nextInt();
		if(jungyu==1) {
			tax = month*0.022+month*0.011+month*0.035;
			
		}else {tax = month*0.033;}
		
		sehoo = month - tax;
		
		System.out.println("이름 : "+name);
		System.out.println("세전 급여 : "+month);
		System.out.println("세후 급여 : "+sehoo);
	}
	//tax계산의 차이점. if문 안에 일일이 계산할 수도 있고, 
	//따로 전체 세금에 해당하는 변수 선언해서 거기다 합산한 세금을 넣어 월급이랑 계산
	
}

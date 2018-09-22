package com.hanul.o_1;

import java.util.Scanner;

public class Member {

	String name;
	int age;
	double weight;
	double height;
	
	//생성자
	public Member(String name, int age, double weight, double height) {
		
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
		
	}	
	
	//input method 
	/*public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		name = sc.next();
		System.out.println("나이를 입력하세요.");
		age = sc.nextInt();
		System.out.println("몸무게를 입력하세요.");
		weight = sc.nextDouble();
		System.out.println("키를 입력하세요.");
		height = sc.nextDouble();
		
	}*/
	
	//check method
	public String check() {
		double c = (this.height-100)*0.95;
		
		String s = null; // if문의 결과값을 받을 string 타입인거임.
		if(c<this.weight) {
			s="비만";//비만
		}else if(c>this.weight) {
			s="저체중";//저체중
		}else {
			s="표준";//표준
		}
		
		return s;
	}
	
	
}


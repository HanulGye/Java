package com.hanul.o_test_final;

import java.util.Scanner;

public class View {

	//출력담당 
	//1. 입력한 학생 전체 출력
	public void view1(Student[] s) {
		
		for(int i=0;i<s.length;i++) {
			
		System.out.println("이름 : "+s[i].name);
		System.out.println("번호 : "+s[i].number);
		System.out.println("국어 : "+s[i].kor);
		System.out.println("영어 : "+s[i].eng);
		System.out.println("수학 : "+s[i].math);
		System.out.println("총점 : "+s[i].total);
		System.out.println("평균 : "+s[i].avg);
		}
		
	}
		
		
	
	
	
	
	//2. 지정한 학생 한명만 출력
	public void view2(Student[] s) {
		System.out.println("열람할 학생의 번호를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		if(s[ch-1].number==ch) {
		
		
		
		System.out.println("이름 : "+s[ch-1].name);
		System.out.println("번호 : "+s[ch-1].number);
		System.out.println("국어 : "+s[ch-1].kor);
		System.out.println("영어 : "+s[ch-1].eng);
		System.out.println("수학 : "+s[ch-1].math);
		System.out.println("총점 : "+s[ch-1].total);
		System.out.println("평균 : "+s[ch-1].avg);
		}
	}
	
	
	
	
}

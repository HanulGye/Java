package com.hanul.o9;

import java.util.Scanner;

public class View {
	
	//학생 한명 출력, 여러명 출력 기능 담당.
	public void view1(Student[] ss) {
		for(int i=0;i<ss.length;i++) {
		
		System.out.println("이름 : "+ss[i].name);
		System.out.println("번호 : "+ss[i].number);
		System.out.println("국어 : "+ss[i].kor);
		System.out.println("영어 : "+ss[i].eng);
		System.out.println("수학 : "+ss[i].math);
		System.out.println("총점 : "+ss[i].total);
		System.out.println("평균 : "+ss[i].avg);
		}
	}//학생 여러명 출력
	public void view2(Student[] s) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 번호 입력");
		int i = sc.nextInt();
		
		System.out.println("이름 : "+s[i].name);
		System.out.println("번호 : "+s[i].number);
		System.out.println("국어 : "+s[i].kor);
		System.out.println("영어 : "+s[i].eng);
		System.out.println("수학 : "+s[i].math);
		System.out.println("총점 : "+s[i].total);
		System.out.println("평균 : "+s[i].avg);
		
		
	}
	
	
	
	
}

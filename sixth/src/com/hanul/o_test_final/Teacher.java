package com.hanul.o_test_final;

import java.util.Scanner;

public class Teacher {

	//정보 입력, 정보 검색, 정보 수정의 역할을 담당
	
	//1 정보입력(학생의 수, 학생들의 정보)
	public Student[] input1() {
		System.out.println("학생의 수를 입력하시오.");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Student [] sts = new Student [num];
		//학생의 수 입력 끝
		
		for(int i=0;i<sts.length;i++) {
			Student s= new Student();//학생이란 객체도 반복해서 만들어야하니 안에 있어야 함.
			sts[i]=s;
			System.out.println(i+1+"번째 학생 번호를 입력하시오");
			s.number=sc.nextInt();
			System.out.println(i+1+"번째 학생 이름을 입력하시오");
			s.name=sc.next();
			System.out.println(i+1+"번째 학생의 국어점수를 입력하시오");
			s.kor=sc.nextInt();
			System.out.println(i+1+"번째 학생의 영어점수를 입력하시오");
			s.eng=sc.nextInt();
			System.out.println(i+1+"번째 학생의 수학점수를 입력하시오");
			s.math=sc.nextInt();
			s.total=s.kor+s.eng+s.math;
			s.avg=s.total/3.0;
		}//학생의 정보 입력 끝
		
		return sts;
		
	}//정보입력 끝
	
	//2 정보검색

		
	//정보 검색 끝
	
	//3 정보수정
	public Student fix(Student[] s) {
		System.out.println("열람할 학생의 번호를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		Student s1=null;
		int ch = sc.nextInt();
		if(s[ch-1].number==ch) {
		
		System.out.println("변경할 국어점수 입력");
		s[ch-1].kor = sc.nextInt();
		System.out.println("변경할 영어점수 입력");
		s[ch-1].eng = sc.nextInt();
		System.out.println("변경할 수학점수 입력");
		s[ch-1].math = sc.nextInt();
		
		s[ch-1].total = s[ch-1].kor+s[ch-1].eng+s[ch-1].math;
		s[ch-1].avg = s[ch-1].total/3.0;
		
		}
	
		return s1;
	}
	
		
		
	//정보 수정 끝
	
	
}

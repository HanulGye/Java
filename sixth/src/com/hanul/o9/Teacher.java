package com.hanul.o9;

import java.util.Scanner;

public class Teacher {
	//정보 입력, 학생번호 검색, 수정 하는 역할
	public Student [] input1() {
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		System.out.println("학생 수 입력");
		int num = sc.nextInt();
		Student [] ss = new Student[num];
		
		
		for(int i=0;i<ss.length;i++) {
			System.out.println(i+1+"번째 학생 번호 입력");
			s.number=sc.nextInt();
			System.out.println(i+1+"번째 학생 이름 입력");
			s.name=sc.next();
			System.out.println(i+1+"번째 학생의 국,영,수 성적");
			s.kor=sc.nextInt();
			s.eng=sc.nextInt();
			s.math=sc.nextInt();
			ss[i]=s;
			
			s.total=s.kor+s.eng+s.math;
			s.avg = s.total/3.0;
			
			
			
		}
		
		return ss;
	}//학생 정보입력 끝
	
	public void input2() {	
		
		System.out.println("학생 번호 입력");
		
		//int num2 = sc.nextInt();
	
		//if(sts.==num2) {
			
			//System.out.println("존재하지 않는 학생번호입니다.");}
		
		//return ss;
	}//학생 번호 검색 끝
	
	public void input3() {
		
	}//학생 정보 수정
	
	
}

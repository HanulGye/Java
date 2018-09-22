package com.hanul.o8;

import java.util.Scanner;

public class Teacher {
	
	public Student input2() {
		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("번호 입력");
		s.number = sc.nextInt();
		System.out.println("이름 입력");
		s.name = sc.next();
		System.out.println("국,영,수 차례대로");
		s.kor = sc.nextInt();
		s.eng = sc.nextInt();
		s.math = sc.nextInt();
		
		s.total = s.kor+s.eng+s.math;
		s.avg = s.total/3.0;
		
		return s;
		
	}
	
	public void input(Student s) {
		//학생정보 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("번호 입력");
		s.number = sc.nextInt();
		System.out.println("이름 입력");
		s.name = sc.next();
		System.out.println("국,영,수 차례대로");
		s.kor = sc.nextInt();
		s.eng = sc.nextInt();
		s.math = sc.nextInt();
		
		s.total = s.kor+s.eng+s.math;
		s.avg = s.total/3.0;
		
	}
	
}

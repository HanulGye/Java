package com.hanul.o1;

public class ObjectMain {

	
	public static void main(String[] args) {
		//학생의 성적 관리 프로그램이 필요하다.
		//학번 / 이름 / 과목명(국영수) / 총점 / 평균
		
		Student s1; //참조할 변수 선언
		s1 = new Student(); // 객체 생성
		s1.name = "김창식"; //참조변수.멤버변수명 = 인스턴스변수타입과 동일한 타입의 값
		s1.number = 2011;
		s1.kor = 80;
		s1.eng = 80;
		s1.math = 80;
		s1.total = s1.kor+s1.eng+s1.math;
		
		Student s2 = new Student(); //선언 동시에 객체 생성 가능.
		s2.name = "임춘식";
		s2.kor = 55;
		
		
		Student s3 = s2;
		
		System.out.println(s1.avg);
		//멤버변수는 초기화(값 주기)안해도 디폴트값이 있기에 출력은 가능.
		//instance변수는 초기화 안해도 출력은 가능(default)
		//지역변수는 개발자가 초기화 해줘야됨.
		
		Board b = new Board();
		b.number = 0001;
		
		Member m = new Member();
		
		
		
		
		
		
		
	}
}

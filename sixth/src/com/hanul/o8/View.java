package com.hanul.o8;

public class View {
	//정보 출력 전용 클래스
	public void view(Student s){
		System.out.println("번호 : "+s.number);
		System.out.println("이름 : "+s.name);
		System.out.println("총점 : "+s.total);
		System.out.println("평균 : "+s.avg);
	}
	
	
}

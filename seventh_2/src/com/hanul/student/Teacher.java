package com.hanul.student;

public class Teacher {

	private int age;
	private String subject;
	
	
	//생성자는 디폴트 생성자(자동으로 생성되는)로 설정.
	
	//아래는 private로 묶인 age,subject의 값을 변경해줄 전달자.
	//아래에 녀석은 입출력 역할 모두 수행
	//다시 말해, 매개변수로 입력을 시키고 리턴으로 출력시키는 역할을 수행한다.
	public int setAge(int age) {
		this.age=age;
		return age;
	}
	//근데 이렇게 따로 만들수도 있음.
	public void setSub(String sub) {
		this.subject=sub;	
	}
	public String getSub() {
		return this.subject;
		
	}
	
	
	//이런 전달자를 왜 만들까? -> 허용범위를 여기다가 설정하고 그 범위내 값만을 멤버변수에 넣기위해.
	
	public void info() {
		
		System.out.println("나이 : "+this.age);
		System.out.println("과목 : "+this.subject);
	}
	
}

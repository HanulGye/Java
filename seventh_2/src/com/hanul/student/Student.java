package com.hanul.student;

public class Student {

	public int num;
	public String name;
	
	public Student (){
		
	}//생성자! 얘도 메서드이기에, 접근지정자 선언 가능.
	
	public void info() {
		
		System.out.println(this.num);
		System.out.println(this.name);
	}
}

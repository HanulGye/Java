package com.hanul.student;

public class StMain {

	public static void main(String[]args) {
		
		Student st = new Student();
		st.num=10;
		st.name = "";
		st.info();
		
		
		Teacher t = new Teacher();
		// private로 만들어진 age, subject를 바꿔보자. 
		// 25, art
		// method를 이용해 옮겨주자.
		int age;
		String sub;
		
		age=t.setAge(25);
		t.setSub("art");
		sub=t.getSub();
		
		t.info();
		
		System.out.println("나이는? "+age);
		System.out.println("과목은? "+sub);
		
		
	}
	
}

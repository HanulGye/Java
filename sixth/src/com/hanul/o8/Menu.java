package com.hanul.o8;

public class Menu {

	public void start() {
		Student s1 = new Student();
		Teacher t1 = new Teacher();
		View v1= new View();
		//t1.input(s1);
		
		s1=t1.input2();
		
		v1.view(s1);
		
		
	}
		
		
	
}

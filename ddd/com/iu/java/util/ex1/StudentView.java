package com.iu.java.util.ex1;

import java.util.ArrayList;

public class StudentView {
	
	public void view(ArrayList<Student> ar) {
		for(int i=0;i<ar.size();i++) {
			Student student = ar.get(i);
			System.out.println("========================");
			System.out.println("Num  : "+student.getNum());
			System.out.println("Name : "+student.getName());
			System.out.println("Kor  : "+student.getKor());
			System.out.println("Eng  : "+student.getEng());
			System.out.println("Math : "+student.getMath());
			System.out.println("Total: "+student.getTotal());
			System.out.println("Avg  : "+student.getAvg());
			
		}
		
	}

}

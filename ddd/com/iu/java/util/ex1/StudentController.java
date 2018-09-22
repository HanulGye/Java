package com.iu.java.util.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
	
	public static void main(String[] args) {
		new StudentController().start();
	}
	
	public void start() {
		StudentData studentData = new StudentData();
		StudentView studentView = new StudentView();
		Scanner sc = new Scanner(System.in);
		boolean check=true;
		ArrayList<Student> ar=studentData.studentInit();
		int select=0;
		
		while(check) {
			System.out.println("1. 학생 전체 정보");
			System.out.println("2. 학생 정보 검색");
			System.out.println("3. 종          료");
			select = sc.nextInt();
			
			if(select==1) {
				studentView.view(ar);
			}else if(select==2) {
				
			}else {
				System.out.println("프로그램 종료");
				break;
			}
			
		}
		
		
	}

}

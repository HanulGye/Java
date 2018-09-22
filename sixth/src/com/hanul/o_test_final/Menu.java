package com.hanul.o_test_final;

import java.util.Scanner;

public class Menu {

	// 메뉴 구성
		//1. 성적입력
		//	1)학생수 입력
		// 	2)정보입력
		//2. 학생정보 검색
		//	1)학생번호 입력
		//	2)해당 학생의 모든 정보 출력(번호가 없는 학생인 경우 없다고도 출력돼야함)
		//3. 학생정보 전체 출력(view)
		//	
		//4. 학생 정보 수정
		//	1) 학생번호 입력
		// 	2) 번호를 제외한 국,영,수 입력
		//5. 종료
	
	public void start() {
		boolean check = true;
		Teacher t = new Teacher();
		View v = new View();
		Student [] sts = null;
		while(check) {
			
		
			System.out.println("1. 성적입력");
			System.out.println("2. 학생정보 검색");
			System.out.println("3. 학생정보 전체 출력");
			System.out.println("4. 학생정보 수정");
			System.out.println("5. 종료");
			Scanner sc = new Scanner(System.in);
			int ch = sc.nextInt();
			//첫 화면 및 번호입력하는 공간

			if(ch==1) {
				sts = t.input1();
			}else if(ch==2) {
				v.view2(sts);
			}else if(ch==3) {
				v.view1(sts);
			}else if(ch==4) {
				t.fix(sts);
			}else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		
		}
		
		//각 메뉴에 해당하는 숫자 입력시 해당구역으로 넘어감.
		
		
		
		
	}
	
	
	
}

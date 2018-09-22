package com.hanul.o9;

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
	Teacher t1 = new Teacher();
	View v1 = new View();
	
	Student [] ss;
	
	boolean check = true;
	
	public void start() {
		while(check) {
			System.out.println("1. 성적입력\n2. 학생정보 검색\n3. 학생정보 전체 출력\n4. 학생정보 수정\n5. 종료");
		
		Scanner sc = new Scanner(System.in);
		int select =0;
		select = sc.nextInt();
		if(select==1) {
			ss=t1.input1();//이 메서드가 실행된 이후 리턴된게 Student[]임.
			
		}else if(select==2) {
			v1.view2(ss);
			
		}else if(select==3) {
			v1.view1(ss);
			
		}else if(select==4) {
			
		}else {
			System.out.println("종료합니다.");
			break;
		}

	}
		
		
		
	}
	
}

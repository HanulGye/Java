package com.hanul.ctrlIfTest;

import java.util.Scanner;

public class Control_7_ex5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int id = 1234; //회원가입시 아이디
		int pw = 4321; //회원가입시 패스워드
		int iid;//입력할 아이디
		int ppw;//입력할 패스워드
		String message="";//정회원 비회원 메시지
		boolean check = false;
		
		System.out.println("아이디를 입력하세요");
		iid = sc.nextInt();
		System.out.println("비밀번호를 입력하세요");
		ppw = sc.nextInt();
		
		if(iid==id&&ppw==pw) {
			System.out.println("로그인 성공");
			message="정회원입니다."; 
			check=true;
			}else {System.out.println("로그인 실패");
			message="비회원입니다.";
			//check=false; 라고 넣을 필요 없음
			//왜냐면 디폴트값이 false였기 때문에.
			}
					
		
		System.out.println(message);
		
		//로그인 성공 했을 시에만, 주문시작 출력 
		
		if(check) 
		{System.out.println("주문시작");} 
		//else문 굳이 쓸 필요 없음. 실패했을 때 띄워야 할 메시지 없기에.
		
		
	}
}

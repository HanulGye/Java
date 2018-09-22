package com.hanul.ctrlForTest;

import java.util.Scanner;

public class For_6_ex5_1 {


	public static void main(String[] args) {

		int id = 1234; //정해진 id값
		int pw = 4321; //정해진 pw값
		boolean check = true;
		Scanner sc = new Scanner(System.in);

		for(int i=0;i<3;i++) {
			System.out.println("아이디를 입력하세요.");
			int iid = sc.nextInt();
			System.out.println("비밀번호를 입력하세요.");
			int ppw = sc.nextInt();
			if(iid!=id||ppw!=pw) {System.out.println("로그인 실패");}
			if(iid==id&&ppw==pw) {
				System.out.println("로그인 성공");
				break;
			}else if(i==2){
				
				System.out.println("은행 방문");
			}
			
		}
		System.out.println("종료");

	}


}

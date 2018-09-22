package com.iu.java.util.st;

import java.util.Scanner;

public class MemberControl {
	private Scanner sc;
	private MemberInit mi;
	private Member [] ar;
	private MemberService ms;
	
	public MemberControl() {
		sc = new Scanner(System.in);
		mi = new MemberInit();
		ar = mi.getMembers();
		ms = new MemberService();
	}
	
	public void start() {
		boolean check=true;
		
		while(check) {
			System.out.println("1. 로그인");
			System.out.println("2. 종  료");
			int select = sc.nextInt();
			
			if(select==1) {
				ms.login(sc, ar);
			}else {
				System.out.println("종료 합니다");
				break;
			}
			
		}
		
		
	}

}

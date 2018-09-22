package com.iu.java.util.st;

import java.util.Scanner;

public class MemberService {
	
	public void login(Scanner sc, Member [] members) {
		Member member = new Member();
		System.out.println("id 입력");
		//String id=sc.next();
		member.setId(sc.next());
		System.out.println("pw 입력");
		//String pw=sc.next();
		member.setPw(sc.next());
		System.out.println(member.getId().equals("id1"));
		System.out.println(member.getPw().equals("pw1"));
		 String result="로그인 실패";
		for(int i=0;i<members.length;i++) {
			if(member.getId().equals(members[i].getId())) {
				if(member.getPw().equals(members[i].getPw())) {
					//로그인 성공
					result ="로그인 성공";
					break;
				}
			}
		}
		
		System.out.println(result);
		
		
		
	}

}

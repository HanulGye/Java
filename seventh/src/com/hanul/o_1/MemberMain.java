package com.hanul.o_1;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		String result;
		
		MemberView mv = new MemberView();
		Member m = new Member("이", 25, 58, 166);
		
		result = m.check();
		mv.view(result);
		
		
		//멤버 수정하고시프다~ 하믄 이렇게.
		
		m.weight = 80;
		result = m.check();
		mv.view(result);
		
	}
}

package com.iu.java.lang;

import java.util.Scanner;

public class Wrapper_2 {

	public static void main(String[] args) {
		//회원가입시 비번 입력
		//대문자 2개이상,숫자 1개이상
		//공백허용안함
		//최소 6글자 이상
		Scanner sc = new Scanner(System.in);
		System.out.println("비번입력");
		String pw = sc.nextLine();
		boolean check=false;
		String result="비밀번호를 다시 입력";
		//char [] ch = pw.toCharArray();
		//count = ch.length;
		int count = pw.length();
		int upper=0;//대문자 갯수
		int digit=0;//숫자 갯수
		int white=0;//공백 갯수
		if(count>5) {
			for(int i=0;i<count;i++) {
				if(Character.isUpperCase(pw.charAt(i))) {
					//대문자
					upper++;
				}
				if(Character.isDigit(pw.charAt(i))) {
					//숫자
					digit++;
				}
				if(Character.isWhitespace(pw.charAt(i))) {
					//공백
					white++;
					break;
				}
			}//for 끝
			System.out.println("w"+white);
			
			if(white>0) {
				result="공백은 지원 되지 않습니다.";
			}else if(digit<1) {
				result="숫자는 1개 이상이어야 합니다";
			}else if(upper<2) {
				result="대문자는 2개 이상이어야 합니다";
			}else {
				result="사용가능한 비밀 번호 입니다.";
			}
			
			
		}else {
			result ="비밀번호는 6자 글자 이상";
		}
		
		
		
		System.out.println(result);
		

	}

}

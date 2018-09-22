package com.iu.java.lang;

import java.util.Scanner;

public class Wrapper_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민 번호 입력");
		String num = sc.next();
		
		char [] ch = num.toCharArray();
		int sum=0;
		int count=2;
		//981224-1234567
		for(int i=0;i<ch.length-1;i++) {
			if(ch[i]=='-') {
				continue;
			}
			if(count==10) {
				count=2;
			}
			int n=Character.digit(ch[i], 10)*count;
			sum=sum+n;
			count++;
		}
		
		int result = sum%11;
		result = 11-result;
		
		if(result>9) {
			result=result%10;
		}
		
		if(result==Character.digit(ch[ch.length-1], 10)) {
			System.out.println("제대로 된 주민번호");
		}else {
			System.out.println("주민센터에 문의");
		}
		
		
		//int n=Integer.parseInt(String.valueOf(ch[0]));
		
		
		

	}

}

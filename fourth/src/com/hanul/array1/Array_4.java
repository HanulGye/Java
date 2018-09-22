package com.hanul.array1;

import java.util.Scanner;

public class Array_4 {
	public static void main(String[] args) {
		//3과목의 점수를 입력 받아서 
		//총점을 출력하시오.
		
		int[] gamok = new int[3];
		int total =0;
		String[] name = {"국어", "영어", "수학"};
		
		
		Scanner sc =new Scanner(System.in);
		
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]+" 성적을 입력하시오");
			gamok[i] = sc.nextInt();
			
			
		}
		for(int i=0;i<gamok.length;i++) {
			
			System.out.println(gamok[i]);
			total = total + gamok[i];
			
		}
		
		//n개의 과목수 && 점수 입력 받아서 
		//총점을 출력
		int n=sc.nextInt();
		
		int [] points = new int[n];
		int total2=0;
		
		for(int i=0; i<points.length;i++) {
			System.out.println("점수를 입력하시오");
			points[i]=sc.nextInt();
			System.out.println(total2=total2+points[i]);
		}
		
		
		
		
	}
}

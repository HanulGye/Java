package com.hanul.o7;

import java.util.Scanner;

public class Dog {

	String color;
	int age;
	int size;

	public void sound(int c, int s, String color) {
		//size>=90 -> 대형견 컹컹
		//90>size>=60 -> 중형견 멍멍
		//size<60 -> 소형견 앙앙

		for(int i=0;i<c;i++) {
			if(size>=90) 
			{

				System.out.println("컹컹");
			}else if(size>=60) 
				//90>size&&size>=60라고 조건 줄 필요없음. 위에서 걸러지니까.
			{
				System.out.println("멍멍");
			}else {
				System.out.println("앙앙");
			}
			//수준을 나누려면 나누고자 하는 부분 블럭잡고 정렬하면 그부분만 수준이 낮아짐.
			//범위가 조건으로 주어진다면 switch보단 if가 나음
			//반대로 딱 떨어지는 정수가 조건이라면(eg.번호 선택) switch
		}

	}


}

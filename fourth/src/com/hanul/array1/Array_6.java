package com.hanul.array1;

public class Array_6 {
	public static void main(String[] args) {
		
		int [] n1 = {1,2,3};
		int [] n2 = {4,5,6};
		
		int [][] n3 = {n1,n2}; //배열들끼리도 묶을 수 있다.
		
		System.out.println(n3[0][1]);
		
		//위와 같은 배열을 2차원 배열이라고 한다!
		//실제, 요렇게 하진 않음
		
		
	}
}

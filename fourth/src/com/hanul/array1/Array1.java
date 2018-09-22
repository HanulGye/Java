package com.hanul.array1;

public class Array1 {
	
	public static void main(String[] args) {
		//메모리 영역에 저장되는 변수
		//static(method) / stack / heap 
		//stack -> main메서드가 들어감. 
		//heap -> new ~ 에 해당하는 , 레퍼런스타입 변수가 가리키는 어떤
		
		//배열!
		//같은 데이터 타입 여러 개를 하나의 변수로 묶기 위한 것.
		//배열 자체는 refernce type.
		// 데이터 타입 [] 배열명 = new 데이터타입[배열안에 들어갈 데이터 수] 
		//한번 선언된 배열의 크기는 수정이 불가능
		//배열a = new 배열a와 같은 타입배열 [배열안에 들어갈 데이터 수] 
		
			int n1 = 10;
			int n2 = 20;
			
			int[] numbers = new int[2];
			numbers[0] = 10;
			numbers[1] = 20;		
		System.out.println(numbers[0]);
		
		double[] doubles = new double[4];
		doubles[0] = 3.12;
		doubles[1] = 10;
		doubles[2] = 3.1;
		doubles[3] = 10.5;
		//첫번째 선언방식
		
		char chrs [] = new char[2];
		//두번째 선언방식 (좀 보기 헷갈림)
		
		int [] n = {1,2,3,4};
		//세번째 선언방식 - 배열로 묶을 값들을 알고 있을때, 선언과 동시에 초기화 가능.
		
		System.out.println(n[2]);
		
		
		
		
		
		
	}

}
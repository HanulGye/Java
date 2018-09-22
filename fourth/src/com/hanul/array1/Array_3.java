package com.hanul.array1;

public class Array_3 {

	public static void main(String[] args) {
		
		/*//정수 2개 모을 배열 선언
		int [] num = new int[2];
		num[0]=1;
		num[1]=2;
		
		for(int i=0;i<3;i++) {
			
			System.out.println(num[i]);
		}
		
		*이렇게 하면 바운드 오브 익셉션 오류 뜸.(어레이에 자리가 없기 때문에)
		*
		*/ 
		int [] num = new int[2];
		num[0]=1;
		num[1]=2;
		
		System.out.println(num.length);
		//num.length => 배열의 총 칸수(전체 길이)
		for(int i=0;i<num.length;i++) {
			
			System.out.println(num[i]);
		}
		
		
		
		
	}
}

package com.hanul.ctrlForTest;

public class For_4_ex3 {
	
	public static void main(String[] args) {
	
		//0이상~10미만 사이의 값 중 
		//짝수만 출력
		//2로 나눴을 때 나머지가0인 경우
		for(int i=0;i<10;i++) {
			if((i%2)==0) {
				System.out.println(i);
				}
		}
		System.out.println("==========");
		//위와 같은 조건 + if문 쓰지 않고.
		for(int i=0;i<10;i=i+2) {//i+=1+1
			System.out.println(i);
		}
		//마지막 증감식 부분은 꼭 증감연산자만 쓰는게 아니라는 것을 보여주기 위한 예제.
	}
}

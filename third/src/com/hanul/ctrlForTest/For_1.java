package com.hanul.ctrlForTest;

public class For_1 {

	public static void main(String[] args) {
		//for문은 반복문, 반복할 횟수가 정해져있을때 사용
		//for(1.초기식;2.조건식;4.증감식){3.조건식이 참일 때 실행되는 구문} 형식임
		//조건식이 true면 3까지 실행하고 4한뒤 2를 다시 실행.
		//조건식이 false이면 for문을 나옴.
		
		for(int i =0; i<5;i++) {
			System.out.println("끝");
		}
		//위의 식은 총 다섯번의 {}의 값을 실행하고싶다는 것.
	
		//for(int i=0; i>=0;i++){} 이런식이면 무한반복걸림
		//for문 역시 내부에 선언된 변수는 지역변수여서 밖에 나가서 출력하려하면 인식못함.
		
	}

}

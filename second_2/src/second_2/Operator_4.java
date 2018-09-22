package second_2;

import java.util.Scanner;

public class Operator_4 {
	public static void main(String[] args) {
	
		//조건연산자(삼항연산자)
		//조건식의 형식은. [조건식?A:B]
		//조건식이란, 결과값이 boolean타입으로 나오는 것을 의미.
		//cf정수식이란 결과값이 정수형태로 떨어지는 것.
		//조건식보단 조건문을 더 많이 씀.(if문)
		
		int age=20;
		
		String message="";
		

		message=age>19?"성년":"미성년";
		
		System.out.println(message);
		
		
		
		
	}
}

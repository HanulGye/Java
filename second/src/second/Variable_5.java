package second;

import java.util.Scanner;

public class Variable_5 {
	public static void main(String[]args) {
		//산술연산자+,-,*,/(몫),%(나머지)
		//산술연산자를 활용한 형변환
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("소숫점 4번째자리까지 입력하시오.");
		double d1 = sc.nextDouble();
		d1 = d1*100;
		int n1 = (int)d1;
		d1 = (double)n1/100;
		System.out.println(d1);
		//소수점 두번째자리까지만 살리는 방법 (소수점 이동)
		
		// 또다른 방법
		// d1 = n1*0.01
		// 위의 식에서 n1은 0.01과 연산하기에 자동형변환이 일어남.
		
		
		
	}
}

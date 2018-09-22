package second_2;

import java.util.Scanner;

public class Operator_1_ex1 {
	public static void main(String[] args) {
	
		//산술연산자를 이용하여(+, -, /, %)
		//편의점 자동 계산 프로그램을 만들어보시오!
		//알고리즘	1.물건 값 임의 값으로 설정
		//			2. 손님이 낸 돈
		//			3. 거스름 돈 계산	
		//			4. 거스름 돈 지불 (화폐 단위별)
		//			5. 최종 출력되는 값은 거스름 돈 화폐 단위별 갯수.
		
		Scanner sc = new Scanner(System.in);
		int price = 0; //물건 값
		int sonnom = 0; //손님이 낸 돈
		int charge = 0; //거스름 돈
		int m = 0; //만원갯수
		int c = 0; //천원갯수
		int b = 0; //백원갯수
		int s = 0; //십원갯수
		
		System.out.println("물건의 합계를 입력하시오.");
		price = sc.nextInt();
		System.out.println("지불할 금액을 입력하시오.");
		sonnom = sc.nextInt();
		
		charge = sonnom-price;
		System.out.println("거스름 돈 : "+charge+"원");
		
		m = charge /10000;
		c = charge / 1000-(m*10);
		b = charge / 100 -((m*100) + (c*10));
		s = charge / 10-((m*1000)+(c*100)+(b*10));
		
		//두번째 방법
		//c=(charge%10000)/1000;
		//b=(charge%1000)/100;
		//요런식으로 나머지를 먼저 구한뒤 그걸 구하고싶은 화폐단위로 나눈다.
		
		
		System.out.println("거스름 돈 지폐갯수");
		System.out.println("만원 권 : "+m);
		System.out.println("천원 권 : "+c);
		System.out.println("백원 권 : "+b);
		System.out.println("십원 권 : "+s);
		
	}
}

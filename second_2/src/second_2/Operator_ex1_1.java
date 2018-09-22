package second_2;

import java.util.Scanner;

public class Operator_ex1_1 {
	public static void main(String[] args) {
	
		//operator1_ex1과 같이 계산프로그램 만들어보자
		//알고리즘	1.물건 값 임의 값으로 설정
		//			2. 손님이 낸 돈
		//			3. 거스름 돈 계산	
		//			4. 거스름 돈 지불 (화폐 단위별)
		//			5. 최종 출력되는 값은 거스름 돈 화폐 단위별 갯수.
		
		int price = 0;
		int client = 0;
		int change = 0;
		int m = 0;
		int c = 0;
		int b = 0;
		int s = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("물건 값을 입력하세요.");
		price = sc.nextInt();
		
		System.out.println("지불 금액을 입력하세요.");
		client = sc.nextInt();
		change = client - price;
		
		System.out.println("거스름 돈 : "+change+"원");
		System.out.println("거스름 돈의 화폐 갯수");
		m = change/10000;
		System.out.println("만원 권 : "+m);
		c = (change%10000)/1000;
		System.out.println("천원 권 : "+c);
		b = (change%1000)/100;
		System.out.println("백원 권 : "+b);
		s = (change%100)/10;
		System.out.println("십원 권 : "+s);
		
	}
}

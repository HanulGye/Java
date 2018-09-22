package second_2;

import java.util.Scanner;

public class Operator_1_ex2 {
	
	public static void main(String[] args) {
	//키보드에서	'1'입력 -> '1' 출력	
	//			'2'입력 -> '2' 출력	
	//			'6'입력 -> '12' 출력	
	
	// 1-> 1 2->2 3->3 4->10 5->11 6->12 7->13 8->20
	// 0123,10111213,20212223,30313233,0123 
	
	Scanner	sc = new Scanner(System.in);
	System.out.println("값을입력하시오.");
	
	int left = 0; //입력받을 숫자
	left = sc.nextInt();
	int right; 	//출력할 결과 수
	right = left+(left/4)*6;
	
	
	// right = left/4*10+left%4 요런 방식도 있다. 
	

	System.out.println(right);
	}
	
}

package second;

import java.util.Scanner;

public class Variable_2 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		//매서드, 변수타입 등 작성할 때 Ctrl+Space bar 입력하면 자동완성기능이 있다
		
		String name ="";
		int age =0;
		double height =0.0;
		double weight =0.0;
		
		System.out.println("이름을 입력하세요");
		name = sc.next();
		System.out.println("나이를 입력하세요");
		age = sc.nextInt();
		System.out.println("키를 입력하세요");
		height = sc.nextDouble();
		System.out.println("몸무게를 입력하세요");
		weight = sc.nextDouble();
		
	
		
	}
}

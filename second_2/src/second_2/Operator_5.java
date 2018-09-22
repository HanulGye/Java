package second_2;

import java.util.Scanner;

public class Operator_5 {
	public static void main(String[] args) {
		//나이를 입력받아서
		//10대인지 아닌지를 판별
		
		int age = 0;
		String message = "";
		System.out.println("나이를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		
		message= age>=10&&age<20?"10대":"10대가아님";
		
		
		System.out.println("나이대 판명 : "+message);
		
	}
}

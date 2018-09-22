package com.hanul.o7;

import java.util.Scanner;

public class ObjectMain {
	
	public static void main (String[]args) {
		Scanner sc =new Scanner(System.in);
		
		Dog d = new Dog();
		System.out.println("나이, 색상, 크기를 입력하시오.");
		d.age = sc.nextInt();		
		d.color = sc.next();
		d.size = sc.nextInt();		
		
		System.out.println("짖을 횟수 입력");
		int count = sc.nextInt(); 
		d.sound(count, d.size, d.color); //여기의 ()값은 인자값이라 함. 
										//메서드 호출부에선 매개변수 선언이 안됨.
										//d.sound(int num); 이딴거 안됨.
			
	}
}

package com.hanul.o5;

public class ObjectMain {

	public static void main (String [] args) {
		Test t = new Test();
		t.plus(10, 20);
		System.out.println(t.plus(10, 40));
		
		double j = t.plus(10, 20);
		System.out.println(j);
		//입력 값이 표현영역이 더 좁은 형태(eg.int)이고, 출력값이 표현영역이 더 넓은 형태(eg.double)
		//라고 하면 자동형변환이 되서 출력이 가능하다.
		//하지만 기본적으로 메서드는 입력값과 출력값의 타입이 같아야함.
			
	}
}

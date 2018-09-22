package com.hanul.control;

import com.hanul.student.Student;

public class Controller {

	public static void main (String[]args) {
		
		Student st = new Student();
		//st.num=10;
		//이건 오류뜸. 왜냐면 접근지정자 때문.
		//클래스에 정의된 객체들의 멤버변수 앞에도 접근지정자를 설정해주면 해결 가능
		//eg. public int num;
		//만일 멤버변수 선언부에 아무 접근지정자도 없다면 default임.
		st.info();
	}
}

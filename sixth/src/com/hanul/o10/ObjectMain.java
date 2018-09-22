package com.hanul.o10;

public class ObjectMain {

	public static void main (String[]args) {
		
		DataInput d = new DataInput();
		View v = new View();
		
		Product[] pro = d.input();//product[] 객체 주소값이 리턴되어 온거임.
		
		v.view2(pro);
		
	}
}

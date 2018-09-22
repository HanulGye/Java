package com.hanul.ctrlIfTest;

public class Control_8_if {

	public static void main(String[] args) {
		//다중 선택(이중선택은 if else문이었죠)
		//다중선택의 기본형태 : if(){}else if(){}else if(){}else {} 
		
		int select =4;
		
		if(select==1) {
			System.out.println("1번 선택");
		}else if(select==2) {
			System.out.println("2번 선택");
		}else if(select==3) {
			System.out.println("3번 선택");
		}else {
			System.out.println("4번 선택");
		}
		
		
	}
}

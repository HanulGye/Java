package com.hanul.ctrlForTest;

public class For_9 {
	public static void main(String[] args) {
		
		//***** 이걸 5줄 찍기.
		
		for(int j=0;j<5;j++) 
		{for(int i=0;i<5;i++) {
			System.out.print("*");
		}
		System.out.println();
		}
		
		//*
		//**
		//***
		//****
		//*****
		
		for(int i=1;i<6;i++){
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
				System.out.println();
		}
		
		for(int i=0;i<5;i++){
			for(int j=0;j<i+1;j++){
				System.out.print("*");
			}
				System.out.println();
		}
		
		//*****
		//****
		//***
		//**
		//*
		
		
		for(int i=0;i<5;i++){
			for(int j=0;j<5-i;j++){
				System.out.print("*");
			}
				System.out.println();
				
		}
		
		
		
		
		
		
		
		
		
		//위의 직삼각형 모양 말고도 정삼각형 역삼각형 등등 다양한 예제가 있음
		
	}
}

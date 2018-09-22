package com.hanul.ctrlForTest;

import java.util.Scanner;

public class For_10_ex {

	public static void main(String[] args) {
		//Fps
		//1탄창 30발
		//3탄창 
		//mode 	단발(1) 탕
		//		 점사(3) 타타탕
		int dan = 1;
		int semi = 2;


		Scanner sc =new Scanner(System.in);

		for(int tC=0;tC<3;tC++)
		{
			System.out.println("사격 방식을 선택하시오 \n1.단발 2.반자동");
			int type = sc.nextInt();
			int mode = 0;
			String sound;
			
			if(type==dan) { 
				mode=1;
				sound="탕";
			}else {
				mode=3;
				sound="타타탕";
			}//사격방식에 따른 사격음 선택
			
			for(int b=0;b<30;b=b+mode) {
				
				System.out.println(sound);
				
				
			}//사격음에따른 사격횟수 반복.
			
			
			
			
			/*if(type==dan) {
				for(int i=0;i<30;i++) {
					System.out.println("탕");}
			}else {
				for(int i=0;i<10;i++) {
					System.out.println("타타탕");
				}
			}*/
			System.out.println("탄창갈기");
		}
		
		
		System.out.println("사격종료");
		
		
		
		
		
	}
}

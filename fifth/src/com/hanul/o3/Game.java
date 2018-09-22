package com.hanul.o3;

import java.util.Scanner;

public class Game {

	//메서드 명 play
	//내용 지난 번에 했던 rpg게임 만들기.
	public void play() {
		
		Scanner sc = new Scanner(System.in);
		
		int level=0;//렙
		int gold=0;//돈
		for(level=1;level<15;level++) {
			if(level%5==0) {
				gold = gold+ level/5*1000;
				System.out.println(level/5*1000+" gold 지급");
			}
			
			
			System.out.println("1.사냥 | 2.종료");
			int select = sc.nextInt();
			if(select==1) {
				for(int m=1;m<=3*level;m++) {
					System.out.println("몬스터 "+m+" 마리 사냥");
				}
			}else {
				break;
			}

			System.out.println("level up!");
		}//레벨업 라인
		
		System.out.println("현재 레벨 : "+level);
		System.out.println("현재 골드 : "+gold);

		
		
	}
	
}

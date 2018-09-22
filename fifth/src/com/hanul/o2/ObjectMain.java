package com.hanul.o2;

import java.util.Scanner;

public class ObjectMain {
	public static void main(String[] args) {
		Charactor c1 = new Charactor();
		
		c1.name = "김창식";
		c1.job = "전사";
		c1.level = 1;
		c1.race = "인간";
		c1.sex = "남자";
		c1.hp = 100;
		c1.mp = 10;
		
		
		
		Sword s1 = new Sword();
		s1.name = "롱소드";
		s1.atk = 10;
		s1.level = 1;
		
		c1.sword = s1;
		
		System.out.println("무기 명 : "+c1.sword.name);
		System.out.println("파괴력 : "+c1.sword.atk);
		System.out.println("무기 레벨 : "+c1.sword.level);
		
		Scanner sc = new Scanner(System.in);
		
		Monster [] mobs = new Monster[3];
		Monster m=null;
		for(int i=0;i<3;i++) {
		m = new Monster();
		
		
		System.out.println("몬스터 이름 입력");
		m.name = sc.next();
		
		System.out.println("hp 입력");
		m.hp = sc.nextInt();
		
		
		mobs[i]= m;
		//객체 데이터가 실제 저장돼 있는 곳은 heap
		//그러나 그 데이터를 가리키는 주소값은 stack에 있다가 heap에 있다가 왔다갔다함!!
		//그걸 잘 따라가야됨.
		
		}
		
		for(int i=0;i<mobs.length;i++) {
			System.out.println("이름 : "+mobs[i].name);
			System.out.println("HP : "+mobs[i].hp);
		}
		
		mobs[0].hp=mobs[0].hp-c1.sword.atk;
		
		System.out.println(mobs[0].hp);

		
		
	}
}

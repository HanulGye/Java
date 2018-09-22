package com.hanul.terran;

public class TerranMain {

	public static void main(String[] args) {
		
		Marine m = new Marine();
		
		m.setHp(100);
		m.setColor("black");
		m.setDamage(35);
		m.setDefence(30);
		m.setGun("기관단총");
		
		m.info();
	
		
		//다형성 파트!
		
		Marine m2 = new Marine();
		Medic c = new Medic();
		
		PublicUnit [] u = new PublicUnit [2];
		u[0]=m2;
		u[1]=c;
		
		Marine rm=(Marine)u[0];
		Medic rc=(Medic)u[1];
		
		//다형성의 활용예시
		//드랍십이란 배열에 서로 다른 클래스(마린,메딕)를 담으려면 부모클래스 배열을 만들어서
		//담을때는 형변환이 이뤄지고 그래서 가능.
		
		
		
		
		
		
	}
	
}

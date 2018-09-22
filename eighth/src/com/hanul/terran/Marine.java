package com.hanul.terran;

public class Marine extends PublicUnit {

	
	private int damage;
	private String gun;
	
	
	/*public Marine() {
	
		super();
		이 super();는 marine 클래스의 부모클래스인 PulbicUnit클래스의 
		생성자역할을 하게된다. 

	}*/
	
	


	public int getDamage() {
		return damage;
	}


	public void setDamage(int damage) {
		this.damage = damage;
	}


	public String getGun() {
		return gun;
	}


	public void setGun(String gun) {
		this.gun = gun;
	}
	
	public void info() {
		//super.info();
		System.out.println("dm :"+this.damage);
		System.out.println("weapon :"+this.gun);
		
	}
	
	public void move() {
		
	}
	
	
}

package com.hanul.terran;

public abstract class PublicUnit {
	private int hp;
	private int defence;
	private String color;
	//모든 유닛에 공통적으로 들어가는 멤버변수들
	
	
	
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getDefence() {
		return defence;
	}
	public void setDefence(int defence) {
		this.defence = defence;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public abstract void move();
	
	
	
	public void info() { 
		//System.out.println("hp "+this.hp);
		//System.out.println("df "+this.defence);
		//System.out.println("color "+this.color);
	}
	
	
	
	
	
	
}

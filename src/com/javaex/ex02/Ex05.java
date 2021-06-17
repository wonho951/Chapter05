package com.javaex.ex02;

public class Ex05 {

	//필드
	private String name;
	private int hp;
	private int company;
	
	
	//생성자
	public Ex05() {
		super();
	}
	public Ex05(String name, int hp, int company) {
		super();
		this.name = name;
		this.hp = hp;
		this.company = company;
	}
	
	//게세터
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getCompany() {
		return company;
	}
	public void setCompany(int company) {
		this.company = company;
	}

	
	
	//메소드-일반
	
	@Override
	public String toString() {
		return "Ex05 [name=" + name + ", hp=" + hp + ", company=" + company + "]";
	}
	
	
	
	
}

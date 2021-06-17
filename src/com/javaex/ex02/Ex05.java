package com.javaex.ex02;

public class Ex05 {

	//필드
	private String name;
	private String hp;
	private String company;
	
	//생성자
	public Ex05() {
		super();
	}
	public Ex05(String name, String hp, String company) {
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
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	//메소드-일반
	@Override
	public String toString() {
		return "Ex05 [name=" + name + ", hp=" + hp + ", company=" + company + "]";
	}

	
	
	
	
}

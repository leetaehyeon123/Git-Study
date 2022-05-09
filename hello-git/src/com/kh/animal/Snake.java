package com.kh.animal;

public class Snake {
	private double length; // master에서 추가
	private String name;; // master에서 추가
	private double weight; // animal에서 추가
	
	public void move() {
		System.out.println("스르르르륵~");
	}
	
	public void poisonAttack() {
		System.out.println("독침 공격 !");
	}
}

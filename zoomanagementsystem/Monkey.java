package com.oops.dayfour.zoomanagementsystem;

public class Monkey implements Animal {
	private String name;
	private int health;

	public Monkey(String name) {
		this.name = name;
		this.health = 90;
	}

	public void eat() {
		health += 8;
		System.out.println(name + " the Monkey is eating. Health: " + health);
	}

	public void sleep() {
		health += 4;
		System.out.println(name + " the Monkey is sleeping. Health: " + health);
	}

	public void makeSound() {
		System.out.println(name + " the Monkey screeches!");
	} 

}

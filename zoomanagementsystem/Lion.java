package com.oops.dayfour.zoomanagementsystem;

public class Lion implements Animal {
	private String name;
	private int health;

	public Lion(String name) {
		this.name = name;
		this.health = 100;
	}

	public void eat() {
		health += 10;
		System.out.println(name + " the Lion is eating. Health: " + health);
	}

	public void sleep() {
		health += 5;
		System.out.println(name + " the Lion is sleeping. Health: " + health);
	}

	public void makeSound() {
		System.out.println(name + " the Lion roars!");
	}

}

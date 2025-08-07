package com.oops.dayfour.zoomanagementsystem;

public class Elephant implements Animal {
	private String name;
	private int health;

	public Elephant(String name) {
		this.name = name;
		this.health = 120;
	}

	public void eat() {
		health += 15;
		System.out.println(name + " the Elephant is eating. Health: " + health);
	}

	public void sleep() {
		health += 10;
		System.out.println(name + " the Elephant is sleeping. Health: " + health);
	}

	public void makeSound() {
		System.out.println(name + " the Elephant trumpets!");
	}


}

package com.oops.dayfour.zoomanagementsystem;

public class ZooManager {
	public static void main(String[] args) {
		Animal[] zoo = new Animal[3];
		zoo[0] = new Lion("Leo");
		zoo[1] = new Elephant("Gaja");
		zoo[2] = new Monkey("Tito");

		for (Animal animal : zoo) {
			animal.eat();
			animal.sleep();
			animal.makeSound();
			System.out.println();
		}
	}
}


package com.oops.dayfour.restaurantmenue;

import java.util.Scanner;

public class RestaurantMenu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FoodItem item = null;

		while (true) {
			System.out.println("---- Restaurant Menu ----");
			System.out.println("1. Pizza");
			System.out.println("2. Burger");
			System.out.println("3. Pasta");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				item = new Pizza();
				break;
			case 2:
				item = new Burger();
				break;
			case 3:
				item = new Pasta();
				break;
			case 4:
				System.out.println("Thank you for visiting!");
				scanner.close();
				return;
			default:
				System.out.println("Invalid choice!");
				continue;
			}

			item.prepare();
			item.showDetails();
		}
	}
}

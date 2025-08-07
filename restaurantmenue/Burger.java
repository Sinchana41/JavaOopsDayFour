package com.oops.dayfour.restaurantmenue;

class Burger implements FoodItem {
	private double price;
	private int cookingTime;
	private String[] ingredients;

	public Burger() {
		this.price = 150.0;
		this.cookingTime = 10;
		this.ingredients = new String[] {"Bun", "Patty", "Cheese"};
	}

	@Override
	public void prepare() {
		System.out.println("Preparing Burger...");
	}

	@Override
	public void showDetails() {
		System.out.println("Item: Burger");
		System.out.println("Price: ₹" + price);
		System.out.println("Cooking Time: " + cookingTime + " minutes");
		System.out.print("Ingredients: ");
		for (String i : ingredients) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
	}
}


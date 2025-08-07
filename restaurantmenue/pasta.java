package com.oops.dayfour.restaurantmenue;

class Pasta implements FoodItem {
	private double price;
	private int cookingTime;
	private String[] ingredients;

	public Pasta() {
		this.price = 180.0;
		this.cookingTime = 12;
		this.ingredients = new String[] {"Pasta", "Cream", "Vegetables", "Cheese"};
	}

	@Override
	public void prepare() {
		System.out.println("Preparing Pasta...");
	}

	@Override
	public void showDetails() {
		System.out.println("Item: Pasta");
		System.out.println("Price: ₹" + price);
		System.out.println("Cooking Time: " + cookingTime + " minutes");
		System.out.print("Ingredients: ");
		for (String i : ingredients) {
			System.out.print(i + " ");
		}
		System.out.println("\n ");
	}
}


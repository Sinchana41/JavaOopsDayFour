package com.oops.dayfour.restaurantmenue;

class Pizza implements FoodItem {
	private double price;
	private int cookingTime;
	private String[] ingredients;

	public Pizza() {
		this.price = 250.0;
		this.cookingTime = 15;
		this.ingredients = new String[] {"Cheese", "Tomato", "Flour", "Olives"};
	}

	@Override
	public void prepare() {
		System.out.println("Preparing Pizza...");
	}

	@Override
	public void showDetails() {
		System.out.println("Item: Pizza");
		System.out.println("Price: ₹" + price);
		System.out.println("Cooking Time: " + cookingTime + " minutes");
		System.out.print("Ingredients: ");
		for (String i : ingredients) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
	}
}

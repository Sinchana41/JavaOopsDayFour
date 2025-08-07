package com.oops.dayfour.librarymanagementsyastem;

public class NonFiction extends BaseBook {

	public NonFiction(String title, String author) {
		super(title, author);
	}

	@Override
	public void categoryInfo() {
		System.out.println("Category: Non Fiction - Real facts and information.");
	}

}

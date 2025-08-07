package com.oops.dayfour.librarymanagementsyastem;

public class Fiction extends BaseBook{

	public Fiction(String title, String author) {
        super(title, author);
    }

	@Override
    public void categoryInfo() {
        System.out.println("Category: Fiction - Imaginary stories.");
    }
}

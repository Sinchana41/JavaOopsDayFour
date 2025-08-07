package com.oops.dayfour.librarymanagementsyastem;

public class Magzine extends BaseBook{

	public Magzine(String title, String author) {
        super(title, author);
    }

	@Override
    public void categoryInfo() {
        System.out.println("Category: magzine - weeklt/monthly/yearly publications");
    }
}

package com.oops.dayfour.librarymanagementsyastem;

public abstract class BaseBook implements Book{

	private String title;
	private String author;
	private boolean isIssued;

	public BaseBook(String title, String author) {
		this.title = title;
		this.author = author;
		this.isIssued = false;
	}

	@Override
	public void issueBook() {
		if (!isIssued) {
			isIssued = true;
			System.out.println(title + " issued successfully.");
		} else {
			System.out.println(title + " is already issued.");
		}
	}

	@Override
	public void returnBook() {
		if (isIssued) {
			isIssued = false;
			System.out.println(title + " returned successfully.");
		} else {
			System.out.println(title + " is not issued yet.");
		}
	}
	
    @Override
	public void printDetails() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Issued: " + (isIssued ? "Yes" : "No"));
	}
}

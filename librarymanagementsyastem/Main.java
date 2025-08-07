package com.oops.dayfour.librarymanagementsyastem;

public class Main {

	public static void main(String[] args) {

		Book book1 = new Fiction("The Alchemist", "Paulo Coelho");
		Book book2 = new NonFiction("Wings of Fire", "A.P.J. Abdul Kalam");
		Book book3 = new Magzine("Forbes India", "Forbes Team");


		book1.printDetails();
		book1.categoryInfo();
		book1.issueBook();
		System.out.println();

		book2.printDetails();
		book2.categoryInfo();
		book2.issueBook();
		book2.returnBook();
		System.out.println();

		book3.printDetails();
		book3.categoryInfo();
		book3.issueBook();
		System.out.println();


		book1.printDetails();
		book2.printDetails();
		book3.printDetails();
	}
}

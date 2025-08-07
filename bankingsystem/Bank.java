package com.oops.dayfour.bankingsystem;

public class Bank {
	private Customer[] customers = new Customer[5];
	private int count = 0;

	public void addCustomer(Customer c) {
		if (count < customers.length) {
			customers[count++] = c;
			System.out.println("Customer added: " + c.getName());
		} else {
			System.out.println("Cannot add more customers.");
		}
	}

	public void showAllCustomers() {
		for (int i = 0; i < count; i++) {
			Customer c = customers[i];
			System.out.println("Customer: " + c.getName() +
					", Acc: " + c.getAccount().getAccountNumber() +
					", Balance: ₹" + c.getAccount().getBalance());
		}
	}

	public void applyInterestToAll() {
		for (int i = 0; i < count; i++) {
			Customer c = customers[i];
			double interest = c.getAccount().calculateInterest();
			System.out.println("Interest for " + c.getName() + ": ₹" + interest);
		}
	}
}

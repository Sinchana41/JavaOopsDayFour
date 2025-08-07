package com.oops.dayfour.bankingsystem;

public class CurrentAccount implements Account {
	private double balance;
	private String accountNumber;
	private static final double OVERDRAFT_LIMIT = 1000;

	public CurrentAccount(String accNo, double balance) {
		this.accountNumber = accNo;
		this.balance = balance;
	}

	@Override
	public void withDraw(double amount) {
		if (amount <= balance + OVERDRAFT_LIMIT) {
			balance -= amount;
			System.out.println("Withdrawn from Current: ₹" + amount);
		} else {
			System.out.println("Overdraft limit exceeded.");
		}
	}

	@Override
	public double calculateInterest() {
		return 0;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public String getAccountNumber() {
		return accountNumber;
	}
}

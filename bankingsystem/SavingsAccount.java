package com.oops.dayfour.bankingsystem;

public class SavingsAccount implements Account {
	private double balance;
	private String accountNumber;
	private static final double INTEREST_RATE = 0.04;

	public SavingsAccount(String accNo, double balance) {
		this.accountNumber = accNo;
		this.balance = balance;
	}

	@Override
	public void withDraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawn from Savings: ₹" + amount);
		} else {
			System.out.println("Insufficient funds in Savings Account.");
		}
	}

	@Override
	public double calculateInterest() {
		return balance * INTEREST_RATE;
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

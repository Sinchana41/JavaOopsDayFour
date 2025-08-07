package com.oops.dayfour.bankingsystem;

public class FixedDeposit implements Account {
	private double balance;
	private String accountNumber;
	private static final double INTEREST_RATE = 0.07;

	public FixedDeposit(String accNo, double balance) {
		this.accountNumber = accNo;
		this.balance = balance;
	}

	@Override
	public void withDraw(double amount) {
		System.out.println("Withdrawals not allowed before maturity in FD.");
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

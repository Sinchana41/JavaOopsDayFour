package com.oops.dayfour.bankingsystem;

public interface Account {

	void withDraw(double amount);
	double calculateInterest();
	double getBalance();
	String getAccountNumber();
}

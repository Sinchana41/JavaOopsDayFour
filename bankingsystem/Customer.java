package com.oops.dayfour.bankingsystem;

public class Customer {
	private String name;
	private String customerId;
	private Account account;

	public Customer(String name, String customerId, Account account) {
		this.name = name;
		this.customerId = customerId;
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public Account getAccount() {
		return account;
	}

	public String getCustomerId() {
		return customerId;
	}
}

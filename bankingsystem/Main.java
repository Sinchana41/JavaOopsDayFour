package com.oops.dayfour.bankingsystem;

public class Main {
	public static void main(String[] args) {
		Bank bank = new Bank();

		Customer customer1 = new Customer("Ravi", "C001", new SavingsAccount("S101", 4000));
		Customer customer2 = new Customer("Meena", "C002", new CurrentAccount("C202", 2000));
		Customer customer3 = new Customer("Ajay", "C003", new FixedDeposit("F303", 10000));

		
		bank.addCustomer(customer1);
		bank.addCustomer(customer2);
		bank.addCustomer(customer3);

		System.out.println("\n--- Withdrawals ---");
		customer1.getAccount().withDraw(500);
		customer2.getAccount().withDraw(2500);
		customer3.getAccount().withDraw(1000);

		System.out.println("\n--- Customer Details ---");
		bank.showAllCustomers();

		System.out.println("\n--- Interest Calculations ---");
		bank.applyInterestToAll();
	}
}

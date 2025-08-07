package com.oops.dayfour.tollmanagementsystem;

public class Car implements Vehicle {

	private String plateNumber;
	private double hoursStayed;
	private static double tollAmount=200.0;

	public Car(String plateNumber,double hoursStayed) {
		this.plateNumber = plateNumber;
		this.hoursStayed = hoursStayed;
	}

	public String getPlateNumber() {
		return this.plateNumber;
	}

	@Override
	public double getTollAmount() {
		return tollAmount*hoursStayed;
	}

}

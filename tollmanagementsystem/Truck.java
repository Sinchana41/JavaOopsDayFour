package com.oops.dayfour.tollmanagementsystem;

public class Truck implements Vehicle {

	private String plateNumber;
	private double hoursStayed;
	private static double tollAmount=300.0;

	public Truck(String plateNumber,double hoursStayed) {
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

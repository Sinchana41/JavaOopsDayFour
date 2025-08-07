package com.oops.dayfour.tollmanagementsystem;

public class TollBooth {

	public double totalRevenue=0;
	
	public void getTotalRevenue(Vehicle vehicle) {
		double toll=vehicle.getTollAmount();
		totalRevenue=totalRevenue+toll;
		
	}
}

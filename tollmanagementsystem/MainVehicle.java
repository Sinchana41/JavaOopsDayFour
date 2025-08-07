package com.oops.dayfour.tollmanagementsystem;

public class MainVehicle {

	public static void main(String[] args) {
		TollBooth booth=new TollBooth();

		Vehicle vehicle1=new Bike("KA01",2);
		booth.getTotalRevenue(vehicle1);
		System.out.println("Toll amount for Bike: "+vehicle1.getTollAmount()+" Plate Number: "+((Bike) vehicle1).getPlateNumber());

		Vehicle vehicle2=new Car("KA02",3);
		booth.getTotalRevenue(vehicle2);
		System.out.println("Toll amount for car: "+vehicle2.getTollAmount()+" Plate Number: "+((Car) vehicle2).getPlateNumber());

		Vehicle vehicle3=new Truck("KA03",4);
		booth.getTotalRevenue(vehicle3);
		System.out.println("Toll amount for truck: "+vehicle3.getTollAmount()+" Plate Number: "+((Truck) vehicle3).getPlateNumber());

		System.out.println("total revenue: "+booth.totalRevenue);
	}
}

package com.bilgeadam.airport;

import com.bilgeadam.model.airport.Airport;

public class AirportManager {
	private Airport airport;

	public static void main(String[] args) {
		
		System.out.println("Airport Managing Application");
		AirportManager manager = new AirportManager();
		manager.airport = new Airport("Ataturk Airport", "Istanbul");
		System.out.println(manager.airport);
		
		System.out.println("Thank you for using the application of airport managing");
	}

}

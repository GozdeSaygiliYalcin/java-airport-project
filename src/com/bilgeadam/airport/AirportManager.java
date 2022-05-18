package com.bilgeadam.airport;

import java.util.ArrayList;
import java.util.Scanner;

import com.bilgeadam.model.airport.Airport;
import com.bilgeadam.model.vehicle.Helicopter;
import com.bilgeadam.model.vehicle.Vehicle;

public class AirportManager {
	
	private Airport airport;
	@SuppressWarnings("unused")
	private ArrayList<Vehicle> vehicles;
	
	public AirportManager() {
		super();
		this.vehicles =new ArrayList<>();
	}

	public static void main(String[] args) {
		
		System.out.println("Airport Managing Application");
		AirportManager manager = new AirportManager();
		manager.airport = new Airport("Ataturk Airport", "Istanbul");
		manager.registerVehicles();
		System.out.println(manager.airport);
		
		System.out.println("Thank you for using the application of airport managing");
	}
	Vehicle vehicle;
	private void registerVehicles() {
		System.out.println("Please insert the vehicle information you have");
		System.out.println("=============================================");
		Scanner in = new Scanner(System.in);
		boolean exit= false;
		
			while(!exit)  {
				System.out.println("Please insert the vehicle type: 1-Heli, 2-Airplane, 3- FireTruck, 4-Service");
				String type = in.nextLine();
				if(type.equalsIgnoreCase("exit")) {
					exit=true;
					continue;
				}
				
				System.out.println("Please insert the vehicle brand:");
				String brand = in.nextLine();
				System.out.println("Please inster the color");
				String color =in.nextLine();
				System.out.println("Please inster the engine type");
				String engineType =in.nextLine();
				
			if(type.equalsIgnoreCase("heli")) {
				vehicle = new Helicopter(brand, engineType);
				
			}
			else if(type.equalsIgnoreCase("airplane")) {
				
			}
			else if( type.equalsIgnoreCase("fire truck")) {
				
			}
			else if(type.equals("service")) {
			}
			vehicle.setName(engineType);
			//?
		} 
			in.close();
	}

}

package com.bilgeadam.model.airport;

public class Airport {
	
	private String name;
	private String city;
	private BuildingPart runway;
	private BuildingPart taxiway;
	private BuildingPart apron;
	
	public Airport(String name, String city) {
		this.name= name;
		this.city =city;
		this.runway= new BuildingPart("runway", "asphalt", 2000, 50);
		this.taxiway= new BuildingPart("taxi1", "concrete", 200, 25);
		this.taxiway= new BuildingPart("apron", "concrete", 100, 25);
		this.apron= new BuildingPart("apron", "concrete", 200, 300);
	}

	public BuildingPart getRunway() {
		return this.runway;
	}

	public void setRunway(BuildingPart runway) {
		this.runway = runway;
	}

	public BuildingPart getTaxiway() {
		return this.taxiway;
	}

	public void setTaxiway(BuildingPart taxiway) {
		this.taxiway = taxiway;
	}

	public BuildingPart getApron() {
		return this.apron;
	}

	public void setApron(BuildingPart apron) {
		this.apron = apron;
	}

	public String getName() {
		return this.name;
	}

	public String getCity() {
		return this.city;
	}

	@Override
	public String toString() {
		return "Airport [name=" + this.name + ", city=" + this.city + ", runway=" + this.runway + ", taxiway="
				+ this.taxiway + ", apron=" + this.apron + "]";
	}
	
}

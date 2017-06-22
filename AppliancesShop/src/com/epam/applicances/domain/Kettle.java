package com.epam.applicances.domain;

public class Kettle {
	
	private int id;
	private int power;
	private int capacity;
	private String material;
	private String waterLevelIndicator;
	private String temperatureControl;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getWaterLevelIndicator() {
		return waterLevelIndicator;
	}
	public void setWaterLevelIndicator(String waterLevelIndicator) {
		this.waterLevelIndicator = waterLevelIndicator;
	}
	public String getTemperatureControl() {
		return temperatureControl;
	}
	public void setTemperatureControl(String temperatureControl) {
		this.temperatureControl = temperatureControl;
	}
	
	
}

package com.epam.applicances.domain;

public class Appliance {

	private String name;

	private double price;

	public Appliance() {

	}

	public Appliance(String name, double price) {
		this.name = name;

		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public String toString() {
        String result = null; 
        result += "Name=" + this.name; 
        result += ",Price=" + this.price; 
        
        return result;
    }
}

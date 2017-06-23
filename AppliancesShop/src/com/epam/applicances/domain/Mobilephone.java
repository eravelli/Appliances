package com.epam.applicances.domain;

public class Mobilephone extends Appliance{

	private int batterycapacity;
	
	private String platform;
	
	private int ROMmemory;
	
	private int systemmemory;
	
	private int simcardtype;
	
	private int displayinchs;
	
	public int getBatterycapacity() {
		return batterycapacity;
	}

	public void setBatterycapacity(int batterycapacity) {
		this.batterycapacity = batterycapacity;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public int getROMmemory() {
		return ROMmemory;
	}

	public void setROMmemory(int rOMmemory) {
		ROMmemory = rOMmemory;
	}

	public int getSystemmemory() {
		return systemmemory;
	}

	public void setSystemmemory(int systemmemory) {
		this.systemmemory = systemmemory;
	}

	public int getSimcardtype() {
		return simcardtype;
	}

	public void setSimcardtype(int simcardtype) {
		this.simcardtype = simcardtype;
	}

	public int getDisplayinchs() {
		return displayinchs;
	}

	public void setDisplayinchs(int displayinchs) {
		this.displayinchs = displayinchs;
	}


	
	
	
}

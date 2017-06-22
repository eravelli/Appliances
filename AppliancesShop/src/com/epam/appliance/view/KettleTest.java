package com.epam.appliance.view;

import java.util.ArrayList;
import java.util.List;

import com.epam.appliance.services.KettleRepository;
import com.epam.applicances.domain.Kettle;

public class KettleTest {
	
	public static void main(String args[]){
		
		//KettleXMLRepository kettleRepository = new KettleXMLRepository(); 
		KettleRepository kettleRepository = new KettleRepository();
		
		/*System.out.println("Appliance ID : " + kettle.getId());
		System.out.println("Power Consumation : " + kettle.getPower());
		System.out.println("Appliance Capacity : " + kettle.getCapacity());
		System.out.println("Material Type : " + kettle.getMaterial());
		System.out.println("Water level Indicator: " + kettle.getWaterLevelIndicator());
		System.out.println("Temperature Control : " + kettle.getTemperatureControl());*/
		
		List<Kettle> kettleList = new ArrayList<Kettle>();
		kettleList = kettleRepository.getKettleList();
		
		for(Kettle kettle : kettleList){
			
			
			System.out.println("Appliance ID : " + kettle.getId());
			System.out.println("Power Consumation : " + kettle.getPower());
			System.out.println("Appliance Capacity : " + kettle.getCapacity());
			System.out.println("Material Type : " + kettle.getMaterial());
			System.out.println("Water level Indicator: " + kettle.getWaterLevelIndicator());
			System.out.println("Temperature Control : " + kettle.getTemperatureControl());
		}
	}

}

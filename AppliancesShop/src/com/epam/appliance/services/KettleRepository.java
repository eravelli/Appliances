package com.epam.appliance.services;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.epam.appliance.controller.XMLDocumentReader;
import com.epam.applicances.domain.Kettle;

public class KettleRepository {
	
	private List<Kettle> kettleList = new ArrayList<Kettle>();
	private XMLDocumentReader docReader = new XMLDocumentReader(); 
	
	public List<Kettle> getKettleList() {

		try {
			Document doc = docReader.initializeDocReader();

			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList nList = docReader.findElementsByTag("kettle");
			System.out.println("----------------------------");

			for (int temp = 0; temp < nList.getLength(); temp++) {

				Node nNode = nList.item(temp);

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) nNode;

					Kettle kettle = new Kettle();
					kettle.setId(Integer.parseInt(eElement.getAttribute("id")));
					kettle.setPower(Integer.parseInt(eElement.getElementsByTagName("power").item(0).getTextContent()));
					kettle.setCapacity(
							Integer.parseInt(eElement.getElementsByTagName("capacity").item(0).getTextContent()));
					kettle.setMaterial(eElement.getElementsByTagName("material").item(0).getTextContent());
					kettle.setWaterLevelIndicator(
							eElement.getElementsByTagName("water_level_indicator").item(0).getTextContent());
					kettle.setTemperatureControl(
							eElement.getElementsByTagName("temperature_control").item(0).getTextContent());

					kettleList.add(kettle);

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return kettleList;
	}

}

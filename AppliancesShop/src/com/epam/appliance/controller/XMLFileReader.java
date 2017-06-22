package com.epam.appliance.controller;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLFileReader {

	public static void main(String args[]) {

		try {

			File file = new File("D:/Appliances/AppliancesShop/src/Kettle.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(file);

			doc.getDocumentElement().normalize();

			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

			NodeList nList = doc.getElementsByTagName("kettle");

			System.out.println("----------------------------");

			for (int temp = 0; temp < nList.getLength(); temp++) {

				Node nNode = nList.item(temp);

				System.out.println("\nAppliance Name :" + nNode.getNodeName());

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) nNode;

					System.out.println("Appliance ID : " + eElement.getAttribute("id"));
					System.out.println(
							"Power Consumation : " + eElement.getElementsByTagName("power").item(0).getTextContent());
					System.out.println(
							"Appliance Capacity : " + eElement.getElementsByTagName("capacity").item(0).getTextContent());
					System.out.println(
							"Material Type : " + eElement.getElementsByTagName("material").item(0).getTextContent());
					System.out.println(
							"Water level Indicator: " + eElement.getElementsByTagName("water_level_indicator").item(0).getTextContent());
					System.out.println("Temperature Control : " + eElement.getElementsByTagName("temperature_control").item(0).getTextContent());

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

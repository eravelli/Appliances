package com.epam.appliance.controller;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class XMLDocumentReader {

	private String FILE_LOCATION = "D:/Appliances/AppliancesShop/src/Kettle.xml";
	private File file = new File(FILE_LOCATION);
	private DocumentBuilderFactory dbFactory = null;
	private DocumentBuilder dBuilder = null;
	private Document doc = null;
	
	
	public Document initializeDocReader() throws ParserConfigurationException, SAXException, IOException {
		dbFactory = DocumentBuilderFactory.newInstance();
		dBuilder = dbFactory.newDocumentBuilder();
		doc = dBuilder.parse(file);
		doc.getDocumentElement().normalize();

		return doc;
	}
	
	public NodeList findElementsByTag(String element){
		
		NodeList nList = doc.getElementsByTagName(element);
		
		return nList;
	}

	
	
}

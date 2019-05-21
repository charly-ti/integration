package com.example.camel.model;

import javax.xml.bind.annotation.XmlElement;

public class FolioList {
	
	
	private Folio folio;

	/**
	 * @return the folio
	 */
	@XmlElement(name="Folio")
	public Folio getFolio() {
		return folio;
	}

	/**
	 * @param folio the folio to set
	 */
	public void setFolio(Folio folio) {
		this.folio = folio;
	}

	/**
	 * @param folio
	 */
	public FolioList(Folio folio) {
		super();
		this.folio = folio;
	}

	/**
	 * 
	 */
	public FolioList() {
		super();
	}
	
	
	
}

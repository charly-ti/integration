/**
 * 
 */
package com.example.camel.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * @author 
 *
 */

@XmlRootElement(name="ResInfoFolio")
//@JsonIgnoreProperties(ignoreUnknown = true,allowGetters = true,allowSetters = true)
public class ResInfoFolio {
	
	@XmlElement(name="Result")
	private Result Result;
	
	@XmlElement(name="FolioList")
	private FolioList FolioList;

	/**
	 * @return the result
	 */
	public Result getResult() {
		return Result;
	}

	/**
	 * @param result the result to set
	 */
	public void setResult(Result result) {
		Result = result;
	}

	/**
	 * @return the folioList
	 */
	public FolioList getFolioList() {
		return FolioList;
	}

	/**
	 * @param folioList the folioList to set
	 */
	public void setFolioList(FolioList folioList) {
		FolioList = folioList;
	}
	
	
	
	

}

package com.example.camel.model;

import java.text.ParseException;

import javax.xml.bind.annotation.XmlElement;

//import com.rcyc.reservationsystem.exception.InvalidAgeException;
//import com.rcyc.reservationsystem.exception.InvalidBirthDateException;
//import com.rcyc.reservationsystem.utils.Constants;
//import com.rcyc.reservationsystem.utils.ExceptionMessages;

public class Folio {
	
	

	private String token;
	private String FolioId;

	private String AdvisorId;
	private String Midname;

	private String Greeting;

	private String Phone1;

	private String Phone1Normalized;

	private String Street;

	private String Comments;

	private String PostalCode;

	private String Login;

	private String Password;

	private String EmailMatchRequired;

	private String CanMerge;

	private String CanChangeName;

	private String AccessLevel;

	private String ModifyDate;

	private String ChangeAddress;

	private String Email1;

	private String Type;

	private String Gender;

	private String Forename;

	private String Surname;

	private String Country;

	private String Language;

	private String Currency;

	private String Province;

	private String City;

	private String AgeGroup;

	private String ExternalId;

	private String EnquiryCode;

	private String FlagCode;

	private String State;

	private String Privacy1;

	private String Privacy2;

	private String Privacy3;

	private String Privacy4;

	private String Privacy5;

	private String Privacy6;

	private String Privacy7;

	private String Privacy8;

	private String Task;

	private String Enabled;

	private String Email2;

	private String BirthDate;


	/*@XmlElement(name="Agency") 
	private Agency agency;*/

	/**
	 * @return the password
	 */
	@XmlElement(name="Password") 
	public String getPassword() {
		return Password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		Password = password;
	}


	/**
	 * @return the state
	 */
	@XmlElement(name="State") 
	public String getState() {
		return State;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		State = state;
	}




	/**
	 * @return the emailMatchRequired
	 */
	@XmlElement(name="EmailMatchRequired") 
	public String getEmailMatchRequired() {
		return EmailMatchRequired;
	}

	/**
	 * @param emailMatchRequired
	 *            the emailMatchRequired to set
	 */
	public void setEmailMatchRequired(String emailMatchRequired) {
		EmailMatchRequired = emailMatchRequired;
	}

	/**
	 * @return the canMerge
	 */
	@XmlElement(name="CanMerge") 
	public String getCanMerge() {
		return CanMerge;
	}

	/**
	 * @param canMerge
	 *            the canMerge to set
	 */
	public void setCanMerge(String canMerge) {
		CanMerge = canMerge;
	}

	/**
	 * @return the privacy5
	 */
	@XmlElement(name="Privacy5") 
	public String getPrivacy5() {
		return Privacy5;
	}

	/**
	 * @param privacy5
	 *            the privacy5 to set
	 */
	public void setPrivacy5(String privacy5) {
		Privacy5 = privacy5;
	}

	/**
	 * @return the changeAddress
	 */
	@XmlElement(name="ChangeAddress") 
	public String getChangeAddress() {
		return ChangeAddress;
	}

	/**
	 * @param changeAddress
	 *            the changeAddress to set
	 */
	public void setChangeAddress(String changeAddress) {
		ChangeAddress = changeAddress;
	}



	@XmlElement(name = "Greeting")
	public String getGreeting() {
		return Greeting;
	}

	public void setGreeting(String Greeting) {
		this.Greeting = Greeting;
	}

	@XmlElement(name = "Phone1")
	public String getPhone1() {
		return Phone1;
	}

	public void setPhone1(String Phone1) {
		this.Phone1 = Phone1;
	}

	@XmlElement(name = "Street")
	public String getStreet() {
		return Street;
	}

	public void setStreet(String Street) {
		this.Street = Street;
	}

	@XmlElement(name = "Comments")
	public String getComments() {
		return Comments;
	}

	public void setComments(String Comments) {
		this.Comments = Comments;
	}

	@XmlElement(name = "PostalCode")
	public String getPostalCode() {
		return PostalCode;
	}

	public void setPostalCode(String PostalCode) {
		this.PostalCode = PostalCode;
	}

	@XmlElement(name = "Email1")
	public String getEmail1() {
		return Email1;
	}

	public void setEmail1(String Email1) {
		this.Email1 = Email1;
	}

	@XmlElement(name = "Email2")
	public String getEmail2() {
		return Email2;
	}

	public void setEmail2(String Email2) {
		this.Email2 = Email2;
	}


	@XmlElement(name = "Type")
	public String getType() {
		return Type;
	}

	public void setType(String Type) {
		this.Type = Type;
	}

	@XmlElement(name = "Gender")
	public String getGender() {
		return Gender;
	}

	public void setGender(String Gender) {
		this.Gender = Gender;
	}

	@XmlElement(name = "Forename")
	public String getForename() {
		return Forename;
	}

	public void setForename(String Forename) {
		this.Forename = Forename;
	}

	@XmlElement(name = "Surname")
	public String getSurname() {
		return Surname;
	}

	public void setSurname(String Surname) {
		this.Surname = Surname;
	}

	@XmlElement(name = "Country")
	public String getCountry() {
		return Country;
	}

	public void setCountry(String Country) {
		this.Country = Country;
	}

	@XmlElement(name = "Province")
	public String getProvince() {
		return Province;
	}

	public void setProvince(String Province) {
		this.Province = Province;
	}

	@XmlElement(name = "City")
	public String getCity() {
		return City;
	}

	public void setCity(String City) {
		this.City = City;
	}

	@XmlElement(name = "AgeGroup")
	public String getAgeGroup() {
		return AgeGroup;
	}

	public void setAgeGroup(String AgeGroup) {
		this.AgeGroup = AgeGroup;
	}

	@XmlElement(name = "ExternalId")
	public String getExternalId() {
		return ExternalId;
	}

	public void setExternalId(String externalId) {
		ExternalId = externalId;
	}

	@XmlElement(name = "EnquiryCode")
	public String getEnquiryCode() {
		return EnquiryCode;
	}

	public void setEnquiryCode(String enquiryCode) {
		EnquiryCode = enquiryCode;
	}

	@XmlElement(name = "FlagCode")
	public String getFlagCode() {
		return FlagCode;
	}

	public void setFlagCode(String flagCode) {
		FlagCode = flagCode;
	}

	@XmlElement(name = "Privacy2")
	public String getPrivacy2() {
		return Privacy2;
	}

	public void setPrivacy2(String privacy2) {
		Privacy2 = privacy2;
	}

	@XmlElement(name = "Privacy8")
	public String getPrivacy8() {
		return Privacy8;
	}

	public void setPrivacy8(String privacy8) {
		Privacy8 = privacy8;
	}

	/**
	 * @return the login
	 */
	@XmlElement(name="Login") 
	public String getLogin() {
		return Login;
	}

	/**
	 * @param login
	 *            the login to set
	 */
	public void setLogin(String login) {
		Login = login;
	}

	/**
	 * @return the folioId
	 */
	@XmlElement(name="FolioId")
	public String getFolioId() {
		return FolioId;
	}

	/**
	 * @param folioId the folioId to set
	 */
	public void setFolioId(String folioId) {
		FolioId = folioId;
	}

	/**
	 * @return the advisorId
	 */
	@XmlElement(name="AdvisorId")
	public String getAdvisorId() {
		return AdvisorId;
	}

	/**
	 * @param advisorId the advisorId to set
	 */
	public void setAdvisorId(String advisorId) {
		AdvisorId = advisorId;
	}

	/**
	 * @return the phone1Normalized
	 */
	@XmlElement(name="Phone1Normalized")
	public String getPhone1Normalized() {
		return Phone1Normalized;
	}

	/**
	 * @param phone1Normalized the phone1Normalized to set
	 */
	public void setPhone1Normalized(String phone1Normalized) {
		Phone1Normalized = phone1Normalized;
	}

	/**
	 * @return the canChangeName
	 */
	@XmlElement(name="CanChangeName")
	public String getCanChangeName() {
		return CanChangeName;
	}

	/**
	 * @param canChangeName the canChangeName to set
	 */
	public void setCanChangeName(String canChangeName) {
		CanChangeName = canChangeName;
	}

	/**
	 * @return the accessLevel
	 */
	@XmlElement(name="AccessLevel")
	public String getAccessLevel() {
		return AccessLevel;
	}

	/**
	 * @param accessLevel the accessLevel to set
	 */
	public void setAccessLevel(String accessLevel) {
		AccessLevel = accessLevel;
	}

	/**
	 * @return the modifyDate
	 */
	@XmlElement(name="ModifyDate")
	public String getModifyDate() {
		return ModifyDate;
	}

	/**
	 * @param modifyDate the modifyDate to set
	 */
	public void setModifyDate(String modifyDate) {
		ModifyDate = modifyDate;
	}

	/**
	 * @return the language
	 */
	@XmlElement(name="Language")
	public String getLanguage() {
		return Language;
	}

	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		Language = language;
	}

	/**
	 * @return the currency
	 */
	@XmlElement(name="Currency")
	public String getCurrency() {
		return Currency;
	}

	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		Currency = currency;
	}

	/**
	 * @return the privacy1
	 */
	@XmlElement(name="Privacy1")
	public String getPrivacy1() {
		return Privacy1;
	}

	/**
	 * @param privacy1 the privacy1 to set
	 */
	public void setPrivacy1(String privacy1) {
		Privacy1 = privacy1;
	}

	/**
	 * @return the privacy3
	 */
	@XmlElement(name="Privacy3")
	public String getPrivacy3() {
		return Privacy3;
	}

	/**
	 * @param privacy3 the privacy3 to set
	 */
	public void setPrivacy3(String privacy3) {
		Privacy3 = privacy3;
	}

	/**
	 * @return the privacy4
	 */
	@XmlElement(name="Privacy4")
	public String getPrivacy4() {
		return Privacy4;
	}

	/**
	 * @param privacy4 the privacy4 to set
	 */
	public void setPrivacy4(String privacy4) {
		Privacy4 = privacy4;
	}

	/**
	 * @return the privacy6
	 */
	@XmlElement(name="Privacy6")
	public String getPrivacy6() {
		return Privacy6;
	}

	/**
	 * @param privacy6 the privacy6 to set
	 */
	public void setPrivacy6(String privacy6) {
		Privacy6 = privacy6;
	}

	/**
	 * @return the privacy7
	 */
	@XmlElement(name="Privacy7")
	public String getPrivacy7() {
		return Privacy7;
	}

	/**
	 * @param privacy7 the privacy7 to set
	 */
	public void setPrivacy7(String privacy7) {
		Privacy7 = privacy7;
	}

	/**
	 * @return the task
	 */
	@XmlElement(name="Task")
	public String getTask() {
		return Task;
	}

	/**
	 * @param task the task to set
	 */
	public void setTask(String task) {
		Task = task;
	}


	/**
	 * @return the enabled
	 */
	@XmlElement(name="Enabled")
	public String getEnabled() {
		return Enabled;
	}

	/**
	 * @param enabled the enabled to set
	 */
	public void setEnabled(String enabled) {
		Enabled = enabled;
	}


	/**
	 * @return the midname
	 */
	@XmlElement(name="Midname")
	public String getMidname() {
		return Midname;
	}

	/**
	 * @param midname the midname to set
	 */
	public void setMidname(String midname) {
		Midname = midname;
	}

	/**
	 * 
	 */
	public Folio() {
		super();
	}



	/**
	 * @param folioId
	 */
	public Folio(String folioId) {
		super();
		FolioId = folioId;
	}

	/**
	 * @param login
	 * @param password
	 */
	public Folio( String login, String password) {
		super();
		Login = login;
		Password = password;
	}

	/**
	 * @param folioId
	 * @param login
	 * @param password
	 */
	public Folio(String folioId, String login, String password) {
		super();
		FolioId = folioId;
		Login = login;
		Password = password;
	}

	/**
	 * @param postalCode
	 * @param email1
	 * @param type
	 * @param forename
	 * @param surname
	 * @param country
	 */
	public Folio( String surname,String forename,  String country,String email1,String postalCode) {
		super();
		PostalCode = postalCode;
		Email1 = email1;
		Forename = forename;
		Surname = surname;
		Country = country;
	}



	@Override
	public String toString() {
		return "ClassPojo [Greeting = " + Greeting + ", Phone1 = " + Phone1 + ", Street = " + Street + ", Comments = "
				+ Comments + ", PostalCode = " + PostalCode + ", Email1 = " + Email1 + ", Type = " + Type
				+ ", Gender = " + Gender + ", Forename = " + Forename + ", Surname = " + Surname + ", Country = "
				+ Country + ", Province = " + Province + ", City = " + City + ", AgeGroup = " + AgeGroup
				+ ", ExternalId = " + ExternalId + ",EnquiryCode = " + EnquiryCode + " FlagCode =" + FlagCode + "]";
	}

	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}

	/**
	 * @return the birthDate
	 * @throws ParseException 
	 */
	@XmlElement(name="BirthDate") 
	public String getBirthDate() throws ParseException {
		return BirthDate;
	}

	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(String birthDate) {
		BirthDate = birthDate;
	}

//	public boolean validateBirthDate() throws InvalidBirthDateException,ParseException {
//		boolean response=false;
//		
//		if(this.getBirthDate()!=null) {
//			LocalDate date=LocalDate.parse(this.getBirthDate());
//			LocalDate curDate=LocalDate.now();
//			Period diff=Period.between(date, curDate);
//			if(diff.getYears()>=18) {
//				response=true;
//			}else {
//				throw new InvalidBirthDateException(ExceptionMessages.INVALID_BIRTH_DATE_CODE, ExceptionMessages.INVALID_AGE_MESSAGE);
//			}
//		}
//		return response;
//	}
//	
//	
//	public boolean validateAgeGroup() throws InvalidAgeException,ParseException {
//		boolean response=true;
//		if (this.getAgeGroup()!=null&&!this.getAgeGroup().equalsIgnoreCase(Constants.AGE_GROUP_A)) {
//			throw new InvalidAgeException(ExceptionMessages.INVALID_AGE_CODE,ExceptionMessages.INVALID_AGE_MESSAGE);
//		}
//		return response;
//	}
	


	
}

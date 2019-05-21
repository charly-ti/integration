package com.example.camel.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name ="Folio")
public class ResFolioToDB {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getFolioId() {
		return FolioId;
	}
	public void setFolioId(String folioId) {
		FolioId = folioId;
	}
	public String getAdvisorId() {
		return AdvisorId;
	}
	public void setAdvisorId(String advisorId) {
		AdvisorId = advisorId;
	}
	public String getMidname() {
		return Midname;
	}
	public void setMidname(String midname) {
		Midname = midname;
	}
	public String getGreeting() {
		return Greeting;
	}
	public void setGreeting(String greeting) {
		Greeting = greeting;
	}
	public String getPhone1() {
		return Phone1;
	}
	public void setPhone1(String phone1) {
		Phone1 = phone1;
	}
	public String getPhone1Normalized() {
		return Phone1Normalized;
	}
	public void setPhone1Normalized(String phone1Normalized) {
		Phone1Normalized = phone1Normalized;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getComments() {
		return Comments;
	}
	public void setComments(String comments) {
		Comments = comments;
	}
	public String getPostalCode() {
		return PostalCode;
	}
	public void setPostalCode(String postalCode) {
		PostalCode = postalCode;
	}
	public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		Login = login;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getEmailMatchRequired() {
		return EmailMatchRequired;
	}
	public void setEmailMatchRequired(String emailMatchRequired) {
		EmailMatchRequired = emailMatchRequired;
	}
	public String getCanMerge() {
		return CanMerge;
	}
	public void setCanMerge(String canMerge) {
		CanMerge = canMerge;
	}
	public String getCanChangeName() {
		return CanChangeName;
	}
	public void setCanChangeName(String canChangeName) {
		CanChangeName = canChangeName;
	}
	public String getAccessLevel() {
		return AccessLevel;
	}
	public void setAccessLevel(String accessLevel) {
		AccessLevel = accessLevel;
	}
	public String getModifyDate() {
		return ModifyDate;
	}
	public void setModifyDate(String modifyDate) {
		ModifyDate = modifyDate;
	}
	public String getChangeAddress() {
		return ChangeAddress;
	}
	public void setChangeAddress(String changeAddress) {
		ChangeAddress = changeAddress;
	}
	public String getEmail1() {
		return Email1;
	}
	public void setEmail1(String email1) {
		Email1 = email1;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getForename() {
		return Forename;
	}
	public void setForename(String forename) {
		Forename = forename;
	}
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	public String getCurrency() {
		return Currency;
	}
	public void setCurrency(String currency) {
		Currency = currency;
	}
	public String getProvince() {
		return Province;
	}
	public void setProvince(String province) {
		Province = province;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getAgeGroup() {
		return AgeGroup;
	}
	public void setAgeGroup(String ageGroup) {
		AgeGroup = ageGroup;
	}
	public String getExternalId() {
		return ExternalId;
	}
	public void setExternalId(String externalId) {
		ExternalId = externalId;
	}
	public String getEnquiryCode() {
		return EnquiryCode;
	}
	public void setEnquiryCode(String enquiryCode) {
		EnquiryCode = enquiryCode;
	}
	public String getFlagCode() {
		return FlagCode;
	}
	public void setFlagCode(String flagCode) {
		FlagCode = flagCode;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getPrivacy1() {
		return Privacy1;
	}
	public void setPrivacy1(String privacy1) {
		Privacy1 = privacy1;
	}
	public String getPrivacy2() {
		return Privacy2;
	}
	public void setPrivacy2(String privacy2) {
		Privacy2 = privacy2;
	}
	public String getPrivacy3() {
		return Privacy3;
	}
	public void setPrivacy3(String privacy3) {
		Privacy3 = privacy3;
	}
	public String getPrivacy4() {
		return Privacy4;
	}
	public void setPrivacy4(String privacy4) {
		Privacy4 = privacy4;
	}
	public String getPrivacy5() {
		return Privacy5;
	}
	public void setPrivacy5(String privacy5) {
		Privacy5 = privacy5;
	}
	public String getPrivacy6() {
		return Privacy6;
	}
	public void setPrivacy6(String privacy6) {
		Privacy6 = privacy6;
	}
	public String getPrivacy7() {
		return Privacy7;
	}
	public void setPrivacy7(String privacy7) {
		Privacy7 = privacy7;
	}
	public String getPrivacy8() {
		return Privacy8;
	}
	public void setPrivacy8(String privacy8) {
		Privacy8 = privacy8;
	}
	public String getTask() {
		return Task;
	}
	public void setTask(String task) {
		Task = task;
	}
	public String getEnabled() {
		return Enabled;
	}
	public void setEnabled(String enabled) {
		Enabled = enabled;
	}
	public String getEmail2() {
		return Email2;
	}
	public void setEmail2(String email2) {
		Email2 = email2;
	}
	public String getBirthDate() {
		return BirthDate;
	}
	public void setBirthDate(String birthDate) {
		BirthDate = birthDate;
	}
	
	
	
	

}

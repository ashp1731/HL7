package PatientInfo;
import java.util.*;
public class Patient
{
// Patient class : to store Patient Information for each PID line
	private int setID ;
	private String 	patientID, firstName, lastName, middleInitial, prefix, suffix, 
					race, primaryLanguage, ssn,citizenship, phoneNumber;
	private char sex, maritalStatus;
	private boolean patientDeathInd;
	private Date dob, dod;
	private Address address;
	private static int numberOfObjects;
	
	public Patient() {}
	
//public Patient(int setID,int patientID,String Firstname,String Lastname,String race,String primaryLanguage,String ssn,String Citizenship,String PatientAddress,char sex,char maritalStatus,char patientDeathInd,Date DOB) {
//
//		int ID=(int)(Math.random()*2000);
//		setID=ID;
//		int PID=(int)(Math.random()*2000);
//		patientID=PID;
//
//		this.name=name;
//
//		this.patientPhoneNumber=patientPhoneNumber;
//		this.Firstname=Firstname;
//		this.Lastname=Lastname;
//
//		this.race=race;
//		this.primaryLanguage=primaryLanguage;
//		this.ssn=ssn;
//		this.Citizenship=Citizenship;
//		this.PatientAddress=PatientAddress;
//		this.sex=sex;
//		this.maritalStatus=maritalStatus;
//		this.patientDeathInd=patientDeathInd;
//		this.DOB=DOB;
//		this.dod=dod;
//	}

public int getSetID() {return setID;}
public void setSetID(int setID) {this.setID = setID;}

public String getPatientID() {return patientID;}
public void setPatientID(String patientID) {this.patientID = patientID;}

public String getFirstName() {return firstName;}
public void setFirstName(String firstName) {this.firstName = firstName;}

public String getLastName() {return lastName;}
public void setLastName(String lastName) {this.lastName = lastName;}


public String getMiddleInitial() {return middleInitial;}
public void setMiddleInitial(String middleInitial) {this.middleInitial = middleInitial;}


public String getPrefix() {return prefix;}
public void setPrefix(String prefix) {this.prefix = prefix;}

public String getSuffix() {return suffix;}
public void setSuffix(String suffix) {this.suffix = suffix;}

public String getRace() {return race;}
public void setRace(String race) {this.race = race;}

public String getPrimaryLanguage() {return primaryLanguage;}
public void setPrimaryLanguage(String primaryLanguage) {this.primaryLanguage = primaryLanguage;}

public String getSsn() {return ssn;}
public void setSsn(String ssn) {this.ssn = ssn;}

public String getCitizenship() {return citizenship;}
public void setCitizenship(String citizenship) {this.citizenship = citizenship;}

public String getPhoneNumber() {return phoneNumber;}
public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}



public char getSex() {
	return sex;
}

public void setSex(char sex) {
	this.sex = sex;
}

public char getMaritalStatus() {return maritalStatus;}
public void setMaritalStatus(char maritalStatus) {this.maritalStatus = maritalStatus;}

public boolean getPatientDeathInd() {return patientDeathInd;}
public void setPatientDeathInd(boolean patientDeathInd) {this.patientDeathInd = patientDeathInd;}

public Date getDob() {return dob;}
public void setDob(Date dob) {this.dob = dob;}

public Date getDod() {return dod;}
public void setDod(Date dod) {this.dod = dod;}

public Address getAddress() {return address;}
public void setAddress(Address address) {this.address = address;}

public void incrementObject(){
	numberOfObjects++;
}

public int getNumOfObjects() {
return numberOfObjects;
}
}
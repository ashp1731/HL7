package PatientInfo;
import java.util.*;
public class Patient
{
	private int setID, patientID;
	private String name, race, primaryLanguage, ssn,Citizenship,PatientAddress;
	private char sex, maritalStatus, patientDeathInd;
	private Date DOB;
	public Patient() {
		
	}
public Patient(int setID,int patientID,String name,String race,String primaryLanguage,String ssn,String Citizenship,String PatientAddress,char sex,char maritalStatus,char patientDeathInd,Date DOB) {
		int ID=(int)(Math.random()*2000);
		setID=ID;
		int PID=(int)(Math.random()*2000);
		patientID=PID;
		this.name=name;
		this.race=race;
		this.primaryLanguage=primaryLanguage;
		this.ssn=ssn;
		this.Citizenship=Citizenship;
		this.PatientAddress=PatientAddress;
		this.sex=sex;
		this.maritalStatus=maritalStatus;
		this.patientDeathInd=patientDeathInd;
		this.DOB=DOB;
	}
public int getSetID() {
	return setID;
}
public void setSetID(int setID) {
	this.setID = setID;
}
public int getPatientID() {
	return patientID;
}
public void setPatientID(int patientID) {
	this.patientID = patientID;
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getRace() {
	return race;
}
public void setRace(String race) {
	this.race = race;
}
public String getPrimaryLanguage() {
	return primaryLanguage;
}
public void setPrimaryLanguage(String primaryLanguage) {
	this.primaryLanguage = primaryLanguage;
}
public String getSsn() {
	return ssn;
}
public void setSsn(String ssn) {
	this.ssn = ssn;
}
public String getCitizenship() {
	return Citizenship;
}
public void setCitizenship(String citizenship) {
	Citizenship = citizenship;
}
public String getPatientAddress() {
	return PatientAddress;
}
public void setPatientAddress(String patientAddress) {
	PatientAddress = patientAddress;
}
public char getSex() {
	return sex;
}
public void setSex(char sex) {
	this.sex = sex;
}
public char getMaritalStatus() {
	return maritalStatus;
}
public void setMaritalStatus(char maritalStatus) {
	this.maritalStatus = maritalStatus;
}
public char getPatientDeathInd() {
	return patientDeathInd;
}
public void setPatientDeathInd(char patientDeathInd) {
	this.patientDeathInd = patientDeathInd;
}
public Date getDOB() {
	return DOB;
}
public void setDOB(Date dOB) {
	DOB = dOB;
}
	
}
package PatientInfo;

import java.util.Arrays;

public class getPatientInfo {
	
	 static Patient getPatientInfo(String[]arrayPID) {
		 Patient patient = new Patient();
		 patient.setSetID(Integer.parseInt(arrayPID[1]));
		 patient.setPatientID((arrayPID[2]));
		 String[]arrayName=arrayPID[5].split("\\^");
		 patient.setLastName(arrayName[0]);
		 patient.setFirstName(arrayName[1]);
		 patient.setMiddleInitial(arrayName[2]);
		 patient.setSuffix(arrayName[3]);
		 patient.setPrefix(arrayName[4]);
		 
		 patient.setRace(arrayPID[10]);
		 patient.setPrimaryLanguage(arrayPID[15]);
		 patient.setSsn(arrayPID[19]);
		 patient.setCitizenship(arrayPID[26]);
		 
		 // Address Field
		 String[] arrayAddress = arrayPID[11].split("\\^");
		 Address address = new Address();
		 address.setStreet(arrayAddress[0]);
		 address.setCity(arrayAddress[2]);
		 address.setState(arrayAddress[3]);
		 address.setZipCode(Integer.parseInt(arrayAddress[4]));
		 address.setCountry(arrayAddress[5]);
		 patient.setAddress(address);
		 
		 patient.setPhoneNumber(arrayPID[13]);
			return patient;
	 }
			public static void main(String[]args) {
				 String[]arrayAddress = "115 MAINSTREET^^GOODTOWN^KY^42010^USA^L^010".split("\\^");
				System.out.println(Arrays.toString(arrayAddress));
			}
	

}

package PatientInfo;

public class WriteOutput {

	public static void writeToConsole(Patient[] arrayPatient) {
		for(int i = 0; i < arrayPatient.length; i++)
		{
			System.out.println("Set ID : " + arrayPatient[i].getSetID());
			System.out.println("Patient ID : " + arrayPatient[i].getPatientID());
			System.out.println("Patient Name : " + arrayPatient[i].getFirstName() + " " + arrayPatient[i].getLastName());
			System.out.println("Date of Birth : " + arrayPatient[i].getDob());
			System.out.println("Sex : " + arrayPatient[i].getSex());
			System.out.println("Race : " + arrayPatient[i].getRace());
			System.out.println("Citizenship : " + arrayPatient[i].getCitizenship());
			System.out.println("Address : " + arrayPatient[i].getAddress().getStreet() + " " 
								+ arrayPatient[i].getAddress().getCity() 
								+ arrayPatient[i].getAddress().getState() + " " 
								+ arrayPatient[i].getAddress().getZipCode() + " " 
								+ arrayPatient[i].getAddress().getCountry());
			System.out.println("Phone Number : " + arrayPatient[i].getPhoneNumber());
			System.out.println("Primary Language : " + arrayPatient[i].getPrimaryLanguage());
			System.out.println("Marital Status : " + arrayPatient[i].getMaritalStatus());
			System.out.println("SSN : " + arrayPatient[i].getSsn());
			System.out.println("Death Indicator : " + arrayPatient[i].getPatientDeathInd());
			System.out.println("Death Date : " + arrayPatient[i].getDod() + "\n");
			
		}

	}
	
	public static void writeToFile(Patient[] arrayPatient) {
		
	}
}

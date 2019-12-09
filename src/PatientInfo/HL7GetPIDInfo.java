
package PatientInfo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HL7GetPIDInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File f = new File("messages.txt");
		
		try {
			Scanner input = new Scanner(f);
			String s = "";
			ArrayList<String> pid = new ArrayList<>();
			while(input.hasNext())
			{
				s = input.nextLine();
				if(s.startsWith("PID"))
				{
					pid.add(s);
				}
			}
			System.out.println(pid.size());

			ArrayList<Patient> listPatientObject = new ArrayList<>();
			for(int i = 0; i < pid.size(); i++)
			{
				String[] arrayPID = pid.get(i).split("\\|");
				Patient patient = new Patient();
				patient = getPatientInfo.getPatientInfo(arrayPID);;
				listPatientObject.add(patient);
				
//				System.out.println(Arrays.toString(arrayPID));
			}
			
			Patient[] arrayPatientObject = new Patient[listPatientObject.size()];
			listPatientObject.toArray(arrayPatientObject);
			for(int i = 0; i < arrayPatientObject.length; i++)
			{
				System.out.println("Set ID : " + arrayPatientObject[i].getSetID());
				System.out.println("Patient ID : " + arrayPatientObject[i].getPatientID());
				System.out.println("Patient Name : " + arrayPatientObject[i].getFirstName() + " " + arrayPatientObject[i].getLastName());
				System.out.println("Date of Birth : " + arrayPatientObject[i].getDob());
				System.out.println("Sex : " + arrayPatientObject[i].getSex());
				System.out.println("Race : " + arrayPatientObject[i].getRace());
				System.out.println("Citizenship : " + arrayPatientObject[i].getCitizenship());
				System.out.println("Address : " + arrayPatientObject[i].getAddress().getStreet() + " " 
									+ arrayPatientObject[i].getAddress().getCity() 
									+ arrayPatientObject[i].getAddress().getState() + " " 
									+ arrayPatientObject[i].getAddress().getZipCode() + " " 
									+ arrayPatientObject[i].getAddress().getCountry());
				System.out.println("Phone Number : " + arrayPatientObject[i].getPhoneNumber());
				System.out.println("Primary Language : " + arrayPatientObject[i].getPrimaryLanguage());
				System.out.println("Marital Status : " + arrayPatientObject[i].getMaritalStatus());
				System.out.println("SSN : " + arrayPatientObject[i].getSsn());
				System.out.println("Death Indicator : " + arrayPatientObject[i].getPatientDeathInd());
				System.out.println("Death Date : " + arrayPatientObject[i].getDod() + "\n");
				
			}
//			System.out.println(Arrays.toString(arrayPatientObject));

		}
		catch(FileNotFoundException ex)
		{
			System.out.println(ex);
		}
	}

}
package PatientInfo;

import java.util.*;
import java.io.*;

public class test
{
	
	// Test program to read file
	public static void main(String[]args)
	{
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
//			System.out.println(pid);
			for(int i = 0; i < pid.size(); i++)
			{
				//System.out.println(pid.get(i));
				String[] arrayPID = pid.get(i).split("\\|");
				System.out.println(Arrays.toString(arrayPID));
				
		
				Patient patient = new Patient();
//				patient = getPatientInfo.getPatientInfo(arrayPID);
//				System.out.println(Arrays.toString(arrayPID));
			}

		}
		catch(FileNotFoundException ex)
		{
			System.out.println(ex);
		}
	}




	
	
}
//static void getPatientInfo(String[]arrayPID) {
//	 Patient patient = new Patient();
//	 patient.setSetID(Integer.parseInt(arrayPID[1]));
//	 patient.setPatientID((arrayPID[2]));
//	 String[]arrayName=arrayPID[5].split("\\^");
//	 patient.setLastName(arrayName[0]);
//	 patient.setFirstName(arrayName[1]);
//	 patient.setMiddleInitial(arrayName[2]);
//	 patient.setSuffix(arrayName[3]);
//	 patient.setPrefix(arrayName[4]);
//	 
//	 patient.setRace(arrayPID[10]);
//	 patient.setPrimaryLanguage(arrayPID[15]);
//	 patient.setSsn(arrayPID[19]);
//	 patient.setCitizenship(arrayPID[26]);
//	 //patient.setPatientAddress(arrayPID[11]);
//	patient.setPhoneNumber(arrayPID[13]);
//	//	return patient;
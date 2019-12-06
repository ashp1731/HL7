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
	
//	public static Patient getPatientInfo(String[] array) {
//		
//		
//		Patient patient = new Patient();
//		return patient;
//	}
//	



	
	
}
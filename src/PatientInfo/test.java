package PatientInfo;

import java.util.*;
import java.io.*;

public class test
{
	
	// Test program to read file
	public static void main(String[]args)
	{
		//outside the src paste file
		File f = new File("messages.txt");
		
		try {
			//open the file using sccanner object and read each line
			Scanner input = new Scanner(f);
			//initialize the string
			String s ;
			
			ArrayList<String> pid = new ArrayList<>();
			while(input.hasNext())
			{
				//1.we read line and put it in string
				
				s = input.nextLine();
				//2.and checked the  string start with pid
				if(s.startsWith("PID"))
				{
					//3.if its true its add to the array list
					pid.add(s);
				}
			}
			//size of pid arraylist
			System.out.println(pid.size());
//			System.out.println(pid);
			//we are using for loop in array list
			for(int i = 0; i < pid.size(); i++)
			{
				//System.out.println(pid.get(i));
				String[] arrayPID = pid.get(i).split("\\|");
				Patient patient = new Patient();
				//we are getting the array from arraylist and passing to the method.(getPatientInfo(arrayPID)
				//for  1 patient we have create one patient object from that method patient object is getting info of patient 1 from array
				patient = getPatientInfo(arrayPID);
				System.out.println(Arrays.toString(arrayPID));
			}

		}
		catch(FileNotFoundException ex)
		{
			System.out.println(ex);
		}
	}
	
	public static Patient getPatientInfo(String[] array) {
		
		
		Patient patient = new Patient();
		return patient;
	}
	



	
	
}
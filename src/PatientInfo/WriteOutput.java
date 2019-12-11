package PatientInfo;

import java.io.FileNotFoundException;

public class WriteOutput {

	public static void writeToFile(Patient[] arrayPatient)  {
try {
		String s;
		java.io.File file =new java.io.File("patient-summary.txt");
		try (
		java.io.PrintWriter output=new java.io.PrintWriter(file);
		){
		if(file.exists()) {
			System.out.println("file already exits");
			System.exit(1);
		}
		
		for (int i = 0; i < arrayPatient.length; i++) {
			s = arrayPatient.toString();
			// Logic to write data into file
			
			output.print(s);
		}
		}
}
		catch (Exception ex){
			System.out.println(ex);
		}
	}
}


	
	
	


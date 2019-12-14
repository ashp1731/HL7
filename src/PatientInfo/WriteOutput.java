package PatientInfo;

import java.io.FileNotFoundException;
import java.io.File;

public class WriteOutput {

	public static void writeToFile(Patient[] arrayPatient) throws java.io.IOException {

		String s;
		File file = new File("patient-summary.txt");

		if (file.exists()) {
			file.delete();
			file.createNewFile();
//			System.out.println("file already exits");
//			System.exit(1);
		}

		java.io.PrintWriter output = new java.io.PrintWriter(file);

		for (int i = 0; i < arrayPatient.length; i++) {
			s = arrayPatient[i].toString();
			// Logic to write data into file

			output.println(s);
		}
		output.close();
	}

	public static void writeErrorPID(String s) throws java.io.IOException {
		java.io.File file = new java.io.File("Data-Error-PID.txt");
		if (file.exists()) {
			file.delete();
			file.createNewFile();
		}

		java.io.PrintWriter output = new java.io.PrintWriter(file);

		for (int i = 0; i < s.length(); i++) {
			output.println(s);
		}
		output.close();
	}

}

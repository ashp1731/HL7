package PatientInfo;

import java.io.FileNotFoundException;

public class WriteOutput {

	public static void writeToFile(Patient[] arrayPatient) throws java.io.IOException {

		String s;
		java.io.File file = new java.io.File("patient-summary.txt");

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
}

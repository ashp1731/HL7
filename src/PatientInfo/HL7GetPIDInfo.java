
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
			while (input.hasNext()) {
				s = input.nextLine();
				if (s.startsWith("PID")) {
					pid.add(s);
				}
			}
			ArrayList<Patient> listPatientObject = new ArrayList<>();
			for (int i = 0; i < pid.size(); i++) {
				String[] arrayPID = pid.get(i).split("\\|");
				Patient patient = new Patient();
				patient = getPatientInfo.getPatientInfo(arrayPID); // Converts PID line into Patient Object
				listPatientObject.add(patient);
			}

			Patient[] arrayPatientObject = new Patient[listPatientObject.size()];
			listPatientObject.toArray(arrayPatientObject);

			for (int i = 0; i < arrayPatientObject.length; i++) {
				System.out.println(arrayPatientObject[i].toString()); // toString Method is called on Patient Object to
																		// display the snapshot of all the Patient
																		// Objects
			}

		} catch (FileNotFoundException ex) {
			System.out.println(ex);
		}
	}
}
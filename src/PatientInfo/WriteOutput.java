package PatientInfo;

public class WriteOutput {


	public static void writeToFile(Patient[] arrayPatient) {
		
		String s;
		for(int i = 0; i < arrayPatient.length; i++) {
			s = arrayPatient.toString();
			// Logic to write data into file
			java.io.File file =new java.io.File("messages.txt");
			if(file.exists()) {
				System.out.println("file already exits");
				system.ex
			}
			java.io.PrintWriter output=new java.io.PrintWriter output(file);
		}
	}
}

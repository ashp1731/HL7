package PatientInfo;

import java.util.Arrays;

public class getPatientInfo {

	static Patient getPatientInfo(String[] arrayPID) {
		Patient patient = new Patient();
		patient.incrementObject();

		if (arrayPID.length > 0) {
			for (int i = 0; i < arrayPID.length; i++) {
				switch (i) {
				case 1:
					// Retrieve Set ID
					if (!arrayPID[i].isEmpty()) {
						patient.setSetID(Integer.parseInt(arrayPID[i]));
					}
					break;
				case 3:
					// Retrieve Patient ID
					String[] arrayPatientID = arrayPID[i].split("\\^");
					if (arrayPatientID.length > 0)
						patient.setPatientID((arrayPatientID[0]));
					break;
				case 5:
					// Retrieve Patient Name Information
					String[] arrayName = arrayPID[i].split("\\^");
					if (arrayName.length > 0) {
						for (int j = 0; j < arrayName.length; j++) {
							switch (j) {
							case 0:
								patient.setLastName(arrayName[j]);
								break;
							case 1:
								patient.setFirstName(arrayName[j]);
								break;
							case 2:
								patient.setMiddleInitial(arrayName[j]);
								break;
							case 3:
								patient.setSuffix(arrayName[j]);
								break;
							case 4:
								patient.setPrefix(arrayName[j]);
								break;
							}
						}
					}
					break;
				case 7:
					// RETRIVE DATE-OF-BIRTH
					try {
						if (!arrayPID[i].isEmpty()) {
							patient.setDob(StringToDate.convertStringToDate(arrayPID[i], "yyyymmdd"));
						}
					} catch (Exception ex) {
						System.out.println(ex);
					}
					break;
				case 8:
					// RETRIVE SEX

					if (!arrayPID[i].isEmpty()) {
						patient.setSex(arrayPID[i].charAt(0));
					}
					break;
				case 10:
					// Retrieve Race
					if (!arrayPID[i].isEmpty()) {
						String[] arrayRace = arrayPID[i].split("\\^");
						if (arrayRace.length > 0) {
							switch (arrayRace[0]) {
							case "2131-1":
								patient.setRace("Other Race");
								break;
							case "2106-3":
								patient.setRace("White");
								break;
							case "2076-8":
								patient.setRace("Native Hawaiian or Other Pacific Islander");
							case "2054-5":
								patient.setRace("Black or African American");
								break;
							case "2028-9":
								patient.setRace("Asian");
								break;
							case "1002-5":
								patient.setRace("American Indian or Alaska Native");
								break;
							default:
								patient.setRace("Other Race");
								break;
							}
						}
					}
					break;
				case 11:
					// Retrieve Patient Address Information
					String[] arrayAddress = arrayPID[11].split("\\^");
					if (arrayAddress.length > 0) {
						Address address = new Address();
						for (int j = 0; j < arrayAddress.length; j++) {
							switch (j) {
							case 0:
								address.setStreet(arrayAddress[j]);
								break;
							case 2:
								address.setCity(arrayAddress[j]);
								break;
							case 3:
								address.setState(arrayAddress[j]);
								break;
							case 4:
								if (!arrayAddress[j].equals("")) {
									String zipCode = arrayAddress[j].substring(0, 4);
									address.setZipCode(Integer.parseInt(zipCode));
								}
							case 5:
								address.setCountry(arrayAddress[j]);
								break;
							}	
						}		
					}
				case 13:

					// Retrieve Phone number
					StringBuilder strPhoneNumber = new StringBuilder();
					
					strPhoneNumber.insert(3, "-");
					strPhoneNumber.insert(7, "-");
					patient.setPhoneNumber(strPhoneNumber.toString());
					break;
				case 15:
					// Retrieve Primary Language
					String[] arrayLanguage = arrayPID[15].split("\\^");
					if (arrayLanguage.length > 0) {
						for (int j = 0; j < arrayLanguage.length; j++) {
							switch (j) {
							case 1:
								patient.setPrimaryLanguage(arrayLanguage[j]);
								break;
							}
						}
					}
				case 16:
					// RETRIEVE MARITAL STATUS
					if (!arrayPID[i].isEmpty()) {
						patient.setMaritalStatus(arrayPID[i].charAt(0));
					}
					break;
				case 19:
					// Retrieve SSN
					StringBuilder str = new StringBuilder();
					str.insert(3, "-");
					str.insert(7, "-");
					patient.setSsn(str.toString());

					break;
				case 26:
					// Retrieve Citizenship
					patient.setCitizenship(arrayPID[i]);
					break;
				case 29:
					// RETRIEVE Date of Death
					try {
						if (!arrayPID[i].isEmpty()) {
							patient.setDod(StringToDate.convertStringToDate(arrayPID[i], "yyyymmdd"));
						}
					} catch (Exception ex) {
						System.out.println(ex);
					}
					break;

				case 30:
					// RETRIEVE PATIENT-DEATH-ID
					if (!arrayPID[i].isEmpty()) {
						if (arrayPID[i] == "NO") {
							patient.setPatientDeathInd(false);
						} else {
							patient.setPatientDeathInd(true);
						}
						patient.setPatientDeathInd(Boolean.parseBoolean(arrayPID[i]));
					}
					break;
				}
			}
			System.out.println(patient.getNumOfObjects());
		}
		return patient;


	}
}
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
					break;
				case 8:
//					 //RETRIVE SEX
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

								break;
							case 5:
								address.setCountry(arrayAddress[j]);
								break;
							}
						}
						patient.setAddress(address);
					}
					break;
				case 13:
					patient.setPhoneNumber(arrayPID[13]);
					break;
				case 15:
					// Retrieve Primary Language

					break;
				case 16:
////					 //RETRIEVE MERITAL STATUS

//					 break;
				case 19:
					// Retrieve SSN
					patient.setSsn(arrayPID[i]);
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

	public static void main(String[] args) {
		String[] arrayAddress = "115 MAINSTREET^^GOODTOWN^KY^42010^USA^L^010".split("\\^");
		System.out.println(Arrays.toString(arrayAddress));
	}

}
package PatientInfo;

import java.util.Date;
import java.text.SimpleDateFormat;

public class StringToDate {

	public static Date convertStringToDate(String s) throws Exception {
		Date date = new SimpleDateFormat("yyyymmdd").parse(s);
		return date;
	}
}

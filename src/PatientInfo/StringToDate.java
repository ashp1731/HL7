package PatientInfo;

import java.util.Date;
import java.text.SimpleDateFormat;

public class StringToDate {

	public static Date convertStringToDate(String s, String format) throws Exception {
		Date date = new SimpleDateFormat(format).parse(s);
		return date;
	}
}

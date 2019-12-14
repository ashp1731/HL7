package PatientInfo;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateFormat {

	public static Date convertStringToDate(String s, String format) throws Exception {
		Date date = new SimpleDateFormat(format).parse(s);
		return date;
	}

	public static String convertDateToString(Date date, String format) {
		String strDate = new SimpleDateFormat(format).format(date);
		return strDate;
	}

	public static void main(String[] args) {
		System.out.println(convertDateToString(new Date(), "MM/dd/yyyy"));
	}
}

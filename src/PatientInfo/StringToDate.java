package PatientInfo;

import java.util.Date;
import java.text.SimpleDateFormat;

public class StringToDate {

	public static Date convertStringToDate(String s, String format) throws Exception {
		Date date = new SimpleDateFormat(format).parse(s);
		String strDate = new SimpleDateFormat("MM/DD/YYYY").format(date);
		System.out.println(strDate);
		return date = new SimpleDateFormat("MM/DD/YYYY").parse(strDate);
	}

//	public static void main(String[] args) {
//		try {
//			System.out.println(convertStringToDate("19860131", "yyyymmdd"));
//		} catch (Exception ex) {
//			System.out.println(ex);
//		}
//
//	}
}

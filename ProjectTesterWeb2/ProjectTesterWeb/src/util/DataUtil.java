package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {

	public java.sql.Date ConverterData(String data) throws ParseException {

		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date parsed = format.parse(data);
		java.sql.Date sql = new java.sql.Date(parsed.getTime());

		return sql;

	}

}

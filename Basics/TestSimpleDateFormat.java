package in.co.Basics;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSimpleDateFormat {
	public static void main(String[] args) throws Exception {
		Date d = new Date();
		System.out.println(d);
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String str = format.format(d);
		System.out.println(str);
		String str1 = "1/07/2000";
		Date d1 = format.parse(str1);
		System.out.println(d1);

	}

}

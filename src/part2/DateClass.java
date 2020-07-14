package part2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {
	public static void main(String[] args) {
		// current date, time
		Date date = new Date(); // d
		System.out.println(date.toString());

		// mm/dd/yyyy hh:mm:ss
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy"); // sdf
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("hh:mm:ss"); // sd
		System.out.println(simpleDateFormat.format(date));
		System.out.println(simpleDateFormat2.format(date));
	}
}
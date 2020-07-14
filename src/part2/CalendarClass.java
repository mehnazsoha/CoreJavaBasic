package part2;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarClass {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(calendar.get(Calendar.AM_PM));
		System.out.println(calendar.get(Calendar.MILLISECOND));

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss"); // sd
		System.out.println(simpleDateFormat.format(calendar.getTime()));
	}
}

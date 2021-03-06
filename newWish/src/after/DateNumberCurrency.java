package after;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateNumberCurrency {

	static Date dateObj,dateObj2;
	static Calendar calendarObj;
	static Locale localObj;
	
	static DateFormat dateFormat;
	static NumberFormat numberFormat;
	
	static LocalDate localDate;
	static DateTimeFormatter dateTimeFormatter;
	
	public static void main(String[] args) {

		dateObj = new Date();
		System.out.println("DateObj: "+dateObj);
		System.out.println("DateObj: "+dateObj.toString());
		
		calendarObj = Calendar.getInstance();
	//	System.out.println("CalendarObj: "+calendarObj);
	//	System.out.println("CalendarObj: "+calendarObj.toString());
		System.out.println("CalendarObj: "+calendarObj.getTime().toString());
		
		//Adding 30 days to calendar
		calendarObj.add(Calendar.DATE, 30);
		dateObj=calendarObj.getTime();
		System.out.println("CalendarObj: "+dateObj.toString());
		
		//Adding 2 year in current Date
		calendarObj.add(Calendar.YEAR,2);
		System.out.println("CalendarObj: "+calendarObj.getTime().toString());
		System.out.println("CalendarObj: "+new Date(calendarObj.getTimeInMillis()));
		
		
		localObj = new Locale("en","US");
	//	localObj = new Locale("hi","IN");
		calendarObj = Calendar.getInstance(localObj);
		System.out.println("LocaleObj: "+localObj);
		System.out.println("LocaleObj: "+calendarObj.getTime().toString());
		
		calendarObj = null;
		dateObj = null;
		localObj = null;
		
		//DateFormat
		dateFormat = DateFormat.getDateTimeInstance();
		System.out.println("DateFormat: "+dateFormat.format(Calendar.getInstance().getTime()));
		
		//NumberForamt
		numberFormat = NumberFormat.getCurrencyInstance(new Locale("en","US"));
		System.out.println("NumberFormat: "+numberFormat.format(123));
		System.out.println();
		
		//Comparision
		calendarObj = Calendar.getInstance();
		dateObj = calendarObj.getTime();
		System.out.println(dateObj);
		
		calendarObj = Calendar.getInstance();
		calendarObj.add(Calendar.DATE, 30);
		dateObj2 = calendarObj.getTime();
		System.out.println(dateObj2);
		int check = dateObj.compareTo(dateObj2);
		System.out.println("CompareTo: "+check);
		
		if(check == 0)
			System.out.println("Equals");
		else if(check > 0)
			System.out.println("Greater");
		else
			System.out.println("Lesser");
		System.out.println();
		
		//equal,after,before
		System.out.println("Before: "+dateObj.before(dateObj2));
		System.out.println("Equals: "+dateObj.equals(dateObj2));
		System.out.println("After: "+dateObj.after(dateObj2));
		System.out.println();
		
		//Using longMilliseconds
		System.out.println("LongMilliseconds");
		long date1=Calendar.getInstance().getTimeInMillis();
		calendarObj = Calendar.getInstance();
		calendarObj.add(Calendar.DATE, 30);
		dateObj2 = calendarObj.getTime();
		long date2=dateObj2.getTime();
		
		
		if(date1 == date2)
			System.out.println("Equals");
		else if(date1 > date2)
			System.out.println("Greater");
		else
			System.out.println("Lesser");
		System.out.println();
		
		//LocalDate
		localDate = LocalDate.now();
		dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		System.out.println("LocalDate Today: "+localDate.format(dateTimeFormatter));
		System.out.println("LocalDate Today: "+localDate);
		System.out.println("LocalDate Before: "+localDate.minusDays(1));
		System.out.println("LocalDate After: "+localDate.plusDays(1));
		System.out.println("LocalDate Minus: "+localDate.minus(1,ChronoUnit.MONTHS));
		System.out.println("LocalDate Plus: "+localDate.plus(1,ChronoUnit.MONTHS));
		System.out.println("LocalDate Time: "+localDate.atTime(1,50,9));
		System.out.println("LocalDate CompareTo: "+localDate.compareTo(localDate.plusDays(1)));
		System.out.println("LocalDate CompareTo: "+localDate.compareTo(localDate.minusDays(1)));
		System.out.println("LocalDate CompareTo: "+localDate.compareTo(localDate));
		System.out.println("LocalDate Equal: "+localDate.equals(localDate));
		System.out.println("LocalDate Equal: "+localDate.equals(localDate.plusDays(1)));
		System.out.println("LocalDate getDayOfMonth(): "+localDate.getDayOfMonth());
		System.out.println("LocalDate getYear(): "+localDate.getYear());
		System.out.println("LocalDate getDayOfYear(): "+localDate.getDayOfYear());
		System.out.println("LocalDate isAfter: "+localDate.isAfter(localDate.plusDays(1)));
		System.out.println("LocalDate isBefore: "+localDate.isBefore(localDate.plusDays(1)));
		System.out.println("LocalDate isEqual: "+localDate.isEqual(localDate));
		System.out.println("LocalDate isLeap: "+localDate.isLeapYear());
		System.out.println("LocalDate lengthOfMonth: "+localDate.lengthOfMonth());
		System.out.println("LocalDate lengthOfYear: "+localDate.lengthOfYear());
		
	}
	
}

package CoreJava;

import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;

public class DateFormating {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Date d1 = new Date();
		
		System.out.println(""+d1.getDate());

		DateFormat df = DateFormat.getDateInstance();
		
		System.out.println("only date "+df.format(d1));
		
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL);
		
		System.out.println("only full date = " + df2.format(d1));
		
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, Locale.FRANCE);
		
		System.out.println("only full date = " + df3.format(d1));
		
		DateFormat tf1 = DateFormat.getTimeInstance();

		System.out.println("default time = " + tf1.format(d1));
		
		DateFormat tf2 = DateFormat.getTimeInstance(DateFormat.SHORT);

		System.out.println("short time = " + tf2.format(d1));
		
		DateFormat dtf1 = DateFormat.getDateTimeInstance();
		DateFormat dtf2 = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT);
		DateFormat dtf3 = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.SHORT, Locale.GERMANY);

		System.out.println("both eg 1= " + dtf1.format(d1));
		System.out.println("both eg 2= " + dtf2.format(d1));
		System.out.println("both eg 3= " + dtf3.format(d1));
	}

	}
	

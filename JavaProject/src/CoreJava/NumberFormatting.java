package CoreJava;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NumberFormat nf = NumberFormat.getInstance();
		
		System.out.println("simple formating "+nf.format(2255));
		
		NumberFormat n1 = NumberFormat.getCurrencyInstance(Locale.FRANCE); 
		
		System.out.println("Currency Formatting "+nf.format(250000));
				
	NumberFormat pf1 = NumberFormat.getPercentInstance();
		
		System.out.println("percentage = " + pf1.format(0.25));
		
		DecimalFormat df1 = new DecimalFormat("#,##.00000");
		System.out.println("custom pattern = " + df1.format(85000000));
		
		DecimalFormat df2 = new DecimalFormat(",#.####");
		System.out.println("custom pattern 2= " + df2.format(85000000.92132));
		
	}

}

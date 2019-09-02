package CoreJava;

import java.util.Locale;
import java.util.ResourceBundle;

public class TextFormatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.UK);
		
		ResourceBundle rb1 = ResourceBundle.getBundle("MessageBundle");
		
		System.out.println("msg1 = " + rb1.getString("msg1"));
		System.out.println("msg2 = " + rb1.getString("msg2"));
		
		

	}

}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.Object;
import java.util.Locale;
import java.text.NumberFormat;

public class CurrencyFormatter{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
         String currency = NumberFormat.getCurrencyInstance().format(payment);

// NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US); 
//  String currency = NumberFormat.getInstance().format(payment);  
        // String currency=formatter.format(dbl);    
        
        // Locale us = Locale.US;
        // Locale india = Locale.ENGLISH;
        // Locale china = Locale.CHINA;
        // Locale france = Locale.FRANCE;
        //  double india = Locale.UNICODE_LOCALE_EXTENSION;
        //  double china = Locale.UNICODE_LOCALE_EXTENSION;
        //  double france = Locale.UNICODE_LOCALE_EXTENSION;
        // Write your code here.
        String u = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String i = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);
        String c = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String f = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        
        System.out.println("US:" + " "+ u);
        System.out.println("India:"+ " "+ i );
        System.out.println("China: "+ " "+ c);
        System.out.println("France: "+ " "+ f);
    }
}

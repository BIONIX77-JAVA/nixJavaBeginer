/* no for use - lot of useless code, especially format. - code work without it.
 possible to use transfer methods: TransferTemperature.convertFahrenheitToCelsius and  TransferTemperature.convertCelsiusToFahrenheit
 (code in double format)*/

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Scanner;

public class TransferTemperature {
    public static void main(String[] args) throws ParseException {

        System.out.println("Enter temperature in Fahrenheit");
        Scanner sc = new Scanner(System.in);
        double tempr = sc.nextDouble();
        DecimalFormat f = new DecimalFormat("##.00");
        String doubleTempr = f.format(convertFahrenheitToCelsius(tempr));
        double finalCelsius = (Double) f.parse(doubleTempr);

        System.out.println("Temperature is: \n In Fahrenheit - " + tempr + "\n In Celsius  - " + finalCelsius);

        System.out.println("Lets check result. Enter temperature in Celsius you get");
        double tempr1 = sc.nextDouble();
        DecimalFormat c = new DecimalFormat("##.00");
        String doubleTempr1 = c.format(convertCelsiusToFahrenheit(tempr1));

        if (finalCelsius == tempr1) {
            System.out.println("Temperature is: \n In Celsius - " + tempr1 + "\n In Fahrenheit - " + doubleTempr1);
        } else {
            System.out.println("Something wrong in you entering. Try again");
        }
    }

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double TC = (fahrenheit - 32.0) / 1.8;
        return TC;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        double TF = (9.0 / 5.0) * celsius + 32.0;
        return TF;
    }
}
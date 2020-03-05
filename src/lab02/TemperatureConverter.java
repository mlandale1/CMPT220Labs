package lab02;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args){
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //variables
        double metric;
        double degrees;
        double fahrenheit;
        double celsius;

        //Prompt user to input numbers for degrees in Fahrenheit or Celsius and metrics
        System.out.print("Enter number of degrees in either Fahrenheit or Celsius to convert: ");
        String user_entry = input.next().toLowerCase();
        metric = user_entry.charAt(user_entry.length()-1);
        degrees = Double.parseDouble(user_entry.substring(0, user_entry.length()-1));

        //Calculates the conversion based off the temperatures metric, then outputs the results
        if(metric == 'f'){
            celsius = (5.0/9) * (degrees-32);
            System.out.println(celsius + "C");
        }else {
            fahrenheit = (9.0/5) * degrees + 32;
            System.out.println(fahrenheit + "F");
        }
    }
}

package lab02;

import java.util.Scanner;

public class InchestoMeters {
    /**
     * Main method to test implementation for the convert method.
     * @param args command line arguments
     */
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter inches
        System.out.println("Enter a number for inches: ");
        double inches = input.nextDouble();

        //Compute Inches to Meters
        double METERS_PER_INCH = inches * 0.0254;

        //Display Results
        System.out.println("The conversion from inches to meters is: " + inches + " inches " + " is " + METERS_PER_INCH + " meters ");
    }

}

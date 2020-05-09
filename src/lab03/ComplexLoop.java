package lab03;

import java.util.Scanner;

public class ComplexLoop {
    public static void main(String[] args) {

        //Create Scanner Object
        Scanner input = new Scanner(System.in);
        System.out.print("Input the deposit amount: ");
        double deposit = input.nextDouble();
        System.out.print("Input the annual percentage yield: ");
        double apy = input.nextDouble();
        System.out.print("Input number of months: ");
        int maturity = input.nextInt();

        System.out.println();

        for (int i = 0; i <= maturity; i++){
            System.out.println(deposit * (apy / 1000 * maturity) + deposit);
        }

    }

}

package java_training.pptwo;

import java.util.Scanner;
public class PrintMonetaryValue_PP2_9 {
    public static void main (String[] args){
        double amount;
        int ten, five, one, quarter, dime, nickel, penny;

        System.out.println("Enter total amount:");
        Scanner scan = new Scanner(System.in);
        amount = scan.nextDouble();

        ten = (int) amount / 10;
        amount -= ten * 10.0;

        five = (int) amount / 5;
        amount -= five * 5.0;

        one = (int) amount;
        amount -= one * 1.0;

        quarter = (int) (amount / 0.25d);
        amount -= quarter * 0.25;

        dime = (int) (amount / 0.1d);
        amount -= dime * 0.1;

        nickel = (int) (amount / 0.05d);
        amount -= nickel * 0.05;

        penny = (int) (amount / 0.01d);

        System.out.println(ten + " ten dollar bills");
        System.out.println(five + " five dollar bills");
        System.out.println(one + " one dollar bills");
        System.out.println(quarter + " quarters");
        System.out.println(dime + " dimes");
        System.out.println(nickel + " nickels");
        System.out.println(penny + " pennies");

    }
}

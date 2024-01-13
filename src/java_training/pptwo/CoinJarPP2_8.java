package java_training.pptwo;

import java.util.Scanner;
public class CoinJarPP2_8 {
    public static void main(String[] args){
        int quarters, dimes, nickels, pennies, dollars, cents, totalCents;;

        System.out.println("Enter number of quarters:");
        Scanner scanQ = new Scanner(System.in);
        quarters = scanQ.nextInt();

        System.out.println("Enter number of dimes:");
        Scanner scanD = new Scanner(System.in);
        dimes = scanD.nextInt();

        System.out.println("Enter number of nickels:");
        Scanner scanN = new Scanner(System.in);
        nickels = scanN.nextInt();

        System.out.println("Enter number of pennies:");
        Scanner scanP = new Scanner(System.in);
        pennies = scanP.nextInt();

        totalCents = quarters * 25 + dimes * 10 + nickels * 5 + pennies * 1;

        dollars = totalCents / 100;
        cents = totalCents - dollars * 100;

        System.out.println(dollars + " dollars and " + cents + " cents.");
    }
}

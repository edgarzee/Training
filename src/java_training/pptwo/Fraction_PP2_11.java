package java_training.pptwo;

import java.util.Scanner;
public class Fraction_PP2_11 {
    public static void main(String[] args){

        int numerator, denominator;
        double fraction;

        System.out.println("Enter numerator:");
        Scanner scanNum = new Scanner(System.in);
        numerator = scanNum.nextInt();

        System.out.println("Enter denominator:");
        Scanner scanDen = new Scanner(System.in);
        denominator = scanDen.nextInt();

        fraction = (double) numerator / denominator;

        System.out.println("Fraction value is: " + fraction);
    }
}

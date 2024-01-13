package java_training.pptwo;

import java.util.Scanner;
public class PP2_5_MilesToKilometers {
    public static void main(String[] args){
        double miles, kilometers;
        final double CONVERSION_RATE = 1.60935;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter miles value with a floating point:");
        miles = scan.nextDouble();

        kilometers = miles * CONVERSION_RATE;

        System.out.println("Miles entered: " + miles);
        System.out.println("Kilometers equivalent: " + kilometers);
    }
}

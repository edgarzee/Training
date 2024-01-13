package java_training.pptwo;

import java.util.Scanner;
public class TempConverter_PP2_4 {
    public static void main(String[] args){
        final int BASE = 32;
        final double CONVERSION_FACTOR = 9.0 / 5.0;

        double fahrenheitTemp;
        int celsiusTemp;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Celsius Temperature:");
        celsiusTemp = scan.nextInt();

        fahrenheitTemp = celsiusTemp * CONVERSION_FACTOR + BASE;

        System.out.println("Celsius Temperature: " + celsiusTemp);
        System.out.println("Fahrenheit Equivalent: " + fahrenheitTemp);
    }
}

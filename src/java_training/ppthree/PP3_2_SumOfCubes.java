package java_training.ppthree;

import java.util.Scanner;

public class PP3_2_SumOfCubes {
    public static void main (String[] args){
        double num1, num2, sum;


        System.out.println("Enter side of the first cube:");
        Scanner scan1 = new Scanner(System.in);
        num1 = scan1.nextInt();
        num1 = (double) num1;

        System.out.println("Enter side of the second cube:");
        Scanner scan2 = new Scanner(System.in);
        num2 = scan2.nextInt();

        sum = Math.pow(num1, 3) + Math.pow(num2, 3);

        System.out.println("Sum of two cubes is " + sum);
    }
}

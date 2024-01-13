package java_training.ppfive;

import java.util.Scanner;

public class PP5_5 {
    public static void main (String[] args){

        int even = 0;
        int odd = 0;
        int zero = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int number = scanner.nextInt();
        //String str = Integer.toString(number);

        while (number > 0){
            int a = number % 10;
            number = number / 10;
            if (a == 0){
                zero += 1;
            } else if (a % 2 == 0){
                even += 1;
            } else{
                odd += 1;
            }
        }

        scanner.close();

        System.out.println("Evens: " + even);
        System.out.println("Odds: " + odd);
        System.out.println("Zeroes: " + zero);

    }
}

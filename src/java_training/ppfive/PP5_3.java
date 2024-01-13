package java_training.ppfive;

import java.util.Scanner;

public class PP5_3 {
    public static void main (String[] args){

        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer larger than 1: ");

        int input = scanner.nextInt();



        if (input < 2){
            System.out.println("Enter a value larger than 1.");
        } else {
            for (int i = 2; i <= input; i += 2){
                sum += i;
            }
            System.out.println(sum);
        }



    }
}

package java_training.ppseven;

import java.util.Scanner;

public class PP7_1 {

    //Design and implement an application that reads an arbitrary number of integers
    //that are in the range 0 to 50 inclusive and counts how many occurrences of each are entered.
    //After all input has been processed, print all of the values (with the number of occurrences)
    //that were entered one or more times.

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] integerOccurrences = new int[51]; //Indices from 0 to 50
        System.out.println("Enter an integer from -25 to 25 (inclusive):");
        System.out.println("Enter an integer outside of this range to exit.");

        int input = scan.nextInt();


        while(input >= -25 && input <= 25){
            //Adjust the indices to be in the range of 0 to 50
            int adjustedIndex = input + 25;
            integerOccurrences[adjustedIndex] += 1;
            System.out.println("Enter an integer from -25 to 25 (inclusive):");
            System.out.println("Enter an integer outside of this range to exit.");
            input = scan.nextInt();
        }

        scan.close();

        System.out.println("Values with the number of occurrences:");

        for (int i = 0; i < integerOccurrences.length; i++){
            //Adjust the index back to its original range [-25, 25]
            int originalIndex = i - 25;
            if (integerOccurrences[i] > 0){
                System.out.println(originalIndex + ": " + integerOccurrences[i] + " occurrence(s)");
            }
        }
    }
}

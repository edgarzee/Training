package java_training.ppseven;

import java.util.Scanner;

public class Histogram {

    //Write a program that creates a histogram that allows you to
    //visually inspect the score distribution of a set of students. The
    //program should prompt the user to enter an arbitrary number of
    //integers that are in the range 1 to 100 inclusive; then produce a
    //chart  that indicates how many students scored in the range 1 to 10,
    //11 to 20 and so on. Print one "*" for every 5 students in that range.

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers from 0 to 100 (inclusive):");
        System.out.println("Enter integers outside of this range to stop entering.");

        int input = scanner.nextInt();
        int[] scoreRanges = new int[10];

        while (input >= 1 && input <= 100){
            int rangeIndex = (input - 1) / 10;
            scoreRanges[rangeIndex]++;

            System.out.println("Enter integers from 0 to 100 (inclusive):");
            System.out.println("Enter integers outside of this range to stop entering.");

            input = scanner.nextInt();
        }
        scanner.close();

        for(int i = 0; i < scoreRanges.length; i++){
            int lowerBound = i * 10 + 1;
            int upperBound = i * 10 + 10;
            System.out.printf("%2d - %3d | ", lowerBound, upperBound);

            for (int j = 0; j < scoreRanges[i]/5; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

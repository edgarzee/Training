package java_training.ppfive;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

            final int SENTINEL = -1;




            // Create a Scanner object to read input from the user
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to quit
            System.out.println("Enter -1 to quit or");

            // Prompt the user to enter a year
            System.out.print("Enter a year: ");

            // Read the year input from the user
            int year = scanner.nextInt();



            // Check if the entered year is a leap year

            while (year != SENTINEL) {
                if (year < 1582) {
                    System.out.println("Too early for Gregorian calendar. Enter 1582 or a later date.");
                } else {
                    if (isLeapYear(year)) {
                        System.out.println(year + " is a leap year.");
                    } else {
                        System.out.println(year + " is not a leap year.");
                    }
                }

                System.out.print("Enter another year: ");
                year = scanner.nextInt();
            }


            System.out.print("Program is terminated.");

            // Close the scanner to avoid resource leak
            scanner.close();
        }



        // Function to check if a year is a leap year
        private static boolean isLeapYear(int year) {
            // Leap year if divisible by 4
            if (year % 4 != 0) {
                return false;
            }

            // Not a leap year if divisible by 100 but not 400
            if (year % 100 == 0 && year % 400 != 0) {
                return false;
            }

            // Leap year
            return true;
        }
    }
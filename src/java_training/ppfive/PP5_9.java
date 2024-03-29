package java_training.ppfive;

import java.util.Scanner;

public class PP5_9 {
    public static void main (String[] args){
        String str, another = "y";
        int left, right;

        Scanner scan = new Scanner(System.in);

        while (another.equalsIgnoreCase("y")) // allows y or Y
        {
            System.out.println("Enter a potential palindrome:");
            str = scan.nextLine();

            String clean = str.toLowerCase().replaceAll("\\s", "");


            left = 0;
            right = clean.length() - 1;


            while (clean.charAt(left) == clean.charAt(right) && left < right){
                left++;
                right--;
            }

            System.out.println();

            if (left < right)
                System.out.println("That string is NOT a palindrome.");
            else
                System.out.println("That string IS a palindrome.");

            System.out.println();
            System.out.print("Test another palindrome (y/n)? ");
            another = scan.nextLine();
        }
    }
}

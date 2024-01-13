package java_training.ppfive;

import java.util.Scanner;

public class PP5_7 {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of verses: ");

        int verses = scanner.nextInt();

        if (verses > 0) {
            for (int i = 100; i > 100 - verses; i--) {
                System.out.println(i + " bottles of beer on the wall");
                System.out.println(i + " bottles of beer");
                System.out.println("If one of those bottles should happen to fall");
                System.out.println(i-1 + " bottles of beer on the wall");
            }
        } else{
                System.out.println("Restart and enter a value larger than 0.");
        }
    }
}


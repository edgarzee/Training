package java_training.ppten;

import java.util.Scanner;

public class StringInputProgram {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true){
            //read user strings until "DONE" is entered
            try{
                System.out.println("Enter a string (or enter 'DONE' to exit): ");
                String input = scanner.nextLine();

                //check if the user has entered "DONE"
                if(input.equalsIgnoreCase("DONE")){
                    break; //exit the loop if "DONE" is entered
                }

                if(input.length() > 20){
                    throw new StringTooLongException("String is too long, max 20 characters.");
                }

                System.out.println("Enter string: " + input);

            } catch(StringTooLongException e){
                System.out.println("Error: " + e.getMessage());
                System.out.println("Please enter a shorter string.");
            }
        }

        scanner.close();
        System.out.println("Program terminated successfully.");
    }
}

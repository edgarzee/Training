package java_training.ppthree;

import java.util.Scanner;
import java.util.Random;

public class UsernameGenerator_PP3_1 {
    public static void main (String[] args){
        String name, surname, username;
        int randomNumber;

        System.out.println("Enter your name:");
        Scanner scanName = new Scanner(System.in);
        name = scanName.next();
        name = name.toLowerCase();

        System.out.println("Enter your surname:");
        Scanner scanSurname = new Scanner(System.in);
        surname = scanSurname.next();
        surname = surname.toLowerCase();

        Random generator = new Random();
        randomNumber = generator.nextInt(90) + 10;

        if (surname.length() > 5) {
            System.out.println("Your username is: " + name.charAt(0) + surname.substring(0,5) + randomNumber);
        } else{
            System.out.println("Surname is too short");
            System.exit(0);
        }
    }
}

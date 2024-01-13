package java_training.ppfive;

import java.util.Scanner;

public class PP5_4 {
    public static void main (String[] args){

        String str;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");

        str = scanner.nextLine();

        for(char c : str.toCharArray()){
            System.out.println(c);
        }
        scanner.close();
    }
}

package java_training.ppfive;

import java.util.Scanner;

public class PPNew5_5 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");

        String inputString = scanner.nextLine();

        String resultString = changeCase(inputString);

        System.out.println("Result: " + resultString);

        scanner.close();
    }

    private static String changeCase(String input){
        char[] charArray = input.toCharArray();

        for(int i = 0; i < charArray.length; i++){
            char currentChar = charArray[i];
            if(Character.isLowerCase(currentChar)){
                charArray[i] = Character.toUpperCase(currentChar);
            } else if(Character.isUpperCase(currentChar)){
                charArray[i] = Character.toLowerCase(currentChar);
            }
        }
        return new String(charArray);
    }
}

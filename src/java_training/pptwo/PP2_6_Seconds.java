package java_training.pptwo;

import java.util.Scanner;
public class PP2_6_Seconds {
    public static void main(String[] args){
        int hours, minutes, seconds, totalSeconds;



        System.out.println("Enter hours:");
        Scanner scanHours = new Scanner(System.in);
        hours = scanHours.nextInt();

        System.out.println("Enter minutes:");
        Scanner scanMinutes = new Scanner(System.in);
        minutes = scanMinutes.nextInt();

        System.out.println("Enter seconds:");
        Scanner scanSeconds = new Scanner(System.in);
        seconds = scanSeconds.nextInt();

        totalSeconds = hours * 60 * 60 + minutes * 60 + seconds;

        System.out.println("Total time in seconds: " + totalSeconds);
    }
}

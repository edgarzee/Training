package java_training.pptwo;

import java.util.Scanner;
public class PP2_7_ReverseSeconds {
    public static void main(String[] args){
        int totalSeconds, hours, minutes, seconds;

        System.out.println("Enter seconds value:");
        Scanner scan = new Scanner(System.in);
        totalSeconds = scan.nextInt();

        hours = totalSeconds / 3600;
        minutes = (totalSeconds - hours * 3600) / 60;
        seconds = totalSeconds - hours * 3600 - minutes * 60;

        System.out.println(totalSeconds + " seconds are divided into " + hours + " hours, " + minutes + " minutes and " + seconds + " seconds.");
    }
}

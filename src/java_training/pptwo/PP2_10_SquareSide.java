package java_training.pptwo;

import java.util.Scanner;
public class PP2_10_SquareSide {
    public static void main (String[] args){
        int length, perimeter, area;

        System.out.println("Enter square's length:");
        Scanner scan = new Scanner(System.in);
        length = scan.nextInt();

        perimeter = 4 * length;
        area = length * length;

        System.out.println("Square's area: " + area + " , square's perimeter: " + perimeter + ".");
    }
}

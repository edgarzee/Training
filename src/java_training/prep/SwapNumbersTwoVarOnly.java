package java_training.prep;

public class SwapNumbersTwoVarOnly {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 20;

        System.out.println("Before swap:");
        System.out.println("First number is: " + num1);
        System.out.println("Second number is: " + num2);

        num2 = num1 + num2;
        num1 = num2 - num1;
        num2 = num2 - num1;

        System.out.println("After swap:");
        System.out.println("First number is: " + num1);
        System.out.println("Second number is: " + num2);
    }
}

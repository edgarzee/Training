package java_training.prep;

public class SwapNumbers {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 20;
        int temp;

        System.out.println("Before swap:");
        System.out.println("First Number is: " + num1);
        System.out.println("Second Number is: " + num2);

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swap:");
        System.out.println("First Number is: " + num1);
        System.out.println("Second Number is: " + num2);
    }
}

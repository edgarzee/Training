package java_training.ppfive;

public class PP5_6 {
    public static void main (String[] args){
        System.out.println("Multiplication table through 1 to 12 multiplied by themselves: ");

        final int MAX = 12;

        for (int i = 1; i <= MAX; i++){
            int product = i * i;
            System.out.println(i + " * " + i + " = " + product);
        }
    }
}

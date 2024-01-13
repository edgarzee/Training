package java_training.prep;

import java.util.List;



public class OddNumbers {
    public static boolean containsOnlyOddNumbers(List<Integer> numbers){
        for (int num : numbers){
            if (num % 2 == 0){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> numberList = List.of(3,7,13,19,23);
        boolean containsOnlyOdd = containsOnlyOddNumbers(numberList);

        if (containsOnlyOdd){
            System.out.println("The list contains only odd numbers.");
        } else {
            System.out.println("The list contains at least one even number.");
        }
    }
}


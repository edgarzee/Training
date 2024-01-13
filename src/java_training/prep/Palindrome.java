package java_training.prep;

public class Palindrome {
    static boolean checkPalindromeString(String input){
        boolean result = true;
        input = input.toLowerCase();
        int length = input.length();

        for (int i = 0; i < length/2; i++) {
            if(input.charAt(i) != input.charAt(length - i -1)){
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args){
        String input = "Racecar";
        if (checkPalindromeString(input)){
            System.out.println(input +  " is a palindrome.");
        } else {
            System.out.println(input +  " is not a palindrome.");
        }
    }
}

package java_training.prep;

public class StringVowels {
    public static void main(String[] args){
        System.out.println(stringContainsVowels("Hello"));
        System.out.println(stringContainsVowels("TV"));
    }

    public static boolean stringContainsVowels(String input){
        return input.toLowerCase().matches(".*[aeoui].*");
    }
}

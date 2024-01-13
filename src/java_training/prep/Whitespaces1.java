package java_training.prep;

public class Whitespaces1 {
    public static void main(String[] args){
        String input = "Remove all white spaces.";

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' '){
                output.append(input.charAt(i));
            }
        }

        System.out.println(output);
    }

}

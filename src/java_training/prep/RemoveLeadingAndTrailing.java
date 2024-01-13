package java_training.prep;

public class RemoveLeadingAndTrailing {
    public static void main(String[] args){
        String input = " abc def/tq|d.  ";
        input = input.strip();


    System.out.println("Trimmed: \"" + input + "\"");
    }
}

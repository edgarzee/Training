package java_training.ppseven;

public class VariableParameters {
    public static void main(String[] args){
        Family lewis = new Family ("John", "Sharon", "Justin", "Kayla");

        Family camden = new Family ("Stephen", "Annie", "Matt");

        System.out.println(lewis);
        System.out.println();
        System.out.println(camden);
    }
}

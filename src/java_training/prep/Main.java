package java_training.prep;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main (String[] args){
        ObjectClone originalObj = new ObjectClone(10);


        try{
            ObjectClone clonedObj = (ObjectClone) originalObj.clone();

            System.out.println("Original: " + originalObj.getValue());
            System.out.println("Cloned: " + clonedObj.getValue());

            clonedObj.setValue(20);

            System.out.println("Original after: " + originalObj.getValue());
            System.out.println("Cloned after: " + clonedObj.getValue());

        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
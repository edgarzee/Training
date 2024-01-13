package java_training.ppfour;

public class BoxTest {
    public static void main (String[] args){
        Box box1 = new Box(2, 2, 2);
        box1.setWidth(3);
        box1.setDepth(4);
        box1.setFull(true);

        System.out.println(box1);
    }
}

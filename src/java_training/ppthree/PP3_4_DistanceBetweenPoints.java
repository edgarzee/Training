package java_training.ppthree;

public class PP3_4_DistanceBetweenPoints {
    public static void main (String[] args){
        int x1 = 10;
        int y1 = 20;
        int x2 = 15;
        int y2 = 25;
        double d;

        d = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));

        System.out.println("Distance is " + d);
    }
}

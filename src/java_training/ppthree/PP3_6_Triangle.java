package java_training.ppthree;

import java.text.DecimalFormat;

public class PP3_6_Triangle {
    public static void main (String[] args){
        int a = 4;
        int b = 13;
        int c = 15;
        double s;
        double area;

        s = (double) 1 / 2 * (a + b + c);
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        DecimalFormat fmt = new DecimalFormat("0.###");

        System.out.println("Area is " + fmt.format(area));
    }
}

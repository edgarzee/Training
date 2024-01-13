package java_training.ppthree;

import java.text.DecimalFormat;

public class Sphere_PP3_5_ {
    public static void main(String[] args){
        int r = 2;
        double v, s;

        v = (double) 4 /3 * Math.PI * Math.pow(r,3);
        s = 4 * Math.PI * Math.pow(r,2);

        DecimalFormat fmt = new DecimalFormat("0.####");

        System.out.println("Volume: " + fmt.format(v));
        System.out.println("Surface Area: " + fmt.format(s));
    }
}

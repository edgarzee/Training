package java_training.ppfour;

public class MultiSphere {
    public static void main (String[] args){
        Sphere sphere1 = new Sphere(1);
        Sphere sphere2 = new Sphere(2);
        Sphere sphere3 = new Sphere(3);

        sphere1.setDiameter(5);

        sphere1.volume();
        sphere1.surfaceArea();
        sphere2.volume();
        sphere2.surfaceArea();
        sphere3.volume();
        sphere3.surfaceArea();

        System.out.println(sphere1);
        System.out.println(sphere2);
        System.out.println(sphere3);
    }
}

package java_training.ppeight;

public class ShapeManagement {
    public static void main(String[] args){
        Cube cube = new Cube(4);
        System.out.println("Cube:");
        System.out.println("Circumference: " + cube.getCircumference());
        System.out.println("Area: " + cube.getArea());
        System.out.println("Volume: " + cube.getVolume());

        Sphere sphere = new Sphere(5);
        System.out.println("Sphere:");
        System.out.println("Circumference: " + sphere.getCircumference());
        System.out.println("Area: " + sphere.getArea());
        System.out.println("Volume: " + sphere.getVolume());

        Cylinder cylinder = new Cylinder(6, 7);
        System.out.println("Cylinder:");
        System.out.println("Circumference: " + cylinder.getCircumference());
        System.out.println("Area: " + cylinder.getArea());
        System.out.println("Volume: " + cylinder.getVolume());
    }
}

package java_training.ppeight;

public class Cylinder extends Shape3D {
    private double height;
    private double radius;

    public Cylinder(double height, double radius){
        this.height = height;
        this.radius = radius;
    }

    @Override
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }


}

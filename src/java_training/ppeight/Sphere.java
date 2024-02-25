package java_training.ppeight;

public class Sphere extends Shape3D {
    private double radius;

    public Sphere(double radius){
        this.radius = radius;
    }

    @Override
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double getVolume() {
        return (4.0/3.0) * Math.PI * radius * radius * radius;
    }
}

package java_training.ppeight;

public class Cube extends Shape3D{
    private double side;

    public Cube(double side){
        this.side = side;
    }

    @Override
    public double getCircumference(){
        return 12 * side;
    }

    @Override
    public double getArea(){
        return 6 * side * side;
    }

    @Override
    public double getVolume(){
        return side * side * side;
    }
}

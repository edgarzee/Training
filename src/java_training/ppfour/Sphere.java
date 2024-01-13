package java_training.ppfour;

public class Sphere {
    private int diameter;
    private double volume, surfaceArea;

    public Sphere (int value){
        diameter = value;
    }

    public int getDiameter(){
        return diameter;
    }

    public void setDiameter (int value){
        diameter = value;
    }

    public double volume (){

        volume = (double) 4 /3 * Math.PI * Math.pow((double) diameter / 2, 3);

        return volume;
    }


    public double surfaceArea (){

        surfaceArea = 4 * Math.PI * Math.pow((double) diameter / 2, 2);

        return surfaceArea;
    }

    public String toString(){
        return "The sphere of " + diameter + " diameter has a volume of " +
                 + volume + " and a surface area of " + surfaceArea;
    }
}

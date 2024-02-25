package java_training.ppeight;

public class MonetaryCoin extends Coin {
    private int value;

    public MonetaryCoin(int value){
        this.value = value;
        flip();
    }

    public int getValue(){
        return value;
    }

    public static void main (String[] args){
        MonetaryCoin coin1 = new MonetaryCoin(5); //5p coin
        MonetaryCoin coin2 = new MonetaryCoin(10); //10p coin
        MonetaryCoin coin3 = new MonetaryCoin(20); //20p coin

        int sum = coin1.getValue() + coin2.getValue() + coin3.getValue();
        System.out.println("Total value: " + sum + " pence.");

        System.out.println("Flipping coin 1: " + coin1);
        System.out.println("Flipping coin 2: " + coin2);
        System.out.println("Flipping coin 3: " + coin3);
    }
}

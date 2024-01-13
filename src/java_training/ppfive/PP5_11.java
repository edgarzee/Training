package java_training.ppfive;

public class PP5_11 {
    public static void main (String[] args){
        Coin myCoin = new Coin();

        myCoin.flip();

        System.out.print(myCoin);

        if (myCoin.isHeads())
            System.out.println("You win.");
        else
            System.out.println("Better luck next time.");
    }
}

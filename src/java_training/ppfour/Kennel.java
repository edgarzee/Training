package java_training.ppfour;

public class Kennel {
    public static void main (String[] args){
        Dog dog1 = new Dog("Asdf", 10);
        Dog dog2 = new Dog("Zxcv", 7);
        Dog dog3 = new Dog("Qwer", 3);

        dog2.setName("Xcvb");
        dog3.setAge(4);

        dog1.personYears();
        dog2.personYears();
        dog3.personYears();

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
    }
}

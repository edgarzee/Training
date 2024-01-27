package java_training.ppsix;

public class StudentBody {
    public static void main(String[] args){
        Address school = new Address("800 Lancaster Ave.", "Villanova", "PA", 19085);
        Address jHome = new Address("21 Jump Street", "Lynchburg", "VA", 24551);
        Student john = new Student ("John", "Smith", jHome, school);
        Address mHome = new Address("123 Main Street", "Euclid", "OH", 44132);
        Student marsha = new Student ("Marsha", "Jones", mHome, school);

        john.setTestScore(1, 99);
        john.setTestScore(2, 98);
        john.setTestScore(3, 95);
        john.average();


        marsha.setTestScore(1, 50);
        marsha.setTestScore(2, 25);
        marsha.setTestScore(3, 40);
        marsha.average();

        System.out.println(john);
        System.out.println();
        System.out.println(marsha);
        System.out.println();
        System.out.println("John's 3rd test score is " + john.getTestScore(3));
    }
}

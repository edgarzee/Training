package java_training.ppeight;

public class Administrator extends Employee {
    public Administrator(String name) {
        super(name, "Administrator");
    }

    public void manageRecords() {
        System.out.println("Administrator " + super.name + " managing records.");
    }
}

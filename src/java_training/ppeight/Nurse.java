package java_training.ppeight;

public class Nurse extends Employee {
    public Nurse(String name) {
        super(name, "Nurse");
    }

    public void provideCare() {
        System.out.println("Nurse " + super.name + " providing care to patients.");
    }

    public void administerMedication() {
        System.out.println("Nurse " + super.name + " administering medication.");
    }
}

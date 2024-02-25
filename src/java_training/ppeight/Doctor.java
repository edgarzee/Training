package java_training.ppeight;

public class Doctor extends Employee {
    public Doctor(String name) {
        super(name, "Doctor");
    }

    public void diagnose() {
        System.out.println("Doctor " + super.name + " diagnosing patients.");
    }

    public void prescribeMedication() {
        System.out.println("Doctor " + super.name + " prescribing medication.");
    }
}

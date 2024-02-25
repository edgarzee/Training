package java_training.ppeight;

public class Employee {
    protected String name;
    protected String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void performDuties() {
        System.out.println(role + " " + name + " performing general duties.");
    }
}

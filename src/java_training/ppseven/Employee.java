package java_training.ppseven;

public class Employee {
    private String firstName;
    private String lastName;
    private int employeeID;
    private String designation;
    private String department;
    private int experience;
    private long phoneNumber;

    public Employee(String firstName, String lastName, int employeeID, String designation, String department, int experience, long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
        this.designation = designation;
        this.department = department;
        this.experience = experience;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return String.format("%-10s\t%-10s\t%-5d\t%-15s\t%-15s\t%-5d\t%-10d",
                firstName, lastName, employeeID, designation, department, experience, phoneNumber);
    }
}

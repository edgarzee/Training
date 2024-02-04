package java_training.ppseven;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define an ArrayList to store employee objects
        ArrayList<Employee> employeesList = new ArrayList<>();

        // Prompt user to enter employee information
        System.out.println("Enter employee information (up to 20 employees):");
        System.out.println("Format: FirstName LastName ID Designation Department Experience PhoneNumber");

        // Read input pairs until 20 or non-tab input is encountered
        while (employeesList.size() < 20 && scanner.hasNext()) {
            String firstName = scanner.next();
            String lastName = scanner.next();
            int employeeID = scanner.nextInt();
            String designation = scanner.next();
            String department = scanner.next();
            int experience = scanner.nextInt();
            long phoneNumber = scanner.nextLong();

            // Create an employee object and add it to the ArrayList
            employeesList.add(new Employee(firstName, lastName, employeeID, designation, department, experience, phoneNumber));
        }

        scanner.close();

        // Print the employee list
        System.out.println("\nEmployee List:");
        System.out.println("FirstName\tLastName\tID\tDesignation\tDepartment\tExperience\tPhoneNumber");

        for (Employee employee : employeesList) {
            System.out.println(employee);
        }
    }
}
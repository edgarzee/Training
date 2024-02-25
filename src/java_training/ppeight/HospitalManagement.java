package java_training.ppeight;

public class HospitalManagement {
    public static void main(String[] args) {
        // Instantiate and exercise several classes
        Doctor doctor = new Doctor("John");
        doctor.performDuties();
        doctor.diagnose();
        doctor.prescribeMedication();

        Nurse nurse = new Nurse("Alice");
        nurse.performDuties();
        nurse.provideCare();
        nurse.administerMedication();

        Administrator admin = new Administrator("Emily");
        admin.performDuties();
        admin.manageRecords();
    }
}

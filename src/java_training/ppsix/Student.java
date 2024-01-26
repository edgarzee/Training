package java_training.ppsix;

public class Student {
    private String firstName, lastName;
    private Address homeAddress, schoolAddress;

    private int test1, test2, test3;
    private double averageTestScore;

    //-----------------------------------------------------------------------------------
    //Constructor: Sets up this student with the specified values.
    //-----------------------------------------------------------------------------------

    public Student (String first, String last, Address home, Address school){
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        test1 = 0;
        test2 = 0;
        test3 = 0;
    }

    public void setTestScore (int testNumber, int testScore){
        switch (testNumber){
            case 1:
                test1 = testScore;
                break;

            case 2:
                test2 = testScore;
                break;

            case 3:
                test3 = testScore;
                break;

            default:
                return;
        }
    }

    public int getTestScore (int testNumber){
        switch (testNumber){
            case 1:
                return test1;

            case 2:
                return test2;

            case 3:
                return test3;

            default:
                return 0;
        }
    }

    public double average(){
        averageTestScore = (test1 + test2 + test3) / 3;
        return averageTestScore;
    }


    //-----------------------------------------------------------------------------------
    //Returns a string description of this Student object.
    //-----------------------------------------------------------------------------------

    public String toString(){
        String result;

        result = firstName + " " + lastName + "\n";
        result += "Home Address:\n" + homeAddress + "\n";
        result += "School Address:\n" + schoolAddress + "\n";
        result += "Test Scores:\n";
        result += "Test #1: " + test1 + "\n";
        result += "Test #2: " + test2 + "\n";
        result += "Test #3: " + test3 + "\n";
        result += "Average Score: " + averageTestScore;

        return result;
    }
}

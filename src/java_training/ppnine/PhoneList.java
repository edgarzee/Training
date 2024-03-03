package java_training.ppnine;

public class PhoneList {
    public static void main (String[] args){
        Contact[] friends = new Contact[4];

        friends[0] = new Contact("John", "Smith", "610-555-7384");
        friends[1] = new Contact("Sarah", "Barnes", "215-555-3827");
        friends[2] = new Contact("Mark", "Riley", "733-555-2969");
        friends[3] = new Contact("Laura", "Getz", "663-555-3984");

        Sorting.selectionSort(friends);

        for (Contact friend : friends){
            System.out.println(friend);
        }
    }
}

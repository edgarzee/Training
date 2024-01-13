package java_training.ppfour;

public class Dog {
    private String name;
    private int age, personYears;

    public Dog (String dogName, int dogAge){
        name = dogName;
        age = dogAge;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String newName){
        name = newName;
    }

    public void setAge(int newAge){
        age = newAge;
    }

    public int personYears(){
        personYears = age * 7;
        return personYears;
    }

    public String toString(){
        return "A dog named " + name + " is " + age + " years old and is " + personYears + " years old in \"person years\".";
    }
}

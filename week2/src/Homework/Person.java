package Homework;

public class Person {
    private String name;
    private String location;

    private String getName(){
        return this.name;
    }
    public void setName( String newName){
        this.name = newName;
    }

    private String getLocation(){
        return this.location;
    }
    public void setLocation(String newLocation){
        this.location = newLocation;
    }

    public Person(String name, String location){
        this.name = name;
        this.location = location;
    }

    public void printDetails(){
        System.out.println(getName() + ", " + getLocation());
    }

    public static void main(String[] args){
        Person person = new Person("John", "Birmingham");
        person.printDetails();

        person.setName("Mikey");
        person.setLocation("Hailsham");
        person.printDetails();
    }
}

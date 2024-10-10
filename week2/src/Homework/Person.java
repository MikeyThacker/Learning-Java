package Homework;

import static java.lang.Math.abs;

public class Person {
    private String name;
    private String location;

    private String getName(){
        return name;
    }
    public void setName( String newName){
        name = newName;
    }

    private String getLocation(){
        return location;
    }
    public void setLocation(String newLocation){
        location = newLocation;
    }

    public Person(String name, String location){
        this.name = name;
        this.location = location;
    }

    public void printDetails(){
        System.out.println(getName() + ", " + getLocation());
    }

    public double distanceTo(Person other) {
        return abs(this.location.length() - other.getLocation().length());
    }


    public static void main(String[] args){
        Person person = new Person("John", "Birmingham");
        person.printDetails();

        person.setName("Mikey");
        person.setLocation("Hailsham");
        person.printDetails();
    }
}

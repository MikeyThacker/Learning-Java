package Homework;

public class Places {
    public static void main(String[] args) {
        Person person1 = new Person("Mikey", "Hailsham");
        Person person2 = new Person("John", "Edgbaston");

        System.out.println(person1.distanceTo(person2));
    }
}

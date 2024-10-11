package Lab;

public class Places {
    public static void main(String[] args) {
        Location uni = new Location("University", 20.75, 5.25);
        System.out.println(uni);

        System.out.println(uni.getName() + ", " + uni.getX() + ", " + uni.getY());

        uni.setName("Uni");
        uni.setX(100.5);
        uni.setY(50.25);
        System.out.println(uni);

        uni.moveTo(4, 3);
        System.out.println("\n" + uni);

        Location halls = new Location("Halls", 0, 0);
        System.out.println(halls);
        System.out.println("Distance between: " + uni.distanceTo(halls));
    }
}

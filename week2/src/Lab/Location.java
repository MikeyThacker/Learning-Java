package Lab;

public class Location {
    private String name;
    private double x; //x coordinate
    private double y; //x coordinate

    // Constructor
    public Location(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return name + ": (" + x + ", " + y + ")";
    }

    public void moveTo(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Location location) {
        return Math.sqrt(Math.pow(this.x - location.getX(), 2) + Math.pow(this.y - location.getY(), 2));
    }

    // Get methods
    public String getName(){
        return name;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    // Set methods
    public void setName(String name) {
        this.name = name;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
}


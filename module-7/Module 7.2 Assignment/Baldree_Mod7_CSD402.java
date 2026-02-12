/**
 * Baldree_Mod6_CSD402
 * Alexander Baldree
 * CSD402
 * Assignment: Module 7 – UseFans
 * Description: This program builds upon the Module 6 Fan class.
 * It creates a collection of Fan objects and demonstrates methods
 * that accept both a single Fan instance and a collection of Fans.
 * Fan information is displayed without using the toString() method.
 */

import java.util.ArrayList;

public class Baldree_Mod7_CSD402 {

    /**
     * Method that takes a single Fan instance
     * and displays it WITHOUT using toString().
     */
    private static void displayFan(Fan fan) {

        System.out.println("Fan Details:");

        if (fan.isOn()) {
            System.out.println("Fan is ON");
            System.out.println("Speed: " + fan.getSpeed());
        } else {
            System.out.println("Fan is OFF");
        }

        System.out.println("Color: " + fan.getColor());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("---------------------------");
    }

    /**
     * Method that takes a collection of Fan instances
     * and displays each one.
     */
    private static void displayFanCollection(ArrayList<Fan> fans) {

        for (Fan fan : fans) {
            displayFan(fan);
        }
    }

    /**
     * Main method for testing the program.
     */
    public static void main(String[] args) {

        // Create a collection of Fan instances
        ArrayList<Fan> fanList = new ArrayList<>();

        // Create Fan objects
        Fan fan1 = new Fan(); // default constructor
        Fan fan2 = new Fan(Fan.FAST, true, 10, "blue");
        Fan fan3 = new Fan(Fan.MEDIUM, true, 8, "red");

        // Modify default fan using setters
        fan1.setOn(true);
        fan1.setSpeed(Fan.SLOW);
        fan1.setRadius(7);
        fan1.setColor("green");

        // Add fans to collection
        fanList.add(fan1);
        fanList.add(fan2);
        fanList.add(fan3);

        // Display all fans in collection
        displayFanCollection(fanList);
    }
}

/**
 * Fan class definition.
 */
class Fan {

    // Constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    /**
     * No-argument constructor.
     */
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "white";
    }

    /**
     * Argument constructor.
     */
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getter and Setter methods using 'this'

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * toString() remains in the class,
     * but is NOT used for displaying in this assignment.
     */
    @Override
    public String toString() {
        if (this.on) {
            return String.format("""
                    Fan is ON
                    Speed: %d
                    Color: %s
                    Radius: %s""",
                    this.speed, this.color, this.radius);
        } else {
            return String.format("""
                    Fan is OFF
                    Color: %s
                    Radius: %s""",
                    this.color, this.radius);
        }
    }
}

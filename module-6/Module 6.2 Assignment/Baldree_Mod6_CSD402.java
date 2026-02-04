/**
 * Class: Baldree_Mod6_CSD402
 * Author: Alexander Baldree
 * Course: CSD402
 * Assignment: Module 6.2 – Fan Class
 * Description: This program defines a Fan class with speed, on/off state,
 * radius, and color. It demonstrates constructors, getters/setters, constants,
 * and a toString() method.
 */

public class Baldree_Mod6_CSD402 {

    /**
     * Main method for testing the Fan class.
     */
    public static void main(String[] args) {

        // Create a fan using the default constructor
        Fan fan1 = new Fan();

        // Create a fan using the argument constructor
        Fan fan2 = new Fan(Fan.FAST, true, 10, "blue");

        // Display initial states
        System.out.println("Fan 1 (Default Constructor):");
        System.out.println(fan1.toString());
        System.out.println();

        System.out.println("Fan 2 (Argument Constructor):");
        System.out.println(fan2.toString());
        System.out.println();

        // Test setter methods
        fan1.setOn(true);
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setRadius(8);
        fan1.setColor("red");

        // Display updated state
        System.out.println("Fan 1 After Using Setters:");
        System.out.println(fan1.toString());
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
     * Sets all fields to their default values.
     */
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "white";
    }

    /**
     * Argument constructor.
     * @param speed the speed of the fan
     * @param on whether the fan is on or off
     * @param radius the radius of the fan
     * @param color the color of the fan
     */
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getter and Setter methods

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Returns a string description of the fan’s state.
     * @return description of the fan
     */
    @Override
    public String toString() {
        if (on) {
            return String.format("""
                    Fan is ON
                    Speed: %d
                    Color: %s
                    Radius: %s""", speed, color, radius);
        } else {
            return String.format("""
                    Fan is OFF
                    Color: %s
                    Radius: %s""", color, radius);
        }
    }
}

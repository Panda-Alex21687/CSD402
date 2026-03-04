/**
 * Division.java
 * Alexander Baldree
 * CSD402
 *
 * Abstract class representing a company division
 */

public abstract class Division {

    protected String divisionName;
    protected int accountNumber;

    // Constructor requiring both fields
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    // Abstract display method
    public abstract void display();
}
/**
 * DomesticDivision.java
 * Alexander Baldree
 * 3/4/2026
 * CSD402
 *
 * Subclass representing a domestic division
 */

public class DomesticDivision extends Division {

    private final String state;

    // Constructor requiring all fields
    public DomesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

    // Implement display method
    @Override
    public void display() {
        System.out.println("Domestic Division:");
        System.out.println("Division Name: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("State: " + state);
        System.out.println();
    }
}
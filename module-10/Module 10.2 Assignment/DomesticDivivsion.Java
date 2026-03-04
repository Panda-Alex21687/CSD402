/**
 * DomesticDivision.java
 * Alexander Baldree
 * CSD402
 *
 * Subclass representing a domestic division
 */

public class DomesticDivision extends Division {

    private String state;

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
/**
 * UseDivision.java
 * Alexander Baldree
 * CSD402
 *
 * Application to test Division subclasses
 */


public class UseDivision {

    public static void main(String[] args) {

        // Create International Divisions
        InternationalDivision intl1 = new InternationalDivision(
                "Global Sales", 1001, "Japan", "Japanese");

        InternationalDivision intl2 = new InternationalDivision(
                "European Marketing", 1002, "Germany", "German");

        // Create Domestic Divisions
        DomesticDivision dom1 = new DomesticDivision(
                "US Customer Service", 2001, "Texas");

        DomesticDivision dom2 = new DomesticDivision(
                "West Coast Operations", 2002, "California");

        // Display all divisions
        intl1.display();
        intl2.display();
        dom1.display();
        dom2.display();
    }
}
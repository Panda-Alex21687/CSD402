// The formula to use for this program is:
// Q = waterMass ( finalTemperature – initialTemperature ) x 4184
// waterMass is water weight in kilograms
// finalTemperature and initialTemperature are temperatures in Celsius
// Q is the result in Joules

import java.util.Scanner;

public class WaterHeatingCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for inputs
        System.out.print("Enter water mass in kilograms: ");
        double waterMass = scanner.nextDouble();

        System.out.print("Enter initial temperature in Celsius: ");
        double initialTemp = scanner.nextDouble();

        System.out.print("Enter final temperature in Celsius: ");
        double finalTemp = scanner.nextDouble();

        // Calculate Q
        double Q = waterMass * (finalTemp - initialTemp) * 4184;

        // Display result
        System.out.println("The energy required to heat the water is: " + Q + " Joules");

        scanner.close();
    }
}

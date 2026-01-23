/**
 * Name: Alexander Baldree
 * Course: CSD402
 * Module: Module 3.2 Assignment
 * Assignment: Nested Loops Pattern
 * Description: This program uses nested for loops to display a numeric
 * pattern where values double toward the center and then decrease,
 * followed by an @ symbol at the end of each line.
 */

public class Baldree_Mod3_CSD402 {

    public static void main(String[] args) {

        int rows = 7;

        for (int i = 0; i < rows; i++) {

            // Print leading spaces
            for (int space = 0; space < (rows - i - 1) * 2; space++) {
                System.out.print(" ");
            }

            // Print ascending powers of 2
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number *= 2;
            }

            // Print descending powers of 2
            number /= 4;
            for (int j = 0; j < i; j++) {
                System.out.print(number + " ");
                number /= 2;
            }

            // Print @ at the end of each line
            System.out.println("@");
        }
    }
}

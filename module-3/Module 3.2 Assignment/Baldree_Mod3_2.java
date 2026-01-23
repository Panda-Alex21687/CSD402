/**
 * Name: Alexander Baldree
 * Course: CSD402
 * Module: 3.2 Assignment
 * Assignment: Nested Loops Pattern
 * Description: This program uses nested for loops to display a numeric
 * pattern where values double toward the center and then decrease,
 * followed by an @ symbol at the end of each line.
 */

public class Baldree_Mod3_2 {

    public static void main(String[] args) {

        int rows = 7;
        int totalWidth = 50; // Fixed width for alignment

        for (int i = 0; i < rows; i++) {

            String line = "";

            // Leading spaces
            for (int space = 0; space < (rows - i - 1); space++) {
                line += "  ";
            }

            // Ascending powers of 2
            int number = 1;
            for (int j = 0; j <= i; j++) {
                line += number + " ";
                number *= 2;
            }

            // Descending powers of 2
            number /= 4;
            for (int j = 0; j < i; j++) {
                line += number + " ";
                number /= 2;
            }

            // Pad spaces so every line is the same length
            while (line.length() < totalWidth - 1) {
                line += " ";
            }

            // Add @ at the same position
            line += "@";

            System.out.println(line);
        }
    }
}
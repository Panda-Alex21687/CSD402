/**
 * Alexander Baldree
 * Baldree_Mod8_CSD402
 * 2/17/26
 * CSD402
 * Assignment: Module 8 – ArrayList Test
 *
 * Description:
 * This program uses an ArrayList to store Integer values
 * entered by the user. The user keeps entering numbers
 * until they enter 0, and that 0 is also saved in the list.
 *
 * After collecting the numbers, the ArrayList is passed
 * to a method named max that looks through the list and
 * finds the largest number. That value is then returned
 * and shown to the user.
 *
 * If the ArrayList happens to be empty, the method
 * simply returns 0. I also included test code to make
 * sure the method works correctly.
 */


import java.util.ArrayList;
import java.util.Scanner;

public class Baldree_Mod8_CSD402 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Integer> numbers = new ArrayList<>();

            System.out.println("Enter integers (enter 0 to stop):");

            Integer input;

            // Collect user input
            do {
                System.out.print("Enter number: ");
                input = scanner.nextInt();
                numbers.add(input); // 0 is also added
            } while (input != 0);

            // Call max method
            Integer largest = max(numbers);

            System.out.println("Largest value: " + largest);

            // Additional test (empty list)
            ArrayList<Integer> emptyList = new ArrayList<>();
            System.out.println("Largest value in empty list: " + max(emptyList));

            scanner.close();
        }
    }

    // Required method
    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }

        Integer largest = list.get(0);

        for (Object obj : list) {
            Integer value = (Integer) obj;
            if (value > largest) {
                largest = value;
            }
        }

        return largest;
    }
}

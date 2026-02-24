/**
 * Baldree_Mod9_Program1_CSD402
 * Alexander Baldree
 * 2/24/26
 * CSD402
 *
 * Description:
 * - Creates an ArrayList with 10+ Strings
 * - Prints the list using a for-each loop
 * - Asks the user which element they want to see again (by number)
 * - Uses try/catch to safely print the requested element
 * - If invalid, prints: "Exception thrown: Out of Bounds"
 * - Demonstrates Autoboxing/Auto-Unboxing with user's String input
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Baldree_Mod9_Program1_CSD402 {

    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();

        // Minimum of 10 Strings
        items.add("Alpha");
        items.add("Bravo");
        items.add("Charlie");
        items.add("Delta");
        items.add("Echo");
        items.add("Foxtrot");
        items.add("Golf");
        items.add("Hotel");
        items.add("India");
        items.add("Juliet");

        System.out.println("ArrayList Contents (for-each loop):");
        int count = 1;
        for (String item : items) {
            System.out.println(count + ". " + item);
            count++;
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nWhich element would you like to see again? (Enter a number 1-" + items.size() + "): ");
        String userInput = scanner.nextLine(); // user's String input

        try {
            // Convert String -> int, then demonstrate autoboxing
            Integer choice = Integer.parseInt(userInput); // autoboxing into Integer
            int index = choice - 1; // auto-unboxing Integer -> int

            // Try printing the chosen element (this may throw IndexOutOfBoundsException)
            System.out.println("You selected: " + items.get(index));
        } catch (NumberFormatException e) {
            System.out.println("Exception thrown: Out of Bounds");
            System.out.println("(Input was not a valid number.)");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown: Out of Bounds");
        }

        scanner.close();
    }
}
/**
 * Name: Alexander Baldree
 * Course: CSD402
 * Module: Module 2.2 Assignment
 * Assignment: Rock-Paper-Scissors
 * Description: This program simulates the game Rock-Paper-Scissors.
 * It randomly generates a number for the computer (1-3), prompts the user
 * to enter a number (1-3), displays both choices, and shows the result.
*/ 

import java.util.Scanner;
import java.util.Random;

public class Baldree_Mod2_CSD402 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Generate computer choice (1 = Rock, 2 = Paper, 3 = Scissors)
        int computerChoice = rand.nextInt(3) + 1;

        // Prompt user for input
        System.out.println("Rock-Paper-Scissors Game!");
        System.out.println("Enter your choice:");
        System.out.println("1 = Rock");
        System.out.println("2 = Paper");
        System.out.println("3 = Scissors");
        System.out.print("Your choice: ");
        int userChoice = input.nextInt();

        // Convert numbers to words
        String computerMove = getMoveName(computerChoice);
        String userMove = getMoveName(userChoice);

        // Display choices
        System.out.println("\nComputer chose: " + computerMove);
        System.out.println("You chose: " + userMove);

        // Determine and display result
        if (computerChoice == userChoice) {
            System.out.println("Result: It's a tie!");
        } else if (
            (userChoice == 1 && computerChoice == 3) ||
            (userChoice == 2 && computerChoice == 1) ||
            (userChoice == 3 && computerChoice == 2)
        ) {
            System.out.println("Result: You win! 🎉");
        } else {
            System.out.println("Result: Computer wins! 💻");
        }

        input.close();
    }

    /**
     * Converts a number into its corresponding move name.
     *
     * @param choice The numeric choice (1-3)
     * @return The name of the move (Rock, Paper, or Scissors)
     */
    public static String getMoveName(int choice) {
        switch (choice) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "Invalid choice";
        }
    }
}

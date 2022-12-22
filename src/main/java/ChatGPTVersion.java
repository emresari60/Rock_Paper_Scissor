import java.util.Random;
import java.util.Scanner;

public class ChatGPTVersion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] options = {"rock", "paper", "scissors"};

        // Game loop
        while (true) {
            // Get player's choice
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String playerChoice = sc.nextLine();

            // Make sure player's choice is valid
            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            // Generate random computer choice
            String computerChoice = options[rand.nextInt(3)];

            // Determine winner
            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if (playerChoice.equals("rock") && computerChoice.equals("scissors") ||
                    playerChoice.equals("paper") && computerChoice.equals("rock") ||
                    playerChoice.equals("scissors") && computerChoice.equals("paper")) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }

            // Ask if player wants to play again
            System.out.print("Play again? (y/n): ");
            String playAgain = sc.nextLine();
            if (!playAgain.equals("y")) {
                break;
            }
        }
    }
}
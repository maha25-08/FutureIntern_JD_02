import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Enter 0 for Rock, 1 for Paper, or 2 for Scissors.");

        
        while (true) {
            
            System.out.print("Your choice: ");
            int userChoice = scanner.nextInt();

            
            int computerChoice = random.nextInt(3);

            
            System.out.println("Computer chose: " + computerChoice);

            
            if (userChoice == computerChoice) {
                System.out.println("It's a tie!");
            } else if (userChoice == 0 && computerChoice == 2 || 
                       userChoice == 1 && computerChoice == 0 || 
                       userChoice == 2 && computerChoice == 1) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }

            
            System.out.print("Play again? Enter 1 for yes, 0 for no: ");
            int playAgain = scanner.nextInt();
            if (playAgain == 0) {
                break;
            }
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}

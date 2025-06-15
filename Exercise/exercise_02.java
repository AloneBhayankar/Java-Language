// Ex-2. Write java program for rock, paper, and scissor game. (1-Rock, 2-Paper, 3-Scissor)
package Exercise;
import java.util.Scanner;
public class exercise_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice from 1-Rock, 2-Paper, 3-Scissor: ");
        int player_choice = scanner.nextInt();
        if (player_choice < 1 || player_choice > 3) {
            System.out.println("Invalid choice! Please enter 1, 2, or 3.");
        }
        int computer_choice = (int) (Math.random() * 3 + 1);
        System.out.println("Computer choice: " + computer_choice);
        if (player_choice == computer_choice) {
            System.out.println("Draw");
        } else if ((player_choice == 1 && computer_choice == 3) || (player_choice == 2 && computer_choice == 1) ||
                (player_choice == 3 && computer_choice == 2)) {
            System.out.println("You win! :) ");
        } else {
            System.out.println("You lose :( Better luck next time!");
        }
        scanner.close();
    }
}
// Output:
// Enter your choice from 1-Rock, 2-Paper, 3-Scissor: 1
// Computer choice: 3
// You win! :)
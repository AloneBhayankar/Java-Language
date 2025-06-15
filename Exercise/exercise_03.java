// Ex-3. Create a class Game, which allows a user to play "Guess the number" game once.
// Game should have following methods:
// 1. Constructor to generate a random number between 1 and 100.
// 2. takeUserInput() to take user input.
// 3. isCorrectNumber() to check the guess.
// 4. getter and setter for noOfGuesses (use properties noOfGuesses(int), etc to get this task done)

package Exercise;
import java.util.Scanner;
import java.util.Random;
class Game {
    private int numberToGuess;
    private int userGuess;
    private int noOfGuesses;
    // 1. Constructor - generates a random number between 1 and 100
    public Game() {
        Random rand = new Random();
        numberToGuess = rand.nextInt(100) + 1;
        noOfGuesses = 0;
    }
    // 2. Method to take user input
    public void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess a number between 1 and 100: ");
        userGuess = sc.nextInt();
        noOfGuesses++;
    }
    // 3. Method to check if user guess is correct
    public boolean isCorrectNumber() {
        if (userGuess == numberToGuess) {
            System.out.println("Congratulations! You guessed the correct number.");
            System.out.println("Total guesses: " + noOfGuesses);
            return true;
        } else if (userGuess < numberToGuess) {
            System.out.println("Too low...");
        } else {
            System.out.println("Too high...");
        }
        return false;
    }
    // 4. Getter for number of guesses
    public int getNoOfGuesses() {
        return noOfGuesses;
    }
    // 4. Setter (optional, not commonly used here but added as per requirement)
    public void setNoOfGuesses(int guesses) {
        this.noOfGuesses = guesses;
    }
}
public class exercise_03 {
    public static void main(String[] args) {
        Game g = new Game();
        boolean correct = false;
        while (!correct) {
            g.takeUserInput();
            correct = g.isCorrectNumber();
        }
    }
}
// Output:
// Guess a number between 1 and 100: 25
// Too low...
// Guess a number between 1 and 100: 50
// Too high...
// Guess a number between 1 and 100: 28
// Congratulations! You guessed the correct number.
// Total guesses: 3
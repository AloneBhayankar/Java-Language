// 3. Use comparison operators to find out whether a given number 50 is greater than the user entered number or not.
package Chapter_2;
import java.util.Scanner;
public class problem_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int givenNumber = 50;

        System.out.print("Enter a number: ");
        int userNumber = scanner.nextInt();

        if (givenNumber > userNumber) {
            System.out.println(
                    "The given number " + givenNumber + " is greater than the entered number " + userNumber + ".");
        } else if (givenNumber < userNumber) {
            System.out.println(
                    "The given number " + givenNumber + " is less than the entered number " + userNumber + ".");
        } else {
            System.out.println("The given number and the entered number are equal.");
        }

        scanner.close();
    }
}

// Output:
// Enter a number: 45
// The given number 50 is greater than the entered number 45.
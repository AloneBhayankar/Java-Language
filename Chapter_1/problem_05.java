// 5. Write a java program to detect whether a number entered by user is integer or not.

import java.util.Scanner;  
public class problem_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println(number + " is an integer.");
        } else {
            System.out.println("The entered input is not an integer.");
        }
        scanner.close();
    }
}

// Output:
// Enter a number: 45.68
// The entered input is not an integer.
// Ex-1. Write A Program to calculate percentage of A given student in CBSE board exam. His 'marks from 5 Subjects must be taken as input from the keyboard (Marks are out of 100).   // cspell:ignore CBSE

package Exercise;
import java.util.Scanner;  // Import Scanner class for input

public class exercise_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // Create a Scanner object to read input from the user
        
        float subject1, subject2, subject3, subject4, subject5;
        float total, percentage;    // Declare variables to store marks for 5 subjects

        System.out.print("Enter marks for Subject 1 (out of 100): ");
        subject1 = scanner.nextFloat();
        
        System.out.print("Enter marks for Subject 2 (out of 100): ");
        subject2 = scanner.nextFloat();
        
        System.out.print("Enter marks for Subject 3 (out of 100): ");
        subject3 = scanner.nextFloat();
        
        System.out.print("Enter marks for Subject 4 (out of 100): ");
        subject4 = scanner.nextFloat();
        
        System.out.print("Enter marks for Subject 5 (out of 100): ");
        subject5 = scanner.nextFloat();

        total = subject1 + subject2 + subject3 + subject4 + subject5;

        percentage = (total / 500) * 100;

        System.out.println("\nTotal Marks: " + total + " / 500");
        System.out.println("Percentage: " + percentage + "%");

        scanner.close();
    }
}

// Output:
// Enter marks for Subject 1 (out of 100): 68
// Enter marks for Subject 2 (out of 100): 72
// Enter marks for Subject 3 (out of 100): 84
// Enter marks for Subject 4 (out of 100): 69
// Enter marks for Subject 5 (out of 100): 78

// Total Marks: 371.0 / 500
// Percentage: 74.2% 

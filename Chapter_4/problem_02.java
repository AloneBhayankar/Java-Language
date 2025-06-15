// 2. Write a program to find out whether a student is passed or failed; if it requires total 40% and at least 33% in each subject to pass. Assume 3 subjects and take marks as an input from the user.
package Chapter_4;
import java.util.Scanner;
public class problem_02 {
    public static void main(String[] args) {
        byte m1, m2, m3;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks of subject 1: ");
        m1 = scanner.nextByte();
        System.out.print("Enter marks of subject 2: ");
        m2 = scanner.nextByte();
        System.out.print("Enter marks of subject 3: ");
        m3 = scanner.nextByte();
        float avg = (m1 + m2 + m3) / 3.0f;
        System.out.printf("Overall percentage: %%%.2f\n", avg);
        // %% prints a literal percent sign %
        // %.2f formats the float to 2 decimal places.
        if (m1 >= 33 && m2 >= 33 && m3 >= 33 && avg >= 40) {
            System.out.println("Congratulations! The student is passed.");
        } else {
            System.out.println("Sorry try again! The student is failed.");
        }
        scanner.close();
    }
}
// output:
// Enter marks of subject 1: 68
// Enter marks of subject 2: 74
// Enter marks of subject 3: 81
// Overall percentage: %74.33
// Congratulations! The student is passed.
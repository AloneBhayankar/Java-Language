 // 5. Write a program to find the factorial of a given number using for loops.
package Chapter_5;
import java.util.Scanner;
public class problem_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
        scanner.close();
    }
}
// Output: (Factorial n = n * n-1 * n-2 ..... 1)
// Enter a number: 5 (5! = 5*4*3*2*1 = 120)
// Factorial of 5 is: 120
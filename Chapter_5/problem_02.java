// 2. Write a program to sum first n even numbers using a while loop.
package Chapter_5;
import java.util.Scanner;
public class problem_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + (2 * i);
        }
        System.out.println("Sum of first " + n + " even numbers is: " + sum);
        scanner.close();
    }
}
// Output:
// Enter a number: 4
// Sum of first 4 even numbers is: 12
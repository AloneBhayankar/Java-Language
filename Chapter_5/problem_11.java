// 11. Repeat problem 2 using while loop.
package Chapter_5;
import java.util.Scanner;
public class problem_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int sum = 0, i = 0;
        while (i < n) {
            sum = sum + (2 * i);
            i++;
        }
        System.out.println("Sum of first " + n + " even numbers is: " + sum);
        scanner.close();
    }
}
// Output:
// Enter a number: 5
// Sum of first 5 even numbers is: 20
// 3. Write a recursive function to calculate the sum of first n natural numbers
package Chapter_7;
import java.util.Scanner;
public class problem_03 {
    static int sum_recursive_fn(int n) {
        if (n == 1) {        // Base condition
            return 1;
        }
        return n + sum_recursive_fn(n - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println("Sum of first " + n + " natural numbers is: " + sum_recursive_fn(n));
        scanner.close();
    }
}
// Output:
// Enter a number: 3
// Sum of first 3 natural numbers is: 6

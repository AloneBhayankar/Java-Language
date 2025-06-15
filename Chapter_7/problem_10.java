// 10. Repeat 3rd using iterative approach.
package Chapter_7;
import java.util.Scanner;
public class problem_10 {
    static int sum_iterative_fn(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println("Sum of first " + n + " natural numbers is: " + sum_iterative_fn(n));
        scanner.close();
    }
}
// Output:
// Enter a number: 4
// Sum of first 4 natural numbers is: 10
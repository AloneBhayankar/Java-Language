// 5. Write a function to print nth term of Fibonacci series using recursion.
package Chapter_7;
import java.util.Scanner;
public class problem_05 {
    static int fib(int n) {
        if (n == 1) {                  // if (n == 1 || n == 2) {
            return 0;                  //        return n - 1;  
        } else if (n == 2) {           //      }
            return 1;                  // shortcut
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println("The " + n + "th term of Fibonacci series is: " + fib(n));
        scanner.close();
    }
}
// Output: Fibonacci Series- 0, 1, 1, 2, 3, 5, 8
// Enter a number: 6
// The 6th term of Fibonacci series is: 8



// 4. Write a program to print a multiplication table of 10 in reverse order.
package Chapter_5;
import java.util.Scanner;
public class problem_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        for (int i = 10; i > 0; i--) {
            System.out.printf("%d X %d = %d\n", n, i, n*i);
        }
        scanner.close();
    }
}
// Output: Same as problem_03 but reverse loop that will print table in reverse order.
// Enter a number: 5
// 5 X 10 = 50
// 5 X 9 = 45...
// 1. Write a java method to print multiplication table of a given number.
package Chapter_7;
import java.util.Scanner;
public class problem_01 {
    static void multiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n", n, i, n * i);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        multiplicationTable(n);
        scanner.close();
    }
}
// Output:
// Enter a number: 7
// 7 X 1 = 7        7 X 6 = 42
// 7 X 2 = 14       7 X 7 = 49
// 7 X 3 = 21       7 X 8 = 56
// 7 X 4 = 28       7 X 9 = 63
// 7 X 5 = 35       7 X 10 = 70

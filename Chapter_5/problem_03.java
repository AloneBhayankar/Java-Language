// 3.  Write a program to print the multiplication table of a given number n.
package Chapter_5;
import java.util.Scanner;
public class problem_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n", n, i, n*i);
        }
        scanner.close();
    }
}
// Output:
// Enter a number: 5
// 5 X 1 = 5    5 X 6 = 30
// 5 X 2 = 10   5 X 7 = 35
// 5 X 3 = 15   5 X 8 = 40 
// 5 X 4 = 20   5 X 9 = 45 
// 5 X 5 = 25   5 X 10 = 50


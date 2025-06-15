// 7. Repeat 4th problem using recursion.
package Chapter_7;
import java.util.Scanner;
public class problem_07 {
    static void printStars(int count) {
        if (count == 0) {
            return;
        }
        System.out.print("*");
        printStars(count - 1);
    }
    static void Pattern(int n) {
        if (n == 0) {
            return;
        }
        printStars(n);
        System.out.println();
        Pattern(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        Pattern(n);
        scanner.close();
    }
}
// Output:
// Enter the number of rows: 4
// ****
// *** 
// **  
// *
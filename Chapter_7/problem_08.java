// 8. Repeat 2nd problem using recursion.
package Chapter_7;
import java.util.Scanner;
public class problem_08 {
    static void printStars(int count) {
        if (count == 0) {
            return;
        }
        printStars(count - 1);
        System.out.print("*");
    }
    static void Pattern(int n, int currentRow) {
        if (currentRow > n) {
            return;
        }
        printStars(currentRow); // Print stars for current row
        System.out.println();   // Move to next line
        Pattern(n, currentRow + 1); // Recurse for next row
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        Pattern(n, 1); // Start from row 1
        scanner.close();
    }
}
// Output:
// Enter the number of rows: 4
// *
// **
// ***
// ****

// 2. Write a program using function to print the pattern given below.
// *
// * *
// * * *
// * * * *
package Chapter_7;
import java.util.Scanner;
public class problem_02 {
    static void Pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        Pattern(n);
        scanner.close();
    }
}
// Output: Enter the number of rows: 4
// *   
// **  
// *** 
// ****
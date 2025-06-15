// 6. Repeat problem 5 using a while loop. 
package Chapter_5;
import java.util.Scanner;
public class problem_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int fact = 1;
        int i = 1;
        while (i <= n) {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
        scanner.close();
    }
}
// Output: Enter a number: 5 | Factorial of 5 is: 120 

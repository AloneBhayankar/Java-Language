// 5. Write a java program to find whether a year entered by the user is leap year or not.
package Chapter_4;
import java.util.Scanner;
public class problem_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        scanner.close();
    }
}
// Output:               ✅ Leap Year Rule- A year is a leap year if:
// Enter a year: 2000    It is divisible by 4 AND Not divisible by 100 OR Divisible by 400
// 2000 is a leap year.
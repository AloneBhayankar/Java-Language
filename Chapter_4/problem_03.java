// 3. Calculate income tax paid by an employee to the government as per the slabs mentioned below:
// Income-Slab     Tax
// 2.5L-5L         5%
// 5L-10L          20% 
// 10L and above   30%
// NOTE: There is no tax on below 2.5L, take input from the user.
package Chapter_4;
import java.util.Scanner;
public class problem_03 {
    public static void main(String[] args) {
        float tax = 0;
        float income;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your income in Lakhs per annum: ");
        income = scanner.nextFloat();
        if (income <= 2.5f) {
            tax = 0;
        }
        else if (income > 2.5f && income <= 5f) {
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if (income > 5f && income <= 10f) {
            tax = tax + 0.05f * (income - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }
        else if (income > 10f) {
            tax = tax + 0.05f * (income - 2.5f);
            tax = tax + 0.2f * (income - 5f);
            tax = tax + 0.3f * (income - 10f);
        }
        System.out.println("The tax to be paid is: " + tax);
        scanner.close();
    }
}
// Output:
// Enter your income in Lakhs per annum: 5
// The tax to be paid is: 0.125
// 2. Write a program to find out whether a given integer is present in an array or not.
package Chapter_6;
import java.util.Scanner;
public class problem_02 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(num + " is present in the array.");
        } else {
            System.out.println(num + " is not present in the array.");
        }
        scanner.close();
    }
}
// Output:
// Enter a number: 6
// 6 is present in the array.
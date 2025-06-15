// 1. Create an array of 5 floats and calculate their sum.
package Chapter_6;
import java.util.Scanner;
public class problem_01 {
    public static void main(String[] args) {
        float[] arr = new float[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextFloat();
        }
        float sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of the array is: " + sum);
        scanner.close();
    }
}
// Output:
// Enter 5 numbers:
// 25.35
// 45.24
// 96.17
// 32.58
// 78.94
// Sum of the array is: 278.28003

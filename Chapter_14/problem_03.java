// 3/4. Write a program that allows you to keep accessing an array until a valid index is given, if max retries exceed 5 print "Error", modify program to throw a custom exception if max retries are reached.

package Chapter_14;
import java.util.Scanner;
class ExceededException extends Exception {
    public ExceededException(String message) {
        super(message);
    }
}
public class problem_03 {
    public static void main(String[] args) {
        boolean flag = true;
        int[] marks = new int[3];
        marks[0] = 45;
        marks[1] = 67;
        marks[2] = 63;
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
        try {
            while (flag && i < 5) {
                System.out.println("Enter the value of index: ");
                index = sc.nextInt();
                try {
                    System.out.println("The value of marks[" + index + "] is: " + marks[index]);
                    break;  // Exit the loop on successful access
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Invalid index");
                    i++;
                }
            }
            if (i >= 5) {
                throw new ExceededException("Error: Maximum retry limit exceeded.");
            }
        } catch (ExceededException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
// Output:
// Enter the value of index: 10         Enter the value of index: 1
// Invalid index                        The value of marks[1] is: 67
// Enter the value of index: 20
// Invalid index
// Enter the value of index: 30
// Invalid index
// Enter the value of index: 40
// Invalid index
// Enter the value of index: 50
// Invalid index
// Error: Maximum retry limit exceeded.
// 6. Write a Java program to find the maximum element in an array.
package Chapter_6;

public class problem_06 {
    public static void main(String[] args) {
        int[] arr = { 54, 24, 65, 78, 85, 75, 45, 99 };
        int max = 0;
        for (int element : arr) {
            if (element > max) {
                max = element;
            }
        }
        System.out.println("The maximum element in the array is: " + max);
    }
}
// Output: The maximum element in the array is: 99
// 7. Write a Java program to find the maximum element in a Java array.
package Chapter_6;
public class problem_07 {
    public static void main(String[] args) {
        int[] arr = { 54, 24, 65, 5, 85, 75, 45, 99 };
        int min = Integer.MIN_VALUE;
        for (int element : arr) {
            if (element < min) {
                min = element;
            }
        }
        System.out.println("The minimum element in the array is: " + min);
    }
}
// Output: The maximum element in the array is: 5

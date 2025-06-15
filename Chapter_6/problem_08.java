// 8. Write a Java program to find whether an array is sorted or not.
package Chapter_6;
public class problem_08 {
    public static void main(String[] args) {
        boolean isSorted = true;
        int[] arr = { 1, 12, 3, 41, 5, 34, 67 };
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("The Array is sorted");
        } else {
            System.out.println("The Array is not sorted");
        }
    }
}
// Output: The Array is not sorted

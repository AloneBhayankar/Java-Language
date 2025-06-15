// 5. Write a Java program to reverse an array.
package Chapter_6;
public class problem_05 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int l = arr.length;     // l = 10
        int n = Math.floorDiv(l, 2);    // n = 5 (only need to swap first half)
        int temp;
        for (int i = 0; i < n; i++) {   
            // Swap arr[i] and arr[l-1-i]
            temp = arr[i];              //  a    b   temp      // Swap arr[i] and arr[l-1-i]
            arr[i] = arr[l - i - 1];    // |4|  |3|   ||       // Copy right element to left
            arr[l - i - 1] = temp;      // Move saved left to right
        }
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
// Output: 10 9 8 7 6 5 4 3 2 1
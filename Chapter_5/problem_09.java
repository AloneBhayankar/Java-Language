// 9. Write a program to calculate the sum of the numbers occurring in the multiplication table of 8.
package Chapter_5;
public class problem_09 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + (8 * i);
        }
        System.out.println("Sum of numbers in the multiplication table of 8 is: " + sum);
    }
}
// Output: Sum of numbers in the multiplication table of 8 is: 440
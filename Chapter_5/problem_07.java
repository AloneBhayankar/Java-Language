// 7. Repeat problem 1 using while loop. (Output: Pattern)
package Chapter_5;
public class problem_07 {
    public static void main(String[] args) {
        int i = 4;
        while (i > 0) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
    }
}

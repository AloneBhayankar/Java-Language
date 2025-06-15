// 4. Write a java program to detect double and triple spaces in a string.
package Chapter_3;
public class problem_04 {
    public static void main(String[] args) {
        String space = "This string contains   double and triple spaces.";
        System.out.println(space.indexOf("  "));    // Output: 20
        System.out.println(space.indexOf("   "));   // Output: 20
    }
}

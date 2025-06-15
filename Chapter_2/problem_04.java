// 4. Write the following expression in a java program: (v^2-u^2)/2as
package Chapter_2;
public class problem_04 {
    public static void main(String[] args) {
        int v = 5, u = 3, a = 2, s = 3;
        System.out.println((v * v - u * u) / (2 * a * s));
    }
}

// Output: 1
// v² - u² = 16
// 2 * a * s = 2 * 2 * 3 = 12
// 16 / 12 = 1 (it's int)
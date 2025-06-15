// 2. Write a java program that prints "haha" during ArithmeticException and "hehe" during IllegalArgumentException. cspell:ignore haha, hehe

package Chapter_14;
public class problem_02 {
    public static void main(String[] args) {
        try {       // Triggering ArithmeticException (e.g., division by zero)
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("haha"); // This will be printed when ArithmeticException occurs
        } catch (IllegalArgumentException e) {
            System.out.println("hehe"); // This will be printed when IllegalArgumentException occurs
        }
    }
}

// 6. Write a function to find average of a set of numbers passed as an argument.
package Chapter_7;
public class problem_06 {
    static double findAverage(int... numbers) {
        if (numbers.length == 0) {
            return 0; // Avoid division by zero
        }
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }
    public static void main(String[] args) {
        double avg1 = findAverage(10, 20, 30, 40, 50);
        System.out.println("Average 1: " + avg1);
        double avg2 = findAverage(75, 64, 82, 58, 35);
        System.out.println("Average 2: " + avg2);
    }
}
// Output:
// Average 1: 30.0
// Average 2: 62.8
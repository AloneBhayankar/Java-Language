// 9. Write a function to convert celsius temperature to fahrenheit.
package Chapter_7;
import java.util.Scanner;
public class problem_09 {
    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius:");
        double celsius = scanner.nextDouble();
        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit");
        scanner.close();
    }
}
// Output:
// Enter the temperature in Celsius:32.6
// 32.6 degrees Celsius is equal to 90.68 degrees Fahrenheit
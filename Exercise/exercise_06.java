// Ex-6. You have to create a custom calculator with following operations:
// 1. Addition
// 2. Subtraction
// 3. Multiplication
// 4. Division
// which throws the following exceptions:
// 1. Invalid input exception: eg. 8 & 9
// 2. Cannot divide by 8 & 0 exception
// 3. Max input exception if any of the inputs is greater than 100000
// 4. Max multiplier reached exception - Don't allow any multiplication input to be greater than 7000.

package Exercise;
import java.util.Scanner;
class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}
class CannotDivideBy8Or0Exception extends Exception {
    public CannotDivideBy8Or0Exception(String message) {
        super(message);
    }
}
class MaxInputException extends Exception {
    public MaxInputException(String message) {
        super(message);
    }
}
class MaxMultiplierReachedException extends Exception {
    public MaxMultiplierReachedException(String message) {
        super(message);
    }
}
class CustomCalculator {
    private void checkMaxInput(double a, double b) throws MaxInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException("Input cannot be greater than 100000.");
        }
    }
    public double add(double a, double b) throws InvalidInputException, MaxInputException {
        checkMaxInput(a, b);
        if ((a == 8 && b == 9) || (a == 9 && b == 8)) {
            throw new InvalidInputException("Invalid input: combination of 8 and 9 not allowed.");
        }
        return a + b;
    }
    public double subtract(double a, double b) throws InvalidInputException, MaxInputException {
        checkMaxInput(a, b);
        if ((a == 8 && b == 9) || (a == 9 && b == 8)) {
            throw new InvalidInputException("Invalid input: combination of 8 and 9 not allowed.");
        }
        return a - b;
    }
    public double multiply(double a, double b) throws MaxInputException, MaxMultiplierReachedException {
        checkMaxInput(a, b);
        if (a > 7000 || b > 7000) {
            throw new MaxMultiplierReachedException("Multiplication input cannot be greater than 7000.");
        }
        return a * b;
    }
    public double divide(double a, double b) throws MaxInputException, CannotDivideBy8Or0Exception {
        checkMaxInput(a, b);
        if (b == 8 || b == 0) {
            throw new CannotDivideBy8Or0Exception("Cannot divide by 8 or 0.");
        }
        return a / b;
    }
}
public class exercise_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomCalculator calculator = new CustomCalculator();
        try {
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();
            System.out.println("Addition: " + calculator.add(num1, num2));
            System.out.println("Subtraction: " + calculator.subtract(num1, num2));
            System.out.println("Multiplication: " + calculator.multiply(num1, num2));
            System.out.println("Division: " + calculator.divide(num1, num2));
        } catch (InvalidInputException | CannotDivideBy8Or0Exception |
                 MaxInputException | MaxMultiplierReachedException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
// Output:
// Enter first number: 8
// Enter second number: 9
// Error: Invalid input: combination of 8 and 9 not allowed.

// Enter first number: 20
// Enter second number: 0
// Addition: 20.0
// Subtraction: 20.0
// Multiplication: 0.0
// Error: Cannot divide by 8 or 0.

// Enter first number: 100005
// Enter second number: 2
// Error: Input cannot be greater than 100000.

// Enter first number: 8000
// Enter second number: 10
// Addition: 8010.0
// Subtraction: 7990.0
// Error: Multiplication input cannot be greater than 7000.

// Enter first number: 10
// Enter second number: 2
// Addition: 12.0
// Subtraction: 8.0
// Multiplication: 20.0
// Division: 5.0


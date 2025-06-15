// 4. Write a java program to convert kilometers into miles.

import java.util.Scanner; 
public class problem_04 {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: "); 
        double kilometers = scanner.nextDouble(); 
        double miles = kilometers * 0.621371;
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles."); 
        scanner.close();
    }
}

// Output:
// Enter distance in kilometers: 5
// 5.0 kilometers is equal to 3.106855 miles.
// 1. Write a java program to demonstrate syntax, logical, and runtime errors.

package Chapter_14;
public class problem_01 {
    public static void main(String[] args) {
        // Syntax Error --> int a = 8  (Semicolon missing at the end) 
        // Logical Error --> int age = 50; int year_born = 2000 - 50;
        // Runtime Error --> System.out.println(5/0);   (ArithmeticException)   
    }
}
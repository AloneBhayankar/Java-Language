// 4. Create a class rectangle & repeat problem 3.

import java.util.Scanner;
class Rectangle {
    int length;
    int breadth;
    public void setDimensions(int l, int b) {
        length = l;
        breadth = b;
    }
    public int area() {
        return length * breadth;
    }
    public int perimeter() {
        return 2 * (length + breadth);
    }
}
public class problem_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rect = new Rectangle();
        System.out.print("Enter the length of the rectangle: ");
        int length = scanner.nextInt();
        System.out.print("Enter the breadth of the rectangle: ");
        int breadth = scanner.nextInt();
        rect.setDimensions(length, breadth);
        System.out.println("\nRectangle Details:");
        System.out.println("Length: " + rect.length);
        System.out.println("Breadth: " + rect.breadth);
        System.out.println("Area: " + rect.area());
        System.out.println("Perimeter: " + rect.perimeter());
        scanner.close();
    }
}
// Output:
// Enter the length of the rectangle: 7
// Enter the breadth of the rectangle: 4
// Rectangle Details:
// Length: 7
// Breadth: 4        
// Area: 28
// Perimeter: 22
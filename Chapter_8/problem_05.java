// 5. Repeat problem 4 for circle. 

import java.util.Scanner;
class Circle {
    float radius;
    public void setRadius(float r) {
        radius = r;
    }
    public float area() {
        return (float)(3.14f * radius * radius);
    }
    public float perimeter() {
        return (float)(2 * 3.14f * radius);
    }
}
public class problem_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();
        System.out.print("Enter the radius of the circle: ");
        float r = scanner.nextFloat();
        circle.setRadius(r);
        System.out.println("\nCircle Details:");
        System.out.println("Radius: " + circle.radius);
        System.out.printf("Area: %.2f\n", circle.area());
        System.out.printf("Perimeter (Circumference): %.2f\n", circle.perimeter());
        scanner.close();
    }
}
// Output:
// Enter the radius of the circle: 5
// Circle Details:
// Radius: 5.0
// Area: 78.50
// Perimeter (Circumference): 31.40
// 1. Create a class circle and use inheritance to create another class cylinder from it.

package Chapter_10;
import java.util.Scanner;
class Circle {
    float radius;
    public Circle(float radius) {   // Constructor
        this.radius = radius;
    }
    public float area() {           // Method for area
        return (float)(Math.PI * radius * radius);
    }
    public float circumference() {      // Method for circumference
        return (float)(2 * Math.PI * radius);
    }
}
// Cylinder class inherits from Circle
class Cylinder extends Circle {
    float height;
    public Cylinder(float radius, float height) {   // Constructor
        super(radius);  // Call the parent (Circle) constructor
        this.height = height;
    }
    public float volume() {     // Method for volume
        return area() * height;  // Volume = Area of base * height
    }
    public float surfaceArea() {        // Method for surface area
        return (float)(2 * Math.PI * radius * (radius + height)); 
    }
}
public class problem_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        float radius = sc.nextFloat();
        Circle circle = new Circle(radius);
        System.out.printf("Circle Area: %.2f\n", circle.area());
        System.out.printf("Circle Circumference: %.2f\n", circle.circumference());
        System.out.print("Enter height of cylinder: ");
        float height = sc.nextFloat();
        Cylinder cylinder = new Cylinder(radius, height);
        System.out.printf("Cylinder Volume: %.2f\n", cylinder.volume());
        System.out.printf("Cylinder Surface Area: %.2f\n", cylinder.surfaceArea());
        sc.close();
    }
}
// Output:
// Enter radius of circle: 3.6
// Circle Area: 40.71
// Circle Circumference: 22.61
// Enter height of cylinder: 6.2  
// Cylinder Volume: 252.43      
// Cylinder Surface Area: 221.67
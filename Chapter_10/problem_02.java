// 2. Create a class rectangle and use inheritance to create another class cuboid, try to keep it as close to real world scenario as possible.

package Chapter_10;
import java.util.Scanner;
class Rectangle {       // Base class Rectangle
    float length;
    float breadth;
    public Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public float area() {
        return length * breadth;
    }
    public float perimeter() {
        return 2 * (length + breadth);
    }
}
// Cuboid class inherits from Rectangle
class Cuboid extends Rectangle {
    float height;
    public Cuboid(float length, float breadth, float height) {
        super(length, breadth);  // Call Rectangle constructor
        this.height = height;
    }
    public float volume() {     // Volume = base area * height
        return area() * height;  
    }
    public float surfaceArea() {
        return 2 * (length * breadth + breadth * height + height * length);
    }
}
public class problem_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input for Rectangle
        System.out.print("Enter length of rectangle: ");
        float length = sc.nextFloat();
        System.out.print("Enter breadth of rectangle: ");
        float breadth = sc.nextFloat();
        Rectangle rect = new Rectangle(length, breadth);
        System.out.printf("Rectangle Area: %.2f\n", rect.area());
        System.out.printf("Rectangle Perimeter: %.2f\n", rect.perimeter());
        // Input for Cuboid
        System.out.print("Enter height of cuboid: ");
        float height = sc.nextFloat();
        Cuboid cuboid = new Cuboid(length, breadth, height);
        System.out.printf("Cuboid Volume: %.2f\n", cuboid.volume());
        System.out.printf("Cuboid Surface Area: %.2f\n", cuboid.surfaceArea());
        sc.close();
    }
}
// Output:
// Enter length of rectangle: 5
// Enter breadth of rectangle: 2.2
// Rectangle Area: 11.00     
// Rectangle Perimeter: 14.40
// Enter height of cuboid: 3.6
// Cuboid Volume: 39.60      
// Cuboid Surface Area: 73.84

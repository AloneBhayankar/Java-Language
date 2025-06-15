// 2. Use constructor for problem 1.

package Chapter_9;
import java.util.Scanner;
class Cylinder2 {
    private float radius;
    private float height;
    public Cylinder2(float r, float h) {
        radius = r;     // Constructor to initialize radius and height when an object is created
        height = h;
    }
    public float getRadius() {
        return radius;
    }
    public float getHeight() {
        return height;
    }
    public float volume() {
        return (float)(Math.PI * radius * radius * height);
    }
    public float surfaceArea() {
        return (float)(2 * Math.PI * radius * (radius + height));
    }
}
public class problem_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the cylinder: ");
        float r = sc.nextFloat();
        System.out.print("Enter height of the cylinder: ");
        float h = sc.nextFloat();
        Cylinder2 myCylinder = new Cylinder2(r, h);
        System.out.println("Radius: " + myCylinder.getRadius());
        System.out.println("Height: " + myCylinder.getHeight());
        System.out.printf("Volume: %.2f\n", myCylinder.volume());
        System.out.printf("Surface Area: %.2f\n", myCylinder.surfaceArea());
        sc.close();
    }
}
// Output:
// Enter radius of the cylinder: 9.3
// Enter height of the cylinder: 12.5
// Radius: 9.3
// Height: 12.5
// Volume: 3396.45      
// Surface Area: 1273.85
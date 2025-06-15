// 3. Repeat problem 1 for sphere.

package Chapter_9;
import java.util.Scanner;
class Sphere {
    private float radius;
    public void setRadius(float r) {
        radius = r;
    }
    public float getRadius() {
        return radius;
    }
    public float volume() {     // Method to calculate volume of the sphere
        return (float)((4.0 / 3.0) * Math.PI * radius * radius * radius);
    }
    public float surfaceArea() {    // Method to calculate surface area of the sphere
        return (float)(4 * Math.PI * radius * radius);
    }
}
public class problem_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sphere mySphere = new Sphere();
        System.out.print("Enter radius of the sphere: ");
        float r = sc.nextFloat();
        mySphere.setRadius(r);
        System.out.println("Radius: " + mySphere.getRadius());
        System.out.printf("Volume: %.2f\n", mySphere.volume());
        System.out.printf("Surface Area: %.2f\n", mySphere.surfaceArea());
        sc.close(); 
    }
}

// Output:
// Enter radius of the sphere: 7.5
// Radius: 7.5
// Volume: 1767.15
// Surface Area: 706.86


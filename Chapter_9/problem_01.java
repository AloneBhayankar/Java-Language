// 1/2. Create a class cylinder and use getters and setters to set its radius and height, calculate the volume and surface area of a cylinder.

package Chapter_9;
import java.util.Scanner;
class Cylinder {
    private float radius;
    private float height;
    public void setRadius(float r) {    // Setter method for radius
        radius = r;
    }
    public float getRadius() {          // Getter method for radius
        return radius;
    }  
    public void setHeight(float h) {    // Setter method for height
        height = h;
    }
    public float getHeight() {          // Getter method for height
        return height;
    }
    public float volume() {     // Method to calculate volume of the cylinder
        return (float) (Math.PI * radius * radius * height);
    }
    public float surfaceArea() {    // Method to calculate surface area of the cylinder
        return (float) (2 * Math.PI * radius * (radius + height));
    }
}
public class problem_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cylinder myCylinder = new Cylinder();
        System.out.print("Enter radius of the cylinder: ");
        float r = sc.nextFloat();
        myCylinder.setRadius(r); // Setting radius using setter
        System.out.print("Enter height of the cylinder: ");
        float h = sc.nextFloat();
        myCylinder.setHeight(h); // Setting height using setter
        System.out.println("Radius: " + myCylinder.getRadius());
        System.out.println("Height: " + myCylinder.getHeight());
        System.out.printf("Volume: %.2f\n", myCylinder.volume());
        System.out.printf("Surface Area: %.2f\n", myCylinder.surfaceArea());
        sc.close();
    }
}

// Output:
// Enter radius of the cylinder: 25.32
// Enter height of the cylinder: 42.78
// Radius: 25.32
// Height: 42.78
// Volume: 86162.45
// Surface Area: 10834.05


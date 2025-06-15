// 4. Overload a constructor used to initiate a rectangle of length 4 and height 5 for using custom parameters.

package Chapter_9;
class Rectangle {
    private float length;
    private float height;
    public Rectangle() {
        this.length = 4;
        this.height = 5;
    }
    public Rectangle(float length, float height) {
        this.length = length;
        this.height = height;
    }
    public float getLength() {
        return length;
    }
    public float getHeight() {
        return height;
    }
    public float area() {
        return length * height;
    }
}
public class problem_04 {
    public static void main(String[] args) {
        // Using default constructor
        Rectangle defaultRect = new Rectangle();
        System.out.println("Default Rectangle:");
        System.out.println("Length: " + defaultRect.getLength());
        System.out.println("Height: " + defaultRect.getHeight());
        System.out.println("Area: " + defaultRect.area());
        // Using parameterized constructor
        Rectangle customRect = new Rectangle(10, 8);
        System.out.println("\nCustom Rectangle:");
        System.out.println("Length: " + customRect.getLength());
        System.out.println("Height: " + customRect.getHeight());
        System.out.println("Area: " + customRect.area());
    }
}
// Output:
// Default Rectangle:        Custom Rectangle:
// Length: 4.0               Length: 10.0 
// Height: 5.0               Height: 8.0 
// Area: 20.0                Area: 80.0

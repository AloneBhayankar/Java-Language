// 1/2. Create an abstract class pen with methods write() and refill() as abstract methods, use the pen class to create a concrete class fountainPen with additional method changeNib().

package Chapter_11;
abstract class Pen {
    abstract void write();
    abstract void refill();
}
class fountainPen extends Pen {
    void write() {
        System.out.println("Writing with fountain pen.");
    }
    void refill() {
        System.out.println("Refilling fountain pen.");
    }
    void changeNib() {
        System.out.println("Changing nib of fountain pen.");
    }
}
public class problem_01  {
    public static void main(String[] args) {
        fountainPen pen = new fountainPen();
        pen.write();
        pen.refill();
        pen.changeNib();
    }
}
// Output:
// Writing with fountain pen.
// Refilling fountain pen.      
// Changing nib of fountain pen.
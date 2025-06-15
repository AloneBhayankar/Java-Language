// 1. Create an ArrayList and store names of 10 students inside it, print it using for each loop.

package Chapter_15;
import java.util.ArrayList;
public class problem_01 {
    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList<>();
        ar.add("Student-1");
        ar.add("Student-2");
        ar.add("Student-3");
        ar.add("Student-4");
        ar.add("Student-5");
        ar.add("Student-6");
        ar.add("Student-7");
        ar.add("Student-8");
        ar.add("Student-9");
        ar.add("Student-10");
        for (String Object : ar) {
            System.out.println(Object);
        }     
    }
}
// Output:
// Student-1    Student-4   Student-7   Student-10
// Student-2    Student-5   Student-8
// Student-3    Student-6   Student-9

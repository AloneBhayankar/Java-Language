// 5. Create a set in java. Try to store duplicate elements inside this set and verify that only one instance is stored.

package Chapter_15;
import java.util.HashSet;
import java.util.Set;
public class problem_05 {
    public static void main(String[] args) {
        // Create a HashSet of Integers
        Set<Integer> marks = new HashSet<>();   
        // Add elements, including duplicates
        marks.add(68);
        marks.add(74);
        marks.add(81);
        marks.add(68);   // Duplicate
        System.out.println("Set contents:");
        System.out.println(marks);
        // Display size to confirm duplicates are not stored
        System.out.println("Total unique elements: " + marks.size());
    }
}
// Output:
// Set contents:
// [68, 74, 81]
// Total unique elements: 3
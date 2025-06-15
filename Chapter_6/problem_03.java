// 3. Calculate the average marks from an array containing marks of all students in physics using a for-each loop.
package Chapter_6;
public class problem_03 {
    public static void main(String[] args) {
        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 70.0f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("The value of average marks is " + sum/marks.length);
    }
}
// Output: The value of average marks is 69.21999
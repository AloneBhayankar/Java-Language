// 2. Use the Date class in java to print the time in following format: 21:47:02

package Chapter_15; 
import java.util.Date; 
public class problem_02 {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());
    }
}
// Output: 12:40:12

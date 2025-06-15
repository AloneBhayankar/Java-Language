// 3. Repeat problem 2 using Calender class.package Chapter_15;

package Chapter_15;
import java.util.Calendar;
public class problem_03 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND)); 
    }
}
// Output: 12:46:43
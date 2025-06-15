// 4. Repeat problem 2 using the java.time API.

package Chapter_15;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class problem_04 {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss");
        String time = dt.format(df);
        System.out.println(time);
    }    
}
// Output: 12:50:40

// 6. Write a program to find out the type of website from the url entered by the user.
// .com - Commercial website
// .org - Organization website
// .in - Indian website
package Chapter_4;
import java.util.Scanner;
public class problem_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a URL: ");
        String url = scanner.next();
        if (url.endsWith(".com")) {
            System.out.println("This is a Commercial website");
        } else if (url.endsWith(".org")) {
            System.out.println("This is an Organization website");
        } else if (url.endsWith(".in")) {
            System.out.println("This is an Indian website");
        } else {
            System.out.println("Unknown website");
        }
        scanner.close();
    }
}
// Output:
// Enter a URL: google.com
// This is a Commercial website

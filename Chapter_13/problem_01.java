// 1/2. Write a program to print "Good Morning" and "Welcome" continuously (100 times) using thread, Add a sleep method in welcome thread to delay its execution for 200ms.

package Chapter_13;
class GoodMorningThread extends Thread {
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("Good Morning");
            i++;
        }       
    }
}
class WelcomeThread extends Thread {
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("Welcome");
            try {
                Thread.sleep(200); // 200 milliseconds delay
            } catch (InterruptedException e) {
                System.out.println("Welcome thread interrupted");
            }
            i++;
        }
    }
}
public class problem_01 {
    public static void main(String[] args) {
        GoodMorningThread gm = new GoodMorningThread();
        WelcomeThread wc = new WelcomeThread();
        gm.start();
        wc.start();
    }
}
// Output: 
// Good Morning
// Good Morning
// Welcome
// Welcome
// Good Morning
// Good Morning
// ..... runs continuously

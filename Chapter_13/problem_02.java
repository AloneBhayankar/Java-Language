// 3. Demonstrate getPriority() and setPriority() methods in java threads.

package Chapter_13;
class Thread1 extends Thread{
    public void run(){
        System.out.println("Thread 1 is running");
    }
}
class Thread2 extends Thread{
    public void run(){
        System.out.println("Thread 2 is running");
    }
}
class Thread3 extends Thread{
    public void run(){
        System.out.println("Thread 3 is running");
    }
}
public class problem_02 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();
        t1.setPriority(Thread.MIN_PRIORITY);  // Priority 1
        t2.setPriority(7);
        t3.setPriority(Thread.MAX_PRIORITY); // Priority 10
        System.out.println("Priority of this thread is: "+ t1.getPriority());
        System.out.println("Priority of this thread is: "+ t2.getPriority());
        System.out.println("Priority of this thread is: "+ t3.getPriority());
    }
}
// Output:
// Priority of this thread is: 1
// Priority of this thread is: 7
// Priority of this thread is: 10

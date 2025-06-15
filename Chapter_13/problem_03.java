// 4. How do you get state of a given threads in java?
// NEW – Thread has been created but not started yet.
// RUNNABLE – Thread is ready to run or running.
// BLOCKED – Thread is blocked waiting for a monitor lock.
// WAITING – Thread is waiting indefinitely for another thread.
// TIMED_WAITING – Thread is waiting for a specified amount of time.
// TERMINATED – Thread has finished execution.

package Chapter_13;
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}
public class problem_03 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        // Get state before starting
        System.out.println("State before start: " + t.getState()); // NEW
        t.start();
        System.out.println("State during execution: " + t.getState()); // RUNNABLE
        try {           // Wait for thread to finish
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Get state after completion
        System.out.println("State after termination: " + t.getState()); // TERMINATED
    }
}
// Output:
// State before start: NEW
// State during execution: RUNNABLE   
// Thread is running...
// State after termination: TERMINATED

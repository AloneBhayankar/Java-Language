// 2. Create a class cellphone with methods to print "ringing...", "vibrate..." etc.

class cellphone{
    public void ring() {
        System.out.println("Phone is Ringing...");
    }
    public void vibrate() {
        System.out.println("Phone is Vibrating...");
    }
}
public class problem_02 {
    public static void main(String[] args) {
        cellphone iphone = new cellphone();
        iphone.ring();
        iphone.vibrate();
    }
}
// Output:
// Phone is Ringing...
// Phone is Vibrating...

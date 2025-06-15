// 4/6/7. Create a class telephone with ring(), lift(), and disconnect() methods as abstract methods, Create another class smartTelephone and demonstrate polymorphism, create an interface TVRemote and use it to inherit another interface smartTVRemote, create a class Tv which implements TVRemote interface.

package Chapter_11;
abstract class Telephone {
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelephone extends Telephone {
    @Override
    void ring() {
        System.out.println("SmartTelephone is ringing...");
    }
    @Override
    void lift() {
        System.out.println("SmartTelephone call is being lifted...");
    }
    @Override
    void disconnect() {
        System.out.println("SmartTelephone call is disconnected.");
    }
    void browseInternet() {
        System.out.println("Browsing internet on SmartTelephone...");
    }
}

interface TVRemote {
    void turnOn();
    void turnOff();
}
interface SmartTVRemote extends TVRemote {
    void voiceControl();
}
class TV implements TVRemote {
    @Override
    public void turnOn() {
        System.out.println("TV is turned ON.");
    }
    @Override
    public void turnOff() {
        System.out.println("TV is turned OFF.");
    }
}
public class problem_03 {
    public static void main(String[] args) {

        // === Part 1: Demonstrate Polymorphism ===
        Telephone phone = new SmartTelephone(); // Polymorphic reference
        phone.ring();
        phone.lift();
        phone.disconnect();
        // void.browseInternet(); --> Doesn't work
        // === Part 2: Interfaces and Inheritance ===
        TV tv = new TV();
        tv.turnOn();
        tv.turnOff();
        // If using SmartTVRemote interface later:
        // You could create a SmartTV class that implements SmartTVRemote
    }
}
// Output:
// Telephone is ringing...
// SmartTelephone call is being lifted...
// SmartTelephone call is disconnected.  
// TV is turned ON.
// TV is turned OFF.
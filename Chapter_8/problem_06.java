// 6. Create a class TommyVercetti for rockstar games capable of hitting (print hitting), running, firing etc. 
// cSpell:ignore rockstar, vercetti

class TommyVercetti{
    public void hit(){
        System.out.println("Hitting the enemy...");
    }
    public void run(){
        System.out.println("Running fast...");
    }
    public void fire(){
        System.out.println("Firing the gun...");
    }
}
public class problem_06 {
    public static void main(String[] args) {
        TommyVercetti tommy = new TommyVercetti();
        tommy.hit();
        tommy.run();
        tommy.fire();
    }
}
// Output:
// Hitting the enemy...
// Running fast...  
// Firing the gun...